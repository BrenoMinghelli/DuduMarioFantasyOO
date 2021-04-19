package Alpha02.bin;

public class Slime extends Inimigo{
    
    public Slime(String nome){ //builder com os stats do Inimigo especifico
        super("Slime "+nome,1000,10,10); //buffadao pra poder testar
    }
}
