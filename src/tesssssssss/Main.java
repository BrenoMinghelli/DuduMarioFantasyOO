package tesssssssss;
import game.Jogo;
import game.GameLoop;

public class Main {

    public static void main(String[] args) {
    	new Thread(new GameLoop(new Jogo (800,600))).start();
    }
}
