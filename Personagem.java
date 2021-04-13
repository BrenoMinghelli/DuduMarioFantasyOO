package Alpha02;

import java.util.ArrayList;

public abstract class personagem {
    
    protected String nome;
    protected int lvl;
    protected int hp;
    protected int hpA;
    protected int atk;
    protected int def;
    
    public personagem(String n,int l,int h,int a,int d){
        this.nome=n;
        this.lvl=l;
        this.hp=h;
        this.hpA=h;
        this.atk=a;
        this.def=d;
    }
    
    public int atacar(int qualAtaque, ArrayList<inimigo> inimigos, int qualInimigo){
        return 1;}
    
    public void levelup(){}
    
    public void tomaDano(int dano){  //reduz o hp do player com a entrada de dano, ja fatorando a redução pela def
        dano-=this.def;
        if(dano<=0){
            dano=1;  //min 1 de dano causado
        }
        hpA-=dano;
        System.out.print("O "+this.nome+" toma "+dano+" de dano\n");
    }
    
    public boolean taMorto(){
        if(this.hpA>0)return false;
        else return true;
    }
    
    public void imprimeHP(){  //entrada com nome para o print fazer dps,seria removida com a interface
        System.out.println("Player"+hpA+"/"+hp);
    }
}
