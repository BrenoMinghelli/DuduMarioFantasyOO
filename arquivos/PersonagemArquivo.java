package Alpha02.arquivos;

import Alpha02.bin.Personagem;
import Alpha02.bin.GameException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Ideia:
    Classe usada como "Save Game", os metodos de salvar sobre-escrevem o arquivo
atual com o arquivo novo. Deve ser chamada no inicio, para receber os dados dos 
personagens e no fim do programa para salvar progresso. 
 */
public class PersonagemArquivo implements Serializable{
    
    public static String caminho="src\\Alpha02\\arquivos\\PersonagensSalvos.txt"; //adicioanr caminho do arquivo
    
    public static Personagem carregaPersonagem(int index) throws GameException{
        
        Personagem retorno = null;
        
        FileInputStream input;
        try {
            input = new FileInputStream(caminho);
            for(int i=0;i<=index;i++){
                ObjectInputStream lerInput = new ObjectInputStream(input);
                retorno =((Personagem)lerInput.readObject());
            }
            input.close();
            return retorno;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonagemArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersonagemArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonagemArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new GameException();
    }
    
    public static int salvaTodos(ArrayList<Personagem> personagens){
        apaga();
        for(Personagem var:personagens){
            PersonagemArquivo.salvaPersonagem(var);
        }
        return 1;
    }
    
    public static int salvaPersonagem(Personagem personagem){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho,true);
            ObjectOutputStream personagemSalvo= new ObjectOutputStream(arquivo);
            personagemSalvo.writeObject(personagem);
            personagemSalvo.flush();
            personagemSalvo.close();
            return 1;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    public static void apaga(){
        try {
            FileOutputStream writer = new FileOutputStream(caminho);
            writer.write(("").getBytes());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonagemArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersonagemArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}