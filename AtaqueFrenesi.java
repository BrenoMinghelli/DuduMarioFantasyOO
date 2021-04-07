package Teste;

import java.util.ArrayList;

/*Ideia
Ao escolher esse ataque o personagem entra em frenesi e eh obrigado a usar esse
ataque pelos proximos turnos ate que o inimigo alvo esteja morto.

Tentei ao maximo manter os contadores dentro desta classe para nao afetar as 
demais, mas eh uma mecanica um pouco mais "complexa".
 */
public class AtaqueFrenesi extends Ataque{
    
    int frenesi=0;
    int alvo=0;
    
    @Override
    public double atacar(int lvl, int atk, ArrayList<Inimigo> inimigos,int indice){
        this.setMultiplicador(0.6);
        
        double dano=((this.multiplicador+(this.frenesi*0.6))*atk*100)/(inimigos.get(indice).getDef()+100);
        System.out.print(inimigos.get(indice).getNome()+", causando "+dano+" de dano.\n");
        inimigos.get(indice).tomaDano(dano);
        
        if(inimigos.get(indice).isDead()){
            this.frenesi=0;
            this.alvo=0;
            return dano;
        }
        if(this.frenesi==0)System.out.print("O heroi entra em Frenesi\n");
        this.frenesi++;
        this.alvo=indice;
        return dano;
    }
    
}
