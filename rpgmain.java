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
