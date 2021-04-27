package game;

import java.util.ArrayList;
import java.io.Serializable;

public abstract class Personagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
    private int lvl=1;
    protected int hp;
    protected int hpA;
    private int atk;
    private int def;
    private int xp=0;
    
    public Personagem(String n,int l,int h,int a,int d){
        this.nome=n;
        this.lvl=l;
        this.hp=h;
        this.hpA=h;
        this.atk=a;
        this.def=d;
    }
    
    public abstract int habilidades(int qualAtaque, @SuppressWarnings("rawtypes") ArrayList inimigos, int qualInimigo);
    
    //a funcao ganhaXp chama levelUp
    public abstract void levelUp();
    
    public int ataqueBasico(Inimigo inimigo){
        int dano;
        dano=RandomRoll.danoroll(7);
        dano+=(this.getAtk());
        System.out.print("ATAQUE BASICO: ");
        inimigo.tomaDano(dano);
        return dano;
    }
    
    public int curar(int cura){ //retorna -1 se deu erro
        if(this.taMorto()){System.out.print(this.getNome()+" esta morto\n");return -1;}
        this.setHpA(this.getHpA() + cura);
        if(this.getHpA()>this.getHp())this.setHpA(getHp()); //Nao dar "OverHeal"
        System.out.print("O "+this.getNome()+" recupera "+cura+" de vida\n");
        return cura;
    }
    
    public void tomaDano(int dano){  //reduz o hp do player com a entrada de dano, ja fatorando a redução pela def
        dano-=this.getDef();
        if(dano<=0){
            dano=1;  //min 1 de dano causado
        }
        setHpA(getHpA() - dano);
        System.out.print("O "+this.getNome()+" toma "+dano+" de dano\n");
    }
    
    public boolean taMorto(){
        if(this.getHpA()>0)return false;
        else return true;
    }
    
    public void ganhaXp(int ganha){//sobe um nivel a cada 10 de xp
        int temp=this.xp%10;
        while(temp+ganha>=10){
            this.levelUp();
            temp-=10;
        }
        this.xp+=ganha;
    }
    
    public void imprime(){
        System.out.println(this.nome+"\nLevel: "+this.lvl+"\nHP: "+getHpA()+"/"+getHp());
    }
    
    public void regenHP() {
    	hpA=hp;
    }
    
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getLvl() {return lvl;}
    public void setLvl(int lvl) {this.lvl = lvl;}
    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getHpA() {return hpA;}
    public void setHpA(int hpA) {this.hpA = hpA;}
    public int getAtk() {return atk;}
    public void setAtk(int atk) {this.atk = atk;}
    public int getDef() {return def;}
    public void setDef(int def) {this.def = def;}
    public int getXp() {return xp;}
    public void setXp(int xp) {this.xp = xp;}
}
