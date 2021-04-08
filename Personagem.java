package Teste;

import java.util.ArrayList;
import java.util.Scanner;

/*Ideia
Variaveis e metodos comuns a todos os personagens. Pensei em implementar o Atacar()
aqui, ja que penso que um Personagem ataca um Inimigo, mas pode ser feito em Combate tb.
Pensei que os ataques que cada personagem poderia usar deveriam ser guardados nessa classe,
porem eles so sao realmente adicionados em Guerreiro ou nas demais "classes".

Usei prints e scans de teclado para interface basica e testes.
 */
public class Personagem {
    
    protected String nome;
    protected int lvl=1;
    protected int hp;
    protected int hpA=hp;
    protected int atk;
    protected int def;
    
    ArrayList <Ataque> ataques=new ArrayList <Ataque>(); 
    //ArrayList <Magia> magias=new ArrayList <Magia>();
    //ArrayList <Item> itens=new ArrayList <Item>();
    /*talvez seja melhor implementar uma classe inventario ou mochila para os itens
    ja que podem ser compartilhados entre todos os personagens
    */
    
    
    public Personagem(String nome, int lvl, int hp, int atk, int def){
        this.nome=nome;
        this.lvl=lvl;
        this.hp=hp;
        this.hpA=hp;
        this.atk=atk;
        this.def=def;
    }
    
    //Causa dano a um inimigo
    public double atacar(ArrayList<Inimigo> inimigos, int indice){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Qual inimigo deseja atacar?\n");
        int entrada=scanner.nextInt()-1;
        if(inimigos.get(entrada).isDead()){
            System.out.print("O inimigo ja esta morto.\n");
            double dano=0;
            return dano;
        }
        System.out.print("O heroi "+this.nome+" atacou o ");
        double dano=this.ataques.get(indice).atacar(this.lvl,this.atk,inimigos,entrada);
        return dano;
    }
    
    public void imprimir(){
        System.out.print("O heroi "+this.nome+" eh um Personagem"+" de nivel "+this.lvl+"\n"+
                "Stats: "+
                "\nAtk "+this.atk+
                "\nHP atual "+this.hpA+
                "\nDef "+this.def+"\n\n");
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
    
    /*
    //Magia
    public double magia(Inimigo inimigo){
        double dano=0;
        return dano;
    }
    
    //Usar item
    public boolean usaItem(Item item){
        return true;
    }
    */

}
