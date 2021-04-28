package Main;

import Jogador.Jogador;
import Monitor.Display;

public class Main {

	public static void main (String[] args) {
		Display display = new Display();
		Jogador jogador = new Jogador();
		
		display.initDesenhos();								//iniciar desenhos
		display.initCanvas();								//iniciar tela
	}
}