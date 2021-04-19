package Alpha02.bin;

import java.util.ArrayList;
import java.util.Scanner;

/*Fafnir-
Ideia:
    Preciso da classe Combate para aplicar as mecanicas das classes Personagem. 
Tentei manter ao maximo as mecanicas e informacoes relacionadas a um Personagem 
na propria subclasse dele, mas quando essas mecanicas afetam outros personagens
ou inimigos eu preciso implementar alguns pedacos delas aqui.

Detalhes:
    Estou assumindo que os personagens sempre serao os mesmos 4 na mesma ordem, 
caso possam mudar de ordem preciso refazer algumas linhas. Eh relativamente 
simples resolver esse problema, posso rodar o array e procurar a classe desejada.
    A classe Combate considera que as entradas serao digitadas corretamente, 
aindanao implementei catchs para todas as exceptions e nao dou outra "chance" de 
entradaHabilidade caso digite algo invalido.
    Um Inimigo morto eh retirado do Array, mas um Personagem morto continua no
Array, pois pode ser revivido. Por isso eh necessario checar.

Ideia:
    Caso um menu seja implementado para mostrar os stats ou coisas interessantes
para a decisao de entradaHabilidade do jogador, como qual habilidade usar por 
exemplo, uma das opcoes de entrada pode abrir o menu, ou uma chamada a ele pode 
ser feita antes de cada nextInt();

    Caso queira dar outra chance para o usuario escolher uma entrada valida, pode 
ser feito um pequeno loop contendo Personagem.habilidades(), com condicao de 
saida baseada no retorno desse metodo. Todos os retornos sao ints e carregam o 
dano causado ou cura feita pela habilidade, mas podem tambem retornar -1 no 
caso de falha por exemplo.
*/
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
            
            System.out.print("- - - Turno dos jogadores - - -\n");
            for(int i=0;i<personagens.size();i++){
                
                if(personagens.get(i).taMorto()==false){//checando se o Personagem esta morto
                    
                    System.out.print("Vez do "+personagens.get(i).getNome()+"\n");
                    
                    while(true){//repetir entrada caso invalido
                        
                        System.out.print("Qual habilidade usar?\n");
                        entradaHabilidade=teclado.nextInt();//habilidades comecam do 1, diferente do Array
                        System.out.print("Qual alvo?\n");
                        entradaAlvo=teclado.nextInt()-1; //-1 pois tratamos de Array, logo posicao 1 = 0

                        //trocar para modo cura no caso especifico do clerigo ; ToDo achar solucao melhor com uma unica classe habilidades
                        if(WhiteMage.class==personagens.get(i).getClass() & entradaHabilidade>1){
                            if(personagens.get(i).habilidades(entradaHabilidade, personagens, entradaAlvo)>=0)break;
                        }else if(personagens.get(i).habilidades(entradaHabilidade, this.inimigos, entradaAlvo)>=0)break;
                    }
                    for(int j=0; j<this.inimigos.size();j++){//tira os inimigos da lista antes que o proximo heroi/inimigo ataque
                        if(this.inimigos.get(j).taMorto())this.inimigos.remove(j);
                    }
                }if(this.inimigos.isEmpty())break;
            }if(this.inimigos.isEmpty())break;
            
            System.out.print("- - - Turno dos inimigos - - -\n");
            for(Inimigo temp2:inimigos){
                System.out.print("Vez do "+temp2.getNome()+"\n");
                
                if(((Guerreiro)personagens.get(0)).isTaunting() & ((Guerreiro)personagens.get(0)).taMorto()==false)temp2.atacar(personagens.get(0));//mecanica Taunt do Guerreiro
                else temp2.atacar(personagens); //random, porem tem que checar personagens.isDead para funcionar
                
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