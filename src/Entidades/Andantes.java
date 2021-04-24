package Entidades;

import Controle.Controle;
import Propriedades.Movimentacao;
import Propriedades.Vetor;

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
        posicao.apply(movement);
    }
    
    public void apply(Movimentacao movimentacao) {
        Vetor vetor = movimentacao.getVetor();
        double x = vetor.getX();
        double y = vetor.getY();
}
}