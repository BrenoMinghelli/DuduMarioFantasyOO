package Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class CombateSlime extends combate{
    
    ArrayList <Inimigo> inimigos=new ArrayList<Inimigo>();
    //ArrayList<Personagem>personagens=new ArrayList<Personagem>();
    Slime slimeAzul=new Slime("Slime Azul");
    Slime slimeBranco=new Slime("Slime Branco");
    
    public CombateSlime(){
        this.inimigos.add(this.slimeAzul);this.inimigos.add(this.slimeBranco);
    }
    
    public void lutar(ArrayList<Personagem> personagens){
        
        Scanner teclado = new Scanner(System.in);
        int saida=0;
        
        System.out.println("O grupo encontra slimes!\n");
        
        while(saida==0){//saida caso todos os inimigos estejam mortos
            
            System.out.println("Turno dos jogadores:\n");  //primeiro o turno dos pcs, mas pode ter uma maneira de intercalar futuramente
            
            for(int i=0;i<personagens.size();i++){
            System.out.println("Vez do "+personagens.get(i).nome+"\n");
            System.out.print("Qual ataque usar?\n");
            personagens.get(i).atacar(inimigos, teclado.nextInt()-1);
            for(Inimigo temp1:inimigos){
                if(temp1.isDead())saida++;
            }
            if(saida!=inimigos.size())saida=0;
            else if(saida==inimigos.size())break;
            }
            if (saida==inimigos.size())break;
            
            System.out.println("Turno dos inimigos");  
            
            for(Inimigo temp2:inimigos){
                System.out.println("Vez do "+temp2.nome+"\n");
                temp2.atacar(personagens,0); //random, porem tem que checar personagens.isDead para funcionar
            for(Personagem temp3:personagens){
                if(temp3.isDead())saida--;
            }
            if(saida!=(-1)*personagens.size())saida=0;
            else if(saida==personagens.size())break;
            }
            if (saida==inimigos.size())break;

            } //no final o loop de while true retorna, e volta ao turno do jogador
        
        
        if (saida>0){
            System.out.print("Os personagens derrotaram os slimes!\n");
        }else if(saida<0){
            System.out.print("Os personagens foram derrotados!\n");
        }
        
    }
}
