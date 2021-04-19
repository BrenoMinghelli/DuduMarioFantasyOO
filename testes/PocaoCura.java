package Alpha02;

import Alpha02.testes.Item;
import Alpha02.bin.Personagem;

/*ToDo: Como saber qual objeto passar de parametro para o Item?
 */
public class PocaoCura extends Item{
    
    public PocaoCura(){
        this.setNome("Pocao de Cura");
        this.setValor(10);
    }

    @Override
    public int usar(Object alvo) {
        if(Personagem.class!=alvo.getClass()){System.out.print("Entrada Invalida para Item\n"); return -1;}
        this.setQuantidade(this.getQuantidade()-1);
        ((Personagem)alvo).curar(20);
        return this.getQuantidade();
    }

    @Override
    public boolean ehBebivel() {
        return true;
    }
    
    
    
    
}
