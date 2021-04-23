package Alpha02.bin;

import java.util.ArrayList;

/*
 */
public class Cidade {
    
    //ArrayList<Loja> lojas;
    
    public void recuperaPersonagens(ArrayList<Personagem> personagens){
        for(int i=0;i<4;i++){
            personagens.get(i).setHpA(personagens.get(i).getHp());
            if(personagens.get(i) instanceof Mago){//se for Mago recupera a mana
                ((Mago)personagens.get(i)).setMpA(((Mago)personagens.get(i)).getMp());
            }
        }
    }
    
}
