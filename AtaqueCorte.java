package Teste;

import java.util.ArrayList;

/*Ideia
Ataque padrao basico, serve de base para os demais
 */
public class AtaqueCorte extends Ataque{
    
    @Override
    public double atacar(int lvl, int atk, ArrayList inimigos,int indice){
        this.setMultiplicador(1.0);
        double dano=(this.multiplicador*atk*100)/(((Inimigo)inimigos.get(indice)).getDef()+100);
        System.out.print(((Inimigo)inimigos.get(indice)).getNome()+", causando "+dano+" de dano.\n");
        ((Inimigo)inimigos.get(indice)).tomaDano(dano);
        return dano;
    }
    
}
