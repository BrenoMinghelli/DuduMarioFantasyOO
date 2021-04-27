package game;

import java.util.ArrayList;

public class RegenChars {
	public static void regenChars(ArrayList<Personagem> personagens) {
		BlackMage m=(BlackMage)personagens.get(1);
		m.regenMP();
		WhiteMage w =(WhiteMage)personagens.get(2);
		w.regenMP();
		for(int i=0;i<4;i++) {
			Personagem n = personagens.get(i);
			n.regenHP();
			System.out.println(n.getNome());
			System.out.println(n.getHpA()+"/"+n.getHp());
			if(i==1){
				System.out.println(m.getMpA()+"/"+m.getMp());
			}
			if(i==2){
				System.out.println(w.getMpA()+"/"+w.getMp());
			}
		}
	}
}
