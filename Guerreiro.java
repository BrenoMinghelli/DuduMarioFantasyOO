package Alpha02;

import java.util.ArrayList;

/*
Bash(5) --> Perde 10% do hp para dar mais dano (2*atk e roll de 7 pra 10)
Cleave(10) --> Ataque AOE, pegando todos os inimigos, usa o BasicHit pro dano 
Taunt(15)--> Aumenta a def e obriga os inimigos a atacar ele (alguma mecanica de cooldown)
obs.O taunt poderia ser passado pelo ArrayList controle q eu tava usando, e if(taunt==1) entao nao teria um rand pra alvo

*/

public class guerreiro extends personagem{
    
    public boolean taunt=false;
    
    public guerreiro(String nome){
        super(nome,1,20,7,5);
    }
    
    @Override
    public void levelup(){  //mecanica de lvl up, quando acumular X de xp, implementado dps
        this.lvl+=1;
        this.hp+=5;
        this.atk+=3;
        this.def+=2;
        this.hpA+=5;
    }
    
    @Override
    public int atacar(int qualAtaque, ArrayList<inimigo> inimigos, int qualInimigo){
        switch (qualAtaque) {
            case 1 -> {
                return this.ataqueBasico(inimigos.get(qualInimigo));
            }
            case 2 -> {
                return this.ataqueBash(inimigos.get(qualInimigo));
            }
            case 3 -> {
                return this.ataqueCleave(inimigos);
            }
            case 4 -> {
                return this.ataqueTaunt(inimigos);
            }
            default -> { System.out.print("Ataque Invalido\n");return 0;
            }
        }
    }
    
    public int ataqueBasico(inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(7);
        dano+=(this.atk);
        inimigo.tomaDano(dano);
        return dano;
    }
    
    public int ataqueBash(inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(10);
        dano+=(2*this.atk);
        this.hpA-=(int)(this.hpA*0.1);
        inimigo.tomaDano(dano);
        
        return dano;
    }
    
    public int ataqueCleave(ArrayList<inimigo> inimigos){
        int dano=0;
        for(int i=0;i<inimigos.size();i++){
            dano+=this.ataqueBasico(inimigos.get(i));
        }
        return dano;
    }
    
    public int ataqueTaunt(ArrayList<inimigo> inimigos){
        this.taunt=true;
        this.def+=5; //colocar o numero de defesa
        return 0;
    }
    
    public void showActions(){  //mostra as ações possiveis ao jogador
        System.out.println("Turno Guerreiro");
        System.out.println("1.Ataque basico");
        if(lvl>=5){
            System.out.println("2.Cleave");
        }
        if(lvl>=10){
            System.out.println("3.Spin");
        }
    }
    
    public boolean isTaunting(){
        return this.taunt;
    }
    
    public void fimTaunt(){
        if(this.taunt){
            this.taunt=false;
            this.def-=5; //colocar o numero de defesa
        }
    }
}
