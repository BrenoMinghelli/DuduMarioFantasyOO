package Alpha02.bin;

import Alpha02.bin.combatgenerator;
import Alpha02.bin.Personagem;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class game {
    public static int cenario(ArrayList<Personagem> chars){
        Scanner teclado = new Scanner(System.in);
        int choice;
        int area=0;  //qual a area q o player esta atualmente
        int bloco=0;  //usado para poder mudar a area nos testes, descartavel quando for pra interface grafica
        int encontroChance=5;  //metodo para randomizar os encontros
        Random r = new Random();
        while(true){
            System.out.println("1.Andar\n2.Pause");
            choice=teclado.nextInt();
            if(choice==1){
                System.out.println("Personagem avança");  //essa parte seria implementada com a interface nos controles
                bloco=bloco+1;
                if(bloco==10){
                    area=area+1;
                    bloco=0;
                    System.out.println("Avançou de area");  //interface
                }
                int d=r.nextInt(encontroChance);{ //mas todo passo q o jogador der tem a chance do encontro, que vai aumentando ate ele acontecer
                    if(d>5){
                        combatgenerator.gerar(0,chars);//esse 0 é a area, mas vai ficar assim a motivo de teste
                        encontroChance=5;
                    }
                    else{
                        encontroChance=encontroChance+1;
                    }
                }
            }
            if(choice==2){
                pausemenu.menu(); //menu de pausa
            }
            if(choice==10){  //break de segurança
                return 10;
            }
            
        }
    }
}
