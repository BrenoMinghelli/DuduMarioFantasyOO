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
    Agora os personagens sao salvos em um arquivo, e no fim de cada execucao eh
possivel dar "Save Game", e voltar do nivel que parou por exemplo. Deixei como
comentarios a reinicializacao para personagens lvl 1 para caso de bug.
*/
public class TesteMain {
    
    public static void main(String args[]){
        
        ArrayList<Personagem> personagens=new ArrayList<Personagem>();
        
        /*//Cria personagens novos lvl 1
        Guerreiro p1=new Guerreiro("Guerreiro");personagens.add(p1);
        BlackMage p2=new BlackMage("MAGO");personagens.add(p2);
        WhiteMage p3=new WhiteMage("CLERIGO");personagens.add(p3);
        Rogue p4=new Rogue("ROGUE");personagens.add(p4);
        
        PersonagemArquivo.salvaTodos(personagens);
        //*/
        
        //* //Carrega os personagens para o jogo
        for(int i=0;i<4;i++){
            try {
                Personagem teste=PersonagemArquivo.carregaPersonagem(i);
                personagens.add(teste);
            } catch (GameException ex) {
            Logger.getLogger(TesteMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//*/
        /* upa personagens para o lvl 5
        for(int i=0;i<4;i++){
        for(int j=0;j<15;j++){
        personagens.get(i).levelup();
        }
        }//*/
            
        combatgenerator.gerar(0, personagens);//*/
        
        //PersonagemArquivo.salvaTodos(personagens); //Ao fim do programa salva todos os personagens
    }
}