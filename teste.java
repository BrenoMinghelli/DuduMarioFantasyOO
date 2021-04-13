package Alpha02;

import java.util.ArrayList;

/*Fafnir-
    Cria 4 personagens, 1 de cada subclasse NA ORDEM guerreiro, blackMage, 
whiteMage e rogue. A ordem eh importante para o funcionamento do teste por 
enquanto. Nesse teste os personagens sao evoluidos pro nivel 15 para que possam
usar todas as habilidades e mecanicas. 
    Todas que eu testei por enquanto estao funcionando da forma esperada 
pelos .txt. Ainda nao consegui testar o Taunt e o Heroism 100% pois os inimigos
ainda nao escolhem os targets randomicamente e tenho apenas 1 combate, entao o 
Heroism esta persistindo.
*/
public class teste {
    
    public static void main(String args[]){
         
        ArrayList<personagem> personagens=new ArrayList<personagem>();
        guerreiro guerreiroTeste=new guerreiro("GUERREIRO");personagens.add(guerreiroTeste);
        blackMage magoTeste=new blackMage("MAGO");personagens.add(magoTeste);
        whiteMage clerigoTeste=new whiteMage("CLERIGO");personagens.add(clerigoTeste);
        rogue rogueTeste=new rogue("ROGUE");personagens.add(rogueTeste);
        
        ///* upando pra teste
        for(int i=0;i<4;i++){
            for(int j=0;j<15;j++){
            personagens.get(i).levelup();
            }
        }//*/
        
        
        combatgenerator.gerar(0, personagens);
        
    }
}