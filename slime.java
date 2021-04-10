import java.util.ArrayList;
public class slime extends inimigo{
    public slime(){
        this.hp=15;
        this.hpA=15;
        this.atk=5;
        this.status=true;
    }
    public ArrayList<Integer> turno(){  //turno do slime, outros inimigos teriam outras opções de atks
        ArrayList<Integer> control = new ArrayList<Integer>();
        System.out.println("Turno slime");//dps mudar pra ("Turno"+nome) mas preguiça de criar nome agr
        int dano=this.basichit(5);
        int aoe=0;  //aoe sempre 0 pq esse inimigo so teria um atk, caso o AOE fosse 1 acertaria em todos
        control.add(dano);
        control.add(aoe);
        return control;
    }
}
