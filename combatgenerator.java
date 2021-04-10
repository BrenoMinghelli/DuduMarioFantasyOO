import java.util.Random;
import java.util.ArrayList;
public class combatgenerator {
    public static void gerar(int area,ArrayList<personagem> chars){
        Random r = new Random();
        int d;
        if (area==0){  
            d=r.nextInt(4);
            if(d<4){
                combateteste.criaCombate(chars);
            }
        }
    }
}
