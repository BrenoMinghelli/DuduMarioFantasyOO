package Alpha02;

import java.util.ArrayList;

/*
*/
public class guerreiro extends personagem{
    
    private boolean taunt=false;
    
    public guerreiro(String nome){
        super(nome,1,20,7,5);
    }
    
    @Override
    public void levelup(){  //mecanica de lvl up, quando acumular X de xp, implementado dps
        this.setLvl(this.getLvl()+1);
        this.setHp(this.getHp()+5);
        this.setAtk(this.getAtk()+3);
        this.setDef(this.getDef()+2);
        this.setHpA(this.getHpA()+5);
    }
    
    @Override
    public int habilidades(int qualAtaque, ArrayList inimigos, int qualInimigo){
        switch (qualAtaque) {
            case 1 -> {
                return this.ataqueBasico((inimigo)inimigos.get(qualInimigo));
            }
            case 2 -> {
                if(this.getLvl()>=5){return this.ataqueBash((inimigo)inimigos.get(qualInimigo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 3 -> {
                if(this.getLvl()>=10){return this.ataqueCleave(inimigos);}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 4 -> {
                if(this.getLvl()>=15){return this.ataqueTaunt(inimigos);}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            default -> { System.out.print("Ataque Invalido\n");return 0;
            }
        }
    }
    
    public int ataqueBash(inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(10);
        dano+=(2*this.getAtk());
        this.tomaDano((int)(this.getHp()*0.1)+this.getDef()); //somar def pois ele diminui da def em tomaDano()
        System.out.print("BASH: ");
        inimigo.tomaDano(dano);
        return dano;
    }
    
    public int ataqueCleave(ArrayList<inimigo> inimigos){
        int dano=0;
        System.out.print("CLEAVE: ");
        for(int i=0;i<inimigos.size();i++){
            dano+=this.ataqueBasico(inimigos.get(i));
        }
        return dano;
    }
    
    public int ataqueTaunt(ArrayList<inimigo> inimigos){//se o taunt durar mais que 1 turno vai ser necessario checar isTaunting antes
        this.taunt=true;
        this.setDef(this.getDef()+5); //colocar o numero de defesa
        System.out.print("TAUNT: ");
        return 0;
    }
    
    public void showActions(){  //mostra as ações possiveis ao jogador
        System.out.println("1.Ataque basico");
        if(getLvl()>=5){
            System.out.println("2.Bash");
        }if(getLvl()>=10){
            System.out.println("3.Cleave");
        }if(getLvl()>=15){
            System.out.println("4.Taunt");
        }
    }
    
    public boolean isTaunting(){
        return this.taunt;
    }
    
    public void fimTaunt(){
        if(this.taunt){
            this.taunt=false;
            this.setDef(this.getDef()-5); //colocar o numero de defesa
        }
    }
}