package game;

import java.util.ArrayList;
import java.util.Scanner;

import Jogador.Desenhista;

public class GameMain {

	public static void main(String[] args) {
		ArrayList<Personagem> personagens=new ArrayList<Personagem>();
		personagens=GetPersonagens.getP(personagens);
	
		Display display = new Display();
		
		Mochila mochila=new Mochila();
		
		display.initCanvas();
		display.initDesenhos(personagens,mochila);								//iniciar desenhos
											//iniciar tela
        
        PocaoFogo pocao1=new PocaoFogo();
        PocaoCura pocao2=new PocaoCura();
        mochila.adicionaItem(pocao1);mochila.adicionaItem(pocao1);
        mochila.adicionaItem(pocao2);mochila.adicionaItem(pocao2);
		System.out.println("Bem vindo ao Dudu Mario RPG: O Inimigo Agora é Outro");
		
		
		
	}
	
}