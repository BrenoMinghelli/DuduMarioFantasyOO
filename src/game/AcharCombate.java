package game;

import java.util.ArrayList;

import javax.swing.JFrame;

public class AcharCombate {
	
	private static int fimcombate=0;
	
	public static int encontro(ArrayList<Personagem> personagens,Mochila mochila) {
		Guerreiro n = (Guerreiro)personagens.get(0);
		int l=n.getLvl();
		int r=RandomRoll.encounterRoll();
		if(l<5) {
			if(r>=50) {
				CombateSlime combate = new CombateSlime();
				System.out.println("Combate contra 2 slimes encontrado!");
				fimcombate=combate.lutar(personagens,mochila);
			}
			if(r<50) {
				CombateZumbi combate = new CombateZumbi();
				System.out.println("Combate contra 4 zumbis encontrado!");
				fimcombate=combate.lutar(personagens, mochila);
			}
		}
		if(l>5 && l<10) {
			if(r<=35) {
				CombateLagartoMago combate = new CombateLagartoMago();
				System.out.println("Combate contra 2 Lizard Wizards encontrado!");
				combate.lutar(personagens, mochila);
			}
			if(r>35 && r<=65) {
				CombateFDLS combate = new CombateFDLS();
				System.out.println("Ah não, combate contra o fã clube do Leandro Sertanejo encontrado!");
				combate.lutar(personagens, mochila);
			}
			if(r>70) {
				CombatePdEM combate = new CombatePdEM();
				System.out.println("Apareceram professor do ensino médio para te impedir!");
				combate.lutar(personagens, mochila);
			}
		}
		if(l>11) {
			if(r<=90) {
				CombateLeandroSertanejo combate = new CombateLeandroSertanejo();
				System.out.println("Finalmente, ele, O LEANDRO SERTANEJO!!!");
				combate.lutar(personagens, mochila);
				System.out.println("Leandro Sertanejo: Essa nem é minha forma final MUAHAHAHA");
				RegenChars.regenChars(personagens);
				CombateLSFF combate2 = new CombateLSFF();
				combate2.lutar(personagens, mochila);
			}
			if(r>90) {
				System.out.println("Um Ral de Cueca foi encontrado... pera, por que ele está aqui???\nBem, ele te deseja boa sorte na batalha final");
			}
		}
		return fimcombate;
	}
}
