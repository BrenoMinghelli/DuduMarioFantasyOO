package Alpha02;

import java.util.ArrayList;
public class rpgmain {
    public static void main(String args[]){
         
        ArrayList<personagem> personagens=new ArrayList<personagem>();
        guerreiro guerreiroTeste=new guerreiro("Teste");personagens.add(guerreiroTeste);
        
        combatgenerator.gerar(0, personagens);
        
    }
}
