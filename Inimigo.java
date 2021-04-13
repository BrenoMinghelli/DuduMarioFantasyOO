package Alpha02;

import java.util.ArrayList;

abstract public class inimigo {
    protected String nome;
    protected int hp;
    protected int hpA;
    protected int atk;
    
    public inimigo(String nome, int hp, int atk){
        this.nome=nome;
        this.hp=hp;
        this.hpA=hp;
        this.atk=atk;
    }
    
    public int atacar(ArrayList<personagem> personagens){
        int qualAtaque=1;//ToDO random
        int alvo=0;//ToDo random lembrar de re-rolar caso personagem.taMorto()
        if(((guerreiro)personagens.get(0)).isTaunting())alvo=0; //caso Taunt
        if(qualAtaque==1)return this.ataqueBasico(personagens.get(alvo));
        /*
        else if(qualAtaque==2)return this.ataqueBash(inimigos.get(qualInimigo));
        else if(qualAtaque==3)return this.ataqueCleave(inimigos);
        else if(qualAtaque==4)return this.ataqueTaunt(inimigos);
        */
        return -1;
    }
    
    //public int atacar(ArrayList<personagem> personagens){//ataca todos}
    
    public int ataqueBasico(personagem personagem){
        int dano;
        dano=randomroll.danoroll(5);
        dano+=(this.atk);
        personagem.tomaDano(dano);
        return dano;
    }
    
    public void tomaDano(int dano){  //reduz o hp do player com a entrada de dano, ja fatorando a redução pela def
        if(dano<=0){
            dano=1;  //min 1 de dano causado
        }
        hpA-=dano;
        System.out.print("O "+this.nome+" toma "+dano+" de dano\n");
    }
    
    public boolean taMorto(){
        if(this.hpA>0)return false;
        else {
            System.out.print("O "+this.nome+" morreu\n");
            return true;
        }
    }
    public int getHP(){
        return hpA;
    }
    public void printHP(){
        System.out.println(hpA+"/"+hp);
    }
}
