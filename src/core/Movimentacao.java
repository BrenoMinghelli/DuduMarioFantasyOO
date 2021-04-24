package core;

import controller.Controle;

public class Movimentacao {

    private Vetor vetor;
    public int velocidade=3;

    public Movimentacao(double velocidade) {
        this.vetor = new Vetor(0, 0, velocidade);
    }

    public void update(Controle controle) {
        int deltaX = 0;
        int deltaY = 0;

        if(controle.ParaCima()) {deltaY--;}

        if(controle.ParaBaixo()) {deltaY++;}

        if(controle.ParaDireita()) {deltaX++;}

        if(controle.ParaEsquerda()) {deltaX--;}

        vetor = new Vetor(deltaX, deltaY,velocidade);
    }

    public Vetor getVetor() {
        return vetor;
    }
}
