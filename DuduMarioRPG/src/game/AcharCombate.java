package game;

import java.util.ArrayList;

public class AcharCombate {
	public static void encontro(ArrayList<Personagem> personagens) {
		Guerreiro n = (Guerreiro)personagens.get(0);
		int l=n.getLvl();
		int r=RandomRoll.encounterRoll();
		if(l<5) {
			if(r<100) {
				CombateSlime combate = new CombateSlime();
				combate.lutar(personagens);
			}
		}
	}
}
