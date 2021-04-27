package game;

public class Slime extends Inimigo{
	public Slime(String nome){ //builder com os stats do Inimigo especifico
        super("Slime "+nome,30,2,2); //buffadao pra poder testar
    }
}
