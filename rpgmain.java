package Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class rpgmain {
    public static void main(String args[]){
        
        ArrayList <Personagem> personagens=new ArrayList<Personagem>();
        Scanner teclado = new Scanner(System.in);
        Guerreiro guerreiro = new Guerreiro("Dudu Mario",1);  //inicializando cria os personagens, posteriormente pode colocar essas infos num arquivo
        
        personagens.add(guerreiro);
        
        for(Personagem temp:personagens){
            temp.imprimir();
        }        
        
        CombateSlime combateTeste=new CombateSlime();
        combateTeste.lutar(personagens);
        
        /*
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
        }*/
        
    }
}
