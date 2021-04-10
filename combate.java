import java.util.ArrayList;
import java.util.Scanner;
abstract class combate {
    
    
    public static ArrayList<Integer> turnoGuerreiro(guerreiro dudum){
        int choice;
        int dano;
        int aoe;
        ArrayList<Integer> retorno = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        while(true){
            choice=teclado.nextInt();
            if(choice==1){
                dano=dudum.basichit();
                aoe=0;
                retorno.add(dano);
                retorno.add(aoe);
                return retorno;
            }
            if(choice==3 && dudum.lvl>=10){
                dano=dudum.basichit();
                aoe=1;
                retorno.add(dano);
                retorno.add(aoe);
                return retorno;
            }
        }
    }

    public static void targetInimigo(ArrayList<personagem> chars,ArrayList<Integer> controle){
        int target = randomroll.danoroll(4);
        if(target<=3 && controle.get(1)==0){
            guerreiro dudum = (guerreiro)chars.get(0);
            dudum.setHP(controle.get(0));
            dudum.printHP();
        }
        if(controle.get(1)==1){
            //acerta em todos
        }
    }
    
    //public static void mecanicadecura(ArrayList<personagem>){
    
    }
}
