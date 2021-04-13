package Alpha02;

public class slime extends inimigo{
    
    public slime(String nome){ //builder com os stats do inimigo especifico
        super("Slime "+nome,1000,10,10); //buffadao pra poder testar
    }
}
