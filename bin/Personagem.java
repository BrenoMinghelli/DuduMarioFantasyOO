package Alpha02.bin;

import java.io.Serializable;
import java.util.ArrayList;

/*Fafnir-
Ideia:
    Tentei padronizar ao maximo as subclasses e manter as mecanicas especificas
de cada classe afetando apenas ela mesma e nao a classe 'Personagem'.

Sugestao:
Mudar hp/hpA mp/mpA para doubles devido aos calculos e porcentagens.
*/
public abstract class Personagem implements Serializable{
    
    private String nome;
    private int lvl;
    private int hp;
    private int hpA;
    private int atk;
    private int def;
    
    //static mochila mochila;//ToDo: Como saber qual objeto passar de parametro para o item?
    //public int usarItem(int qualItem,){return 0;}
    
    public Personagem(String n,int l,int h,int a,int d){
        this.nome=n;
        this.lvl=l;
        this.hp=h;
        this.hpA=h;
        this.atk=a;
        this.def=d;
    }
    
    public abstract int habilidades(int qualAtaque, ArrayList inimigos, int qualInimigo);
    
    public abstract void levelup();
    
    public int ataqueBasico(Inimigo inimigo){
        int dano;
        dano=randomroll.danoroll(7);
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
    
    public void imprimeHP(){  //entrada com nome para o print fazer dps,seria removida com a interface
        System.out.println("Player"+getHpA()+"/"+getHp());
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
}