package game;

import java.util.ArrayList;

public class MostrarAction {
	public static void mostrarAction(int i,ArrayList<Personagem> personagens) {
		if(i==0) {
			Guerreiro n = (Guerreiro)personagens.get(i);
			n.showActions();
		}
		if(i==1) {
			BlackMage n = (BlackMage)personagens.get(i);
			n.showActions();
		}
		if(i==2) {
			WhiteMage n = (WhiteMage)personagens.get(i);
			n.showActions();
		}
		if(i==3) {
			Rogue n = (Rogue)personagens.get(i);
			n.showActions();
		}
	}
}
