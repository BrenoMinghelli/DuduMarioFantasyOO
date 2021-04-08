package Teste;

import java.util.ArrayList;

/*Ideia
Um ataque que causa menos dano, mas reduz permanentemente a armadura de um inimigo
 */
public class AtaquePerfurante extends Ataque{
    
    @Override
    public double atacar(int lvl, int atk, ArrayList inimigos,int indice){
        this.setMultiplicador(0.7);
        ((Inimigo)inimigos.get(indice)).setDef((int)(((Inimigo)inimigos.get(indice)).getDef()*0.5));
        double dano=(this.multiplicador*atk*100)/(((Inimigo)inimigos.get(indice)).getDef()+100);
        System.out.print(((Inimigo)inimigos.get(indice)).getNome()+", causando "+dano+" de dano e reduzindo a armadura.\n");
        ((Inimigo)inimigos.get(indice)).tomaDano(dano);
        return dano;
    }
    
}
