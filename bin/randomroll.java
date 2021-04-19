package Alpha02.bin;



import java.util.Random;

public class randomroll {
    public static int danoroll(int max){
        Random r = new Random();
        int ro=r.nextInt(max);
        return ro;
    }
}
