package Teste;

/*Ideia
Parecido com a classe Personagem. Os tipos de inimigos seriam filhos dessa classe
como Guerreiro eh filho de Personagem.
 */
public class Inimigo {
    
    protected String nome;
    protected int lvl;
    protected int hp;
    protected int hpA=hp;
    protected int atk;
    protected int def;
    
    public Inimigo(String nome, int lvl, int hp, int atk, int def){
        this.nome=nome;
        this.lvl=lvl;
        this.hp=hp;
        this.hpA=hp;
        this.atk=atk;
        this.def=def;
    }
    
    public double atacar(Personagem personagens[]){
        double dano=0;
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
