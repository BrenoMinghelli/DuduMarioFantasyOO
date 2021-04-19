package Alpha02;

import Alpha02.testes.Item;
import Alpha02.bin.Personagem;
import Alpha02.bin.Inimigo;
import java.util.ArrayList;

/*ToDo: Como saber qual objeto passar de parametro para o Item?
 */
public class Mochila {
    
    private ArrayList<Item> itens;
    private static int ouro=0;
    
    public void adicionaItem(Item i){
        if(itens.contains(i)){
            itens.get(itens.indexOf(i)).setQuantidade();
        }
        itens.add(i);
    }
    
    public void imprime(){}
    
    public int usaItem(int indice, Personagem heroi, ArrayList<Inimigo> inimigos, int qualInimigo){
        try{//checa se o Item existe e se ainda tem cargas sobrando
            if(itens.get(indice).getQuantidade()==0)itens.remove(indice);
        }catch(IndexOutOfBoundsException ex){System.out.print("Item invalido\n");return -1;}
        if(itens.get(indice).ehBebivel()){
            if(itens.get(indice).usar(heroi)==0)itens.remove(indice);
        }else{
            if(itens.get(indice).usar(inimigos)==0)itens.remove(indice);
        }
        return 1;
    }
    
    public static int getOuro() {return ouro;}
    public static void setOuro(int aOuro) {ouro = aOuro;}
}
