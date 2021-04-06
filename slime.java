import java.util.Random;

public class slime extends npc{ //um dos inimigos pra teste
    public slime(String x){ //builder com os stats do inimigo especifico
        this.nome="slime"+x;
        this.hp=15;
        this.hpA=15;
        this.atk=3;
        this.def=0;
        this.status=true;
    }
    public int dano(){  //atk base do inimigo, outros inimigos teriam outros atks
        Random r = new Random();
        int d= r.nextInt(3);
        int n=atk+d+3;
        return n;
    }
}
