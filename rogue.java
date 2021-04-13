package Alpha02;

import java.util.ArrayList;

/*
 */
public class rogue extends personagem{
    
    public boolean taunt=false;
    
    public rogue(String nome){
        super(nome,1,15,7,5);
    }
    
    @Override
    public void levelup(){  //mecanica de lvl up, quando acumular X de xp, implementado dps
        this.setLvl(this.getLvl()+1);
        this.setHp(this.getHp()+3);
        this.setAtk(this.getAtk()+4);
        this.setDef(this.getDef()+1);
        this.setHpA(this.getHpA()+3);
    }
    
    // ToDo limitar o nivel igual fiz nas outras classes, por enquanto ta ilimitado para teste
    @Override
    public int habilidades(int qualAtaque, ArrayList inimigos, int qualInimigo){
        switch (qualAtaque) {
            case 1 -> {
                return this.ataqueBasico((inimigo)inimigos.get(qualInimigo));
            }
            case 2 -> {
                if(this.getLvl()>=2){return this.ataqueSneak((inimigo)inimigos.get(qualInimigo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 3 -> {
                if(this.getLvl()>=5){return this.ataqueBloodyFinish((inimigo)inimigos.get(qualInimigo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 4 -> {
                if(this.getLvl()>=10){return this.ataqueDeathLotus(inimigos);}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 5 -> {
                if(this.getLvl()>=15){return this.ataqueDeathSentence((inimigo)inimigos.get(qualInimigo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            default -> { System.out.print("Ataque Invalido\n");return 0;
            }
        }
    }
    
    public int ataqueSneak(inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(10);
        dano+=(2*this.getAtk());
        System.out.print("SNEAK ATTACK: ");
        this.tomaDano((int)(this.getHp()*0.1)+this.getDef());
        inimigo.tomaDano(dano);
        return dano;
    }
    
    public int ataqueBloodyFinish(inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(10);
        dano+=(4*this.getAtk());
        System.out.print("BLOODY FINISH: ");
        this.tomaDano((int)(this.getHp()*0.5)+this.getDef());
        inimigo.tomaDano(dano);
        return dano;
    }
    
    public int ataqueDeathLotus(ArrayList<inimigo> inimigos){
        int danoTotal=0;
        System.out.print("DEATH LOTUS: ");
        this.tomaDano((int)(this.getHp()*0.5)+this.getDef());
        for(int i=0;i<inimigos.size();i++){
            int dano=randomroll.danoroll(10);
            dano+=(2*this.getAtk());
            inimigos.get(i).tomaDano(dano);
            danoTotal+=dano;
        }
        return danoTotal;
    }
    
    public int ataqueDeathSentence(inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(20);
        dano+=(6*this.getAtk());
        System.out.print("DEATH SENTENCE: ");
        this.tomaDano((int)(this.getHp()*0.8)+this.getDef());
        inimigo.tomaDano(dano);
        return dano;
    }
    
    public void showActions(){  //mostra as ações possiveis ao jogador
        System.out.println("1.Ataque basico");
        if(getLvl()>=2){
            System.out.println("2.Sneak Attack");
        }if(getLvl()>=5){
            System.out.println("3.Bloody Finish");
        }if(getLvl()>=10){
            System.out.println("4.Death Lotus");
        }if(getLvl()>=15){
            System.out.println("4.Death Sentence");
        }
    }
    
}