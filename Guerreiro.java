package Teste;

import java.util.ArrayList;
import java.util.Scanner;

/*Ideia
Adicao dos ataques possiveis, status base, e modificacoes em ataque para se adequar
a mecanicas (frenesi por exemplo).
 */
public class Guerreiro extends Personagem{
    
    public Guerreiro(String nome, int lvl){
        super(nome,lvl,100,10,10);
        AtaqueCorte corte=new AtaqueCorte();AtaqueGiratorio giratorio=new AtaqueGiratorio();
        AtaquePerfurante perfurante=new AtaquePerfurante();AtaqueFrenesi frenesi=new AtaqueFrenesi();
        this.ataques.add(corte);this.ataques.add(giratorio); 
        this.ataques.add(perfurante); this.ataques.add(frenesi); 
    }
    
    @Override
    public double atacar(ArrayList<Inimigo> inimigos, int indice){
        
        //trata um Ataque como um AtaqueFrenesi para pegar seus atributos, mas 
        //so funciona pois sei que frenesi esta no indice 3(4)
        if(((AtaqueFrenesi)this.ataques.get(3)).frenesi>0){ //excecao para o frenesi
            System.out.print("O heroi "+this.nome+" esta em Frenesi e atacou o ");
            double dano=this.ataques.get(3).atacar(this.lvl,this.atk,inimigos,((AtaqueFrenesi)this.ataques.get(3)).alvo);
            return dano;
        }
        
        //demais ataques
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
    
}
