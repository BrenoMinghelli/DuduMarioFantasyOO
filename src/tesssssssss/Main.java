package tesssssssss;
import Jogo.GameLoop;
import Jogo.Jogo;

public class Main {

    public static void main(String[] args) {
    	new Thread(new GameLoop(new Jogo (864,648))).start();
    }
}
