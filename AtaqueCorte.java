package Teste;

import java.util.ArrayList;

/*Ideia
Ataque padrao basico, serve de base para os demais
 */
public class AtaqueCorte extends Ataque{
    
    @Override
    public double atacar(int lvl, int atk, ArrayList<Inimigo> inimigos,int indice){
        this.setMultiplicador(1.0);
        double dano=(this.multiplicador*atk*100)/(inimigos.get(indice).getDef()+100);
        System.out.print(inimigos.get(indice).getNome()+", causando "+dano+" de dano.\n");
        inimigos.get(indice).tomaDano(dano);
        return dano;
    }
    
}
