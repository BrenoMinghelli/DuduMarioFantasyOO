package Alpha02.bin;

import java.util.Scanner;

public class start {
    public static int menu(){
        Scanner teclado = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("Bem vindo ao jogo\n1.Novo jogo\n2.Sair");
            choice=teclado.nextInt();
            if(choice==1){  //return 1 para o gamestate ir para 1, e mudar para o jogo em si
                return 1;
            }
            if(choice==2){  //return 10 pq é o break
                return 10;
            }
        }
    }
}
