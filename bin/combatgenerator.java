package Alpha02.bin;

import java.util.ArrayList;
public class combatgenerator {
    
    static ArrayList<Combate> combates=new ArrayList<Combate>();
    
    public static void gerar(int area,ArrayList<Personagem> personagens){
        //Random r = new Random();
        //int d=r.nextInt(combates.size());
        //int d =0;
        if (area==0){
            CombateSlime combate1=new CombateSlime();combates.add(combate1);//adiciona todas as opções
            combates.get(0).lutar(personagens);
        }
    }
}
