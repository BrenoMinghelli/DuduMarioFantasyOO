package Auxiliar;
import java.util.Random;

public class Aleatorio {
    public static int danoroll(int max){
        Random random = new Random();
        int aleatorio = random.nextInt(max);
        return aleatorio;
    }
}