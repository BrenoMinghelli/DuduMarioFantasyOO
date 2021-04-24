package entity;

import controller.Controle;
import core.Movimentacao;
import core.Vetor;

public abstract class Andantes extends GameObject {

    private Controle controle;
    private Movimentacao movement;

    public Andantes(Controle controle) {
        super();
        this.controle = controle;
        this.movement = new Movimentacao(2);
    }
   
    @Override
    public void update() {
        movement.update(controle);
        position.apply(movement);
    }
    
    public void apply(Movimentacao movimentacao) {
        Vetor vetor = movimentacao.getVetor();
        double x = vetor.getX();
        double y = vetor.getY();
}
}