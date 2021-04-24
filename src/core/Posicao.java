package core;

public class Posicao {
    private int x;
    private int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void apply(Movimentacao movimentacao) {
        Vetor vetor = movimentacao.getVetor();
        x += vetor.getX();
        y += vetor.getY();
    }
}
