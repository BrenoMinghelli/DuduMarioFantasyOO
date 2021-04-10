abstract public class inimigo {
    protected int hp;
    protected int hpA;
    protected int atk;
    protected boolean status;

    public void setHP(int dano){
        hpA=hpA-dano;
    }

    public boolean isDead(){
        return status;
    }
    public int getHP(){
        return hpA;
    }
    public void printHP(){
        System.out.println(hpA+"/"+hp);
    }
    public void kill(){
        status=false;
    }
    public int basichit(int mod){  //golpe basico q todos os inimigos teriam
        int dano;
        dano=randomroll.danoroll(mod);
        dano=dano+atk;
        return dano;
    }
}
