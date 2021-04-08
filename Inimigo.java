package Teste;

import java.util.ArrayList;

/*Ideia
Parecido com a classe Personagem. Os tipos de inimigos seriam filhos dessa classe
como Guerreiro eh filho de Personagem.
 */
public class Inimigo {
    
    protected String nome;
    protected int lvl;
    protected double hp;
    protected double hpA=hp;
    protected int atk;
    protected int def;
    
    ArrayList <Ataque> ataques=new ArrayList <Ataque>();
    
    public Inimigo(String nome, int lvl, double hp, int atk, int def){
        this.nome=nome;
        this.lvl=lvl;
        this.hp=hp;
        this.hpA=hp;
        this.atk=atk;
        this.def=def;
    }
    
    public double atacar(ArrayList<Personagem> personagens, int alvo){
        if(personagens.get(alvo).isDead()){
            System.out.print("O Personagem ja esta morto.\n");
            double dano=0;
            return dano;
        }
        System.out.print("O inimigo "+this.nome+" atacou o ");
        int indice=0; //qual ataque usar TODO implementar random
        double dano=this.ataques.get(indice).atacar(this.lvl,this.atk,personagens,alvo);
        return dano;
    }
    
    public void tomaDano(double dano){
        if(this.hpA>dano)this.hpA-=dano;
        else {
            this.hpA=0;
            System.out.print("O "+this.nome+" morreu.\n");
        }
    }
    
    public boolean isDead(){
        if(hpA==0)return true;
        return false;
    }
    
    public int getDef(){
        return this.def;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setDef(int def){
        this.def=def;
    }
    
}
