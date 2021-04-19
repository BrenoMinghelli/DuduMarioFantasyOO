package Alpha02.bin;

import java.util.ArrayList;
import Alpha02.arquivos.PersonagemArquivo;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Fafnir-
    Cria 4 personagens, 1 de cada subclasse NA ORDEM Guerreiro, BlackMage, 
WhiteMage e Rogue. A ordem eh importante para o funcionamento do TesteMain por 
enquanto. Nesse TesteMain os personagens sao evoluidos pro nivel 15 para que possam
usar todas as habilidades e mecanicas. 
    Todas que eu testei por enquanto estao funcionando da forma esperada 
pelos .txt. Ainda nao consegui testar o Taunt e o Heroism 100% pois os inimigos
ainda nao escolhem os targets randomicamente e tenho apenas 1 combate, entao o 
Heroism esta persistindo.
*/
public class TesteMain {
    
    public static void main(String args[]){
        /*
        ArrayList<Personagem> personagens=new ArrayList<Personagem>();
        Guerreiro guerreiroTeste=new Guerreiro("GUERREIRO");personagens.add(guerreiroTeste);
        BlackMage magoTeste=new BlackMage("MAGO");personagens.add(magoTeste);
        WhiteMage clerigoTeste=new WhiteMage("CLERIGO");personagens.add(clerigoTeste);
        Rogue rogueTeste=new Rogue("ROGUE");personagens.add(rogueTeste);
        
        
        PersonagemArquivo.salvaTodos(personagens);
        //*/
        try {//tenta carregar o rogue
            Personagem teste=PersonagemArquivo.carregaPersonagem(3);
            System.out.println(teste.getNome());
        } catch (GameException ex) {
        Logger.getLogger(TesteMain.class.getName()).log(Level.SEVERE, null, ex);
        }//*/
            
        /* upando pra TesteMain
        for(int i=0;i<4;i++){
        for(int j=0;j<15;j++){
        personagens.get(i).levelup();
        }
        }//*/
            
            
        //combatgenerator.gerar(0, personagens);//*/
            
        /* upando pra teste
        for(int i=0;i<4;i++){
        for(int j=0;j<15;j++){
        personagens.get(i).levelup();
        }
        }//*/
            
                    /* upando pra teste
        for(int i=0;i<4;i++){
        for(int j=0;j<15;j++){
        personagens.get(i).levelup();
        }
        }//*/
            
            
        //combatgenerator.gerar(0, personagens);
        
    }
}