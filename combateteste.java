import java.util.Scanner;
import java.util.ArrayList;
public class combateteste extends combate {
    public static void criaCombate(ArrayList<personagem> chars){
        Scanner teclado = new Scanner(System.in);
        slime slime1 = new slime();
        slime slime2 = new slime();
        ArrayList<Integer> controle = new ArrayList<Integer>();
        guerreiro dudum=(guerreiro) chars.get(0);
        System.out.println("Achou um Combate");
        while(true){
            dudum.showActions();
            controle=combate.turnoGuerreiro(dudum);
            combateteste.target(controle,slime1,slime2,teclado);
            //mago.showActions();
            //controle=combate.turnoMago;
            if(slime1.isDead()==true){
                controle=slime1.turno();
                targetInimigo(chars,controle);
            }
            if(slime2.isDead()==true){
                controle=slime2.turno();
                targetInimigo(chars,controle);
            }
            if(slime1.isDead()==false && slime2.isDead()==false){
                return;
            }
        }

    }

    public static void target(ArrayList<Integer> controle,slime a,slime b,Scanner teclado){
        int choice;
        if(controle.get(1)==0){
            System.out.println("Escolha o alvo");
            if(a.isDead()==true){
                System.out.println("1.Slime 1");
            }
            if(b.isDead()==true){
                System.out.println("2.Slime 2");
            }
            while(true){
                choice=teclado.nextInt();
                if(choice==1 && a.isDead()==true){
                    a.setHP(controle.get(0));
                    if(a.getHP()<=0){
                        a.kill();
                        System.out.println("Inimigo derrotado");
                    }
                    else{
                        a.printHP();
                    }
                    break;
                }
                if(choice==2 && b.isDead()==true){
                    b.setHP(controle.get(0));
                    if(b.getHP()<=0){
                        b.kill();
                        System.out.println("Inimigo derrotado");
                    }
                    else{
                        b.printHP();
                    }
                    break;
                }
            }
        }
        if(controle.get(1)==1){
            //acerta nos 2 inimigos
        }
    }
}

