package Teste;

import java.util.ArrayList;

/*Ideia
Um ataque que causa menos dano, mas reduz permanentemente a armadura de um inimigo
 */
public class AtaquePerfurante extends Ataque{
    
    @Override
    public double atacar(int lvl, int atk, ArrayList<Inimigo> inimigos,int indice){
        this.setMultiplicador(0.7);
        inimigos.get(indice).setDef((int)(inimigos.get(indice).getDef()*0.5));
        double dano=(this.multiplicador*atk*100)/(inimigos.get(indice).getDef()+100);
        System.out.print(inimigos.get(indice).getNome()+", causando "+dano+" de dano e reduzindo a armadura.\n");
        inimigos.get(indice).tomaDano(dano);
        return dano;
    }
    
}
