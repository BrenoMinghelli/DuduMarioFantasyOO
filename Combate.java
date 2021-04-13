package Alpha02;

import java.util.ArrayList;
import java.util.Scanner;

/*Fafnir-
Ideia:
    Preciso da classe combate para aplicar as mecanicas das classes personagem. 
Tentei manter ao maximo as mecanicas e informacoes relacionadas a um personagem 
na propria subclasse dele, mas quando essas mecanicas afetam outros personagens
ou inimigos eu preciso implementar alguns pedacos delas aqui.

Detalhes:
    Estou assumindo que os personagens sempre serao os mesmos 4 na mesma ordem, 
caso possam mudar de ordem preciso refazer algumas linhas. Eh relativamente 
simples resolver esse problema, posso rodar o array e procurar a classe desejada.
    A classe combate considera que as entradas serao digitadas corretamente, 
aindanao implementei catchs para todas as exceptions e nao dou outra "chance" de 
entradaHabilidade caso digite algo invalido.
    Um inimigo morto eh retirado do Array, mas um personagem morto continua no
Array, pois pode ser revivido. Por isso eh necessario checar.

Ideia:
    Caso um menu seja implementado para mostrar os stats ou coisas interessantes
para a decisao de entradaHabilidade do jogador, como qual habilidade usar por 
exemplo, uma das opcoes de entrada pode abrir o menu, ou uma chamada a ele pode 
ser feita antes de cada nextInt();

    Caso queira dar outra chance para o usuario escolher uma entrada valida, pode 
ser feito um pequeno loop contendo personagem.habilidades(), com condicao de 
saida baseada no retorno desse metodo. Todos os retornos sao ints e carregam o 
dano causado ou cura feita pela habilidade, mas podem tambem retornar -1 no 
caso de falha por exemplo.
*/
abstract class combate {
    
    Scanner teclado = new Scanner(System.in);
    
    ArrayList<inimigo> inimigos= new ArrayList<inimigo>();
    
    public combate(){};//SUBCLASSES : adicionar os inimigos no construtor
    
    public void lutar(ArrayList<personagem> personagens){
        //variaveis auxiliares
        int saida=0;
        int entradaHabilidade;
        int entradaAlvo;
        
        while(saida==0){//saida caso todos os inimigos estejam mortos
            
            System.out.print("- - - Turno dos jogadores - - -\n");
            for(int i=0;i<personagens.size();i++){
                
                if(personagens.get(i).taMorto()==false){//checando se o personagem esta morto
                    
                    System.out.print("Vez do "+personagens.get(i).getNome()+"\n");
                    System.out.print("Qual habilidade usar?\nQual o alvo?\n");

                    //showActions aqui se quiser
                    entradaHabilidade=teclado.nextInt();//habilidades comecam do 1, diferente do Array
                    entradaAlvo=teclado.nextInt()-1; //-1 pois tratamos de Array, logo posicao 1 = 0

                    //trocar para modo cura no caso especifico do clerigo ; ToDo achar solucao melhor com uma unica classe habilidades
                    if(whiteMage.class==personagens.get(i).getClass() & entradaHabilidade>1)personagens.get(i).habilidades(entradaHabilidade, personagens, entradaAlvo);
                    else personagens.get(i).habilidades(entradaHabilidade, this.inimigos, entradaAlvo);

                    for(int j=0; j<this.inimigos.size();j++){//tira os inimigos da lista antes que o proximo heroi/inimigo ataque
                        if(this.inimigos.get(j).taMorto())this.inimigos.remove(j);
                    }
                }if(this.inimigos.isEmpty())break;
            }if(this.inimigos.isEmpty())break;
            
            System.out.print("- - - Turno dos inimigos - - -\n");
            for(inimigo temp2:inimigos){
                System.out.print("Vez do "+temp2.getNome()+"\n");
                
                if(((guerreiro)personagens.get(0)).isTaunting() & ((guerreiro)personagens.get(0)).taMorto()==false)temp2.atacar(personagens.get(0));//mecanica Taunt do guerreiro
                else temp2.atacar(personagens); //random, porem tem que checar personagens.isDead para funcionar
                
                for(int i=0; i<4;i++){//checa quantos personagens estao mortos
                    if(personagens.get(i).taMorto()){
                        saida--;
                    }
                }
            }
            
            //checando condicoes de parada e resetando algumas mecanicas
            ((guerreiro)personagens.get(0)).fimTaunt();//So funciona pq o guerreiro ta na posicao 1 (0)
            
            if(saida!=(-1)*personagens.size())saida=0;
            else if(saida==(-1)*personagens.size())break; //se todos os personagens morreram   
            
        }//fim do while
        
        //mensagens de fim de combate, recompensas, resets finais
        ((whiteMage)personagens.get(2)).fimHeroism(personagens);//reseta mecanica Heroism do whiteMage
        
        if (saida>=0){
            System.out.print("Os personagens derrotaram os slimes!\n");
        }else if(saida<0){
            System.out.print("Os personagens foram derrotados!\n");
        }
    }
}