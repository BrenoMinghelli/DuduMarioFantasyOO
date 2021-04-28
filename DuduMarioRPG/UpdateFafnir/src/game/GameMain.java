package game;

import arquivo.PersonagensArquivo;
import java.util.ArrayList;
import java.util.Scanner;

/*      Comentarios:
    Classe arquivo funcionando, caso não queira usar deixe comentado. 
Provavelmente essa parte de carregar os personagens ficaria em outra classe,
mas deixei aqui para testes por enquanto.*/
public class GameMain {

    public static void main(String[] args) {
        
        ArrayList<Personagem> personagens=new ArrayList<Personagem>();
        Mochila mochila=new Mochila();
        
        PocaoFogo pocao1=new PocaoFogo();
        PocaoCura pocao2=new PocaoCura();
        mochila.adicionaItem(pocao1);mochila.adicionaItem(pocao1);
        mochila.adicionaItem(pocao2);mochila.adicionaItem(pocao2);
        
        /*//Reseta os personagens do arquivo
        Guerreiro p1=new Guerreiro("GUERREIRO");personagens.add(p1);
        BlackMage p2=new BlackMage("MAGO");personagens.add(p2);
        WhiteMage p3=new WhiteMage("CLERIGO");personagens.add(p3);
        Rogue p4=new Rogue("ROGUE");personagens.add(p4);       
        PersonagensArquivo.salvaTodos(personagens);
        personagens.clear();//*/
        
        //Carrega os personagens lvl 15 para o jogo
        PersonagensArquivo.carregaPersonagens(personagens);
        
        //*
        Scanner teclado = new Scanner(System.in);
        int escolha;
        System.out.println("Bem vindo ao Dudu Mario RPG: O Inimigo Agora � Outro");
        
        while(true) {
            
            System.out.println("1.Procurar um combate\n2.Descansar na cidade\n3.Olhar os personagens\n4.Sair do jogo");
            escolha = teclado.nextInt();
            if(escolha==1) {
                AcharCombate.encontro(personagens,mochila);
            }
            if(escolha==2) {
                RegenChars.regenChars(personagens);
            }
            if(escolha==3) {
                //show chars
                System.out.println("- - - Herois - - -");
                for(Personagem var:personagens)var.imprime();
                System.out.println("- - - Mochila - - -");
                mochila.imprime();
            }
            if(escolha==4) {
                teclado.close();
                return;
            }
        }//*/
    }
}
