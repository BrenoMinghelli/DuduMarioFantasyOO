import java.util.Random;

public class fighter extends pc{
    public fighter(String n){ //builder
        this.nome=n;
        this.lvl=1;
        this.hp=15;
        this.hpA=15;
        this.atk=7;
        this.def=5;
        this.status=true; //atributo importante para saber c esta vivo ou nao
    }

    public void getstats(){ //print stats (todos os "println" seriam substituidos com interface grafica)
        System.out.println("Nome:"+nome);
        System.out.println("HP:"+hpA+"/"+hp);
        System.out.println("Atk:"+atk);
        System.out.println("Def:"+def);
    }

    public void setHP(int n){ //setHP
        hpA=hpA-n;
    }
    public int getHP(){ //get hp
        return hpA;
    }

    public int dmg(){  //dano do atk basico, possivelmente aumentar o valor com o lvl up
        Random r = new Random(); //outros personagens teriam outros tipos de atks
        int d= r.nextInt(atk);
        int n=atk+d+1;
        return n;
    }

    public static void showA(){  //mostra as ações
        System.out.println("1.Atk");
    }
}
