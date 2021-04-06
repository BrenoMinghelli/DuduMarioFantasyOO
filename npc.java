import java.util.Random;
public class npc {  //base dos inimigos
    protected String nome;
    protected int hp;
    protected int hpA;
    protected int atk;
    protected int def;
    protected boolean status; //atributo importante para saber c esta vivo ou nao

    public int alvo(){  //"sorteia" o alvo do inimigo naquele turno
        Random r = new Random();
        int d= r.nextInt(1);  //o "1" vira 4 para ser possivel acertar todos os 4 personagens do jogador, mas esta assim pra motivo de teste
        d=d+1; //o random vai de 0 a n, sendo n=(valor)-1; portanto é mais intuitivo usar o +1
        return d;
    }
}
