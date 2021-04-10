import java.util.Scanner;
public class pausemenu {
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1.Mostra Stats\n2.Inventario\n3.Voltar");
            choice=teclado.nextInt();
            if(choice==1){
                //stats da party
            }
            if(choice==2){
                //inventario
            }
            if(choice==3){
                break;  //volta ao jogo/fecha o menu
            }
        }
    }
}
