package core;

public class Vetor {

    private double x;
    private double y;

    public Vetor(double x, double y, double velocidade) {
        this.x = x*= velocidade;
        this.y = y*= velocidade;
    }
    
    public double getX() {return x;}

    public double getY() {return y;}
}
