package game;

import java.util.ArrayList;
import java.util.Scanner;
/*      Comentarios:
    Corrigido bug de dano em Area, agora os inimigos sao removidos do array do
ultimo ao primeiro, o que deve evitar IndexOutOfBounds.
ToDo: tentar implementar o scanner fora de combate como pedido pela professora.*/
abstract class Combate {
Scanner teclado = new Scanner(System.in);
    
    ArrayList<Inimigo> inimigos= new ArrayList<Inimigo>();
    
    
    public Combate(){};//SUBCLASSES : adicionar os inimigos no construtor
    
    public void lutar(ArrayList<Personagem> personagens){
        //variaveis auxiliares
        int saida=0;
        int entradaHabilidade;
        int entradaAlvo;
        
        while(saida==0){//saida caso todos os inimigos estejam mortos
            
            System.out.println("- - - Turno dos jogadores - - -\n");
            for(int i=0;i<personagens.size();i++){
                
                if(personagens.get(i).taMorto()==false){//checando se o Personagem esta morto
                	MostrarAction.mostrarAction(i,personagens);
                    while(true){//repetir entrada caso invalido
                        
                        System.out.println("Qual habilidade usar?\n");
                        entradaHabilidade=teclado.nextInt();//habilidades comecam do 1, diferente do Array
                        System.out.println("Qual alvo?\n");
                        entradaAlvo=teclado.nextInt()-1; //-1 pois tratamos de Array, logo posicao 1 = 0

                        //trocar para modo cura no caso especifico do clerigo ; ToDo achar solucao melhor com uma unica classe habilidades
                        if(WhiteMage.class==personagens.get(i).getClass() & entradaHabilidade>1){
                            if(personagens.get(i).habilidades(entradaHabilidade, personagens, entradaAlvo)>=0)break;
                        }else if(personagens.get(i).habilidades(entradaHabilidade, this.inimigos, entradaAlvo)>=0)break;
                    }
                    for(int j=this.inimigos.size()-1; j>=0;j--){//tira os inimigos da lista antes que o proximo heroi/inimigo ataque
                        if(this.inimigos.get(j).taMorto())this.inimigos.remove(j);
                    }
                }if(this.inimigos.isEmpty())break;
            }if(this.inimigos.isEmpty())break;
            
            System.out.println("- - - Turno dos inimigos - - -\n");
            for(Inimigo inimigoTemp:inimigos){
                System.out.println("Vez do "+inimigoTemp.getNome()+"\n");
                
                if(((Guerreiro)personagens.get(0)).isTaunting() & ((Guerreiro)personagens.get(0)).taMorto()==false)inimigoTemp.atacar(personagens.get(0));//mecanica Taunt do Guerreiro
                else inimigoTemp.atacar(personagens); //random, porem tem que checar personagens.isDead para funcionar
                
                for(int i=0; i<4;i++){//checa quantos personagens estao mortos
                    if(personagens.get(i).taMorto()){
                        saida--;
                    }
                }
            }
            
            //checando condicoes de parada e resetando algumas mecanicas
            ((Guerreiro)personagens.get(0)).fimTaunt();//So funciona pq o Guerreiro ta na posicao 1 (0)
            
            if(saida!=(-1)*personagens.size())saida=0;
            else if(saida==(-1)*personagens.size())break; //se todos os personagens morreram   
            
        }//fim do while
        
        //mensagens de fim de Combate, recompensas, resets finais
        ((WhiteMage)personagens.get(2)).fimHeroism(personagens);//reseta mecanica Heroism do WhiteMage
        
        if (saida>=0){
            System.out.print("Os personagens derrotaram os slimes!\n");
        }else if(saida<0){
            System.out.print("Os personagens foram derrotados!\n");
        }
        
    }
}
