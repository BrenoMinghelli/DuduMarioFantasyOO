package Teste;

import java.util.ArrayList;

/*Ideia
Um ataque que atinge todos os inimigos do campo, causando uma parcela de dano em
cada um.

Bug
Por algum motivo o inimigo indice esta tomando todo o dano somado. Invez de parte
do dano ser causado em cada oponente.
 */
public class AtaqueGiratorio extends Ataque{
    
    @Override
    public double atacar(int lvl, int atk, ArrayList inimigos,int indice){
        this.setMultiplicador(0.5);
        double danoTotal=0;
        for(int i=0;i<=inimigos.size();i++){
            if (danoTotal>0)System.out.print("e o ");
            double dano=(this.multiplicador*atk*100)/(((Inimigo)inimigos.get(i)).getDef()+100);
            danoTotal+=dano;
            System.out.print(((Inimigo)inimigos.get(i)).getNome()+", causando "+dano+" de dano ");
            ((Inimigo)inimigos.get(i)).tomaDano(dano);
        }System.out.print("\n");
        return danoTotal;
    }
    
}
