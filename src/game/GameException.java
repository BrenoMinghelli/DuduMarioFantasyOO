package game;

public class GameException extends Exception{
	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage(){
        return "Entrada Invalida";
    }
}
