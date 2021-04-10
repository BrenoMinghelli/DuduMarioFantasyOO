public abstract class personagem {
    protected String nome;
    protected int lvl;
    protected int hp;
    protected int hpA;
    protected int atk;
    protected int def;
    protected boolean status=true;

    public personagem(String n,int l,int h,int a,int d){
        this.nome=n;
        this.lvl=l;
        this.hp=h;
        this.hpA=h;
        this.atk=a;
        this.def=d;
    }

    public int basichit(){ //atk basico q todos os personagens tem
        int dano;
        dano=randomroll.danoroll(7);
        dano=dano+atk;
        return dano;
    }

    public void setHP(int dano){  //reduz o hp do player com a entrada de dano, ja fatorando a redução pela def
        dano=dano-def;
        if(dano<=0){
            dano=1;  //min 1 de dano causado
        }
        hpA=hpA-dano;
    }
    public void printHP(){  //entrada com nome para o print fazer dps,seria removida com a interface
        System.out.println("Player"+hpA+"/"+hp);
    }
}
