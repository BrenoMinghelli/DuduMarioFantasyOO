package Teste;

import java.util.ArrayList;


public class Slime extends Inimigo{ //um dos inimigos pra teste
    
    public Slime(String nome){ //builder com os stats do inimigo especifico
        super("Slime"+nome,1,15,3,0);
        AtaqueBasicoInimigo basico=new AtaqueBasicoInimigo();
        this.ataques.add(basico);
    }
    
    @Override
    public double atacar(ArrayList<Personagem> personagens, int alvo){
        if(personagens.get(alvo).isDead()){
            System.out.print("O Personagem ja esta morto.\n");
            double dano=0;
            return dano;
        }
        System.out.print("O "+this.nome+" atacou o ");
        int indice=0; //qual ataque usar TODO implementar random
        double dano=this.ataques.get(indice).atacar(this.lvl,this.atk,personagens,alvo);
        return dano;
    }
    
    /*
    public int dano(){  //atk base do inimigo, outros inimigos teriam outros atks
        Random r = new Random();
        int d= r.nextInt(3);
        int n=atk+d+3;
        return n;
    }*/
}
