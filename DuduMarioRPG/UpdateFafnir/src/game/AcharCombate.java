package game;

/*LEMBRAR:
Voltar aos stats anteriores, buffei para testes lvl 15.
Adicionei mochila para uso de itens*/
import java.util.ArrayList;

public class AcharCombate {
	public static void encontro(ArrayList<Personagem> personagens, Mochila mochila) {
		Guerreiro n = (Guerreiro)personagens.get(0);
		int l=n.getLvl();
		int r=RandomRoll.encounterRoll();
		if(l<25) {//mudei para testes
			if(r<100) {
				CombateSlime combate = new CombateSlime();
				combate.lutar(personagens,mochila);
			}
		}
	}
}
