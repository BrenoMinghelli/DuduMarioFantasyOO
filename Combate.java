package Alpha02;

import java.util.ArrayList;
import java.util.Scanner;

abstract class combate {
    
    Scanner teclado = new Scanner(System.in);
    boolean taunt=false;
    
    ArrayList<inimigo> inimigos= new ArrayList<inimigo>();
    
    public combate(){};
    
    public void lutar(ArrayList<personagem> personagens){
        int saida=0;
        
        while(saida==0){//saida caso todos os inimigos estejam mortos
            
            System.out.print("Turno dos jogadores:\n");
            for(int i=0;i<personagens.size();i++){
                System.out.print("Vez do "+personagens.get(i).nome+"\n");
                System.out.print("Qual ataque usar?\nQual inimigo atacar?\n");
                personagens.get(i).atacar(teclado.nextInt(), this.inimigos, teclado.nextInt()-1);
                for(int j=0; j<this.inimigos.size();j++){
                    if(this.inimigos.get(j).taMorto())this.inimigos.remove(j);
                }
            }if(this.inimigos.size()==0)break;
            
            System.out.print("Turno dos inimigos\n");
            for(inimigo temp2:inimigos){
                System.out.print("Vez do "+temp2.nome+"\n");
                temp2.atacar(personagens); //random, porem tem que checar personagens.isDead para funcionar
                for(int i=0; i<personagens.size();i++){
                    if(personagens.get(i).taMorto()){
                        saida--;
                    }
                }
            }
            
            //checando condicoes de parada e resetando algumas mecanicas
            ((guerreiro)personagens.get(0)).fimTaunt();
            if(saida!=(-1)*personagens.size())saida=0;
            else if(saida==(-1)*personagens.size())break;    
            
        }//fim do while
        
        //mensagens de fim de combate, recompensas
        if (saida>=0){
            System.out.print("Os personagens derrotaram os slimes!\n");
        }else if(saida<0){
            System.out.print("Os personagens foram derrotados!\n");
        }
    }
    
    public boolean isTaunting(personagem personagem){
        return ((guerreiro)personagem).isTaunting();
    }
}
