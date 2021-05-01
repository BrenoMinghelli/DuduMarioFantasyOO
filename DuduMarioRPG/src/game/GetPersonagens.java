package game;
import java.util.ArrayList;

public class GetPersonagens {
	public static ArrayList<Personagem> getP(ArrayList<Personagem> personagens){
        
		Guerreiro P1 = new Guerreiro("Dudu Mario");// para mudar o nivel no start so adicionar ("nome",lvl)
        BlackMage P2 = new BlackMage("Suuussss");
        WhiteMage P3 = new WhiteMage("Waifu do Dudu Mario");
        Rogue P4 = new Rogue("Nyx");
        personagens.add(P1);
        personagens.add(P2);
        personagens.add(P3);
        personagens.add(P4);
        return personagens;
        
    }
}
