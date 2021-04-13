package Alpha02;

import java.util.ArrayList;
public class combatgenerator {
    
    static ArrayList<combate> combates=new ArrayList<combate>();
    
    public static void gerar(int area,ArrayList<personagem> personagens){
        //Random r = new Random();
        //int d=r.nextInt(combates.size());
        //int d =0;
        if (area==0){
            combateSlime combate1=new combateSlime();combates.add(combate1);//adiciona todas as opções
            combates.get(0).lutar(personagens);
        }
    }
}
