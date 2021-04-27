package game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		ArrayList<Personagem> personagens=new ArrayList<Personagem>();
		personagens=GetPersonagens.getP(personagens);
		Scanner teclado = new Scanner(System.in);
		int escolha;
		System.out.println("Bem vindo ao Dudu Mario RPG: O Inimigo Agora é Outro");
		while(true) {
			System.out.println("1.Procurar um combate\n2.Descansar na cidade\n3.Olhar os personagens\n4.Sair do jogo");
			escolha = teclado.nextInt();
				if(escolha==1) {
					AcharCombate.encontro(personagens);
				}
				if(escolha==2) {
					RegenChars.regenChars(personagens);
				}
				if(escolha==3) {
					//show chars
				}
				if(escolha==4) {
					teclado.close();
					return;
				}
		}
	}
	
}
