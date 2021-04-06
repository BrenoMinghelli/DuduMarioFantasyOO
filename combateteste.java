import java.util.Scanner;
public class combateteste extends combate {
    public combateteste(){

    }
    public void criaCombate(){
        Scanner teclado = new Scanner(System.in);
        while(true){
            int sai = teclado.nextInt();
            if(sai==1){
                return;
            }
        }

    }
}
