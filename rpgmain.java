/* Fafnir
                Ideias:

        Base:

    - 4 herois e ate 4 inimigos
    - Classe static combate tratando de cada batalha 4x4 com metodos como ataque(), item(), magia().
    - Herois passados como parametro para reter modificacoes, mas inimigos instanciados dentro do metodo para que sejam temporarios.
    - Fases pre-made tambem static herdando de combate.
        
        Mecanicas: 
(ideias para incrementar o jogo depois que a base estiver 100%, tentei pensar em classes que teriam herança ou algo da materia)
        
    - Itens equipaveis em herois que modifiquem seus status
    - Acontecimentos durante combate, como "ta chovendo, fogo -50% dano"
    - Classe Boss 4x1 mas que nao herda de combate, com mecanicas unicas a cada boss.
    - Elementos e tipo de dano. Fraqueza, resistencia, combinacoes.
    
(extra, nao tem mt a ver com a materia mas agregaria ao jogo)
    - Historinha em texto antes do combate, "vcs estao andando pela floresta a caminho da cidade e sao surpreendidos por slimes"
    
                Comentarios:
    
    - tentar manter o minimo de coisas instanciadas na main, criar classes static.
    - Talvez manter um contador de turnos ou loops na main, pode ser util mais pra frente.
    
*/
import java.util.Scanner;
public class rpgmain {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        fighter dudumario = new fighter("Dudu Mario");  //inicializando cria os personagens, posteriormente pode colocar essas infos num arquivo
        dudumario.getstats();
        while (true){
            System.out.println("1.Combate\n2.Break");  //feito para testes
            int choice = teclado.nextInt();
            if (choice==1){ //se o usuario entrar num combate
                combateSlime c = new combateSlime(dudumario); //cria o combate
                c.criaCombate(); //inicia o combate
                c=null; //ao fim do combate muda o C para null, e o garbage collector teoricamente remove o combate da memoria
            }
            if(choice==2){  //close para teste
                teclado.close();
                break;
            }
        }
    }
}
