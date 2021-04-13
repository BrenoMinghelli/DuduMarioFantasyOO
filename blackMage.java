package Alpha02;

import java.util.ArrayList;

/*
 */
public class blackMage extends personagem{
    
    private int magia=7;
    private int mp=10;
    private int mpA=mp;
    
    public blackMage(String nome){
        super(nome,1,15,5,5);
    }
    
    @Override
    public void levelup(){  //mecanica de lvl up, quando acumular X de xp, implementado dps
        this.setLvl(this.getLvl()+1);
        this.setHp(this.getHp()+3);
        this.setAtk(this.getAtk()+1);
        this.setDef(this.getDef()+1);
        this.setHpA(this.getHpA()+3);
        this.setMagia(this.getMagia() + 3);
        this.setMp(this.getMp() + 5);
        this.setMpA(this.getMpA() + 5);
    }
    
    @Override
    public int habilidades(int qualAtaque, ArrayList inimigos, int qualInimigo){
        switch (qualAtaque) {
            case 1 -> {
                return this.ataqueBasico((inimigo)inimigos.get(qualInimigo));
            }
            case 2 -> {
                if(this.getLvl()>=2){return this.magiaFirebolt((inimigo)inimigos.get(qualInimigo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 3 -> {
                if(this.getLvl()>=5){return this.magiaDarkSphere((inimigo)inimigos.get(qualInimigo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 4 -> {
                if(this.getLvl()>=10){return this.magiaFireball(inimigos);}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 5 -> {
                if(this.getLvl()>=15){return this.magiaDarkHole(inimigos);}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            default -> { System.out.print("Ataque Invalido\n");return 0;
            }
        }
    }
    
    public int magiaFirebolt(inimigo inimigo){
        int dano;
        if(this.getMpA()<3){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("FIREBOLT: ");
        this.setMpA(this.getMpA() - 3);
        dano=randomroll.danoroll(7);
        dano+=(this.getMagia());
        inimigo.tomaDano(dano);
        
        return dano;
    }
    
    public int magiaDarkSphere(inimigo inimigo){
        int dano;
        if(this.getMpA()<7){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("DARK SPHERE: ");
        this.setMpA(this.getMpA() - 7);
        dano=randomroll.danoroll(10);
        dano+=(2*this.getMagia());
        inimigo.tomaDano(dano);
        
        return dano;
    }
    
    public int magiaFireball(ArrayList<inimigo> inimigos){
        int danoTotal=0;
        if(this.getMpA()<(this.getMp()*0.2)){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("FIREBALL: ");
        this.setMpA(this.getMpA() - (int) (this.getMp() * 0.2));
        for(int i=0;i<inimigos.size();i++){
            int dano=randomroll.danoroll(10);
            dano+=(2*this.getMagia());
            danoTotal+=dano;
            inimigos.get(i).tomaDano(dano);
        }
        return danoTotal;
    }
    
    public int magiaDarkHole(ArrayList<inimigo> inimigos){
        int danoTotal=0;
        if(this.getMpA()<(this.getMp()*0.5)){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("DARK HOLE: ");
        this.setMpA(this.getMpA() - (int) (this.getMp() * 0.5));
        for(int i=0;i<inimigos.size();i++){
            int dano=randomroll.danoroll(15);
            dano+=(4*this.getMagia());
            danoTotal+=dano;
            inimigos.get(i).tomaDano(dano);
        }
        return danoTotal;
    }
    
    public void showActions(){  //mostra as ações possiveis ao jogador
        System.out.println("1.Ataque basico");
        if(this.getLvl()>=2){
            System.out.println("2.Firebolt");
        }if(this.getLvl()>=5){
            System.out.println("3.DarkSphere");
        }if(this.getLvl()>=10){
            System.out.println("4.Fireball");
        }if(this.getLvl()>=15){
            System.out.println("5.DarkHole");
        }
    }
    
    public int getMagia() {return magia;}
    public void setMagia(int magia) {this.magia = magia;}
    public int getMp() {return mp;}
    public void setMp(int mp) {this.mp = mp;}
    public int getMpA() {return mpA;}
    public void setMpA(int mpA) {this.mpA = mpA;}
}