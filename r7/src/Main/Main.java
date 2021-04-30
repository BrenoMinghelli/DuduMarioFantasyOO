package Main;

import Jogador.Desenhista;
import Monitor.Display;

public class Main {

	public static void main (String[] args) {
		Display display = new Display();
		Desenhista jogador = new Desenhista();
		
		display.initDesenhos();								//iniciar desenhos
		display.initCanvas();								//iniciar tela
	}
}