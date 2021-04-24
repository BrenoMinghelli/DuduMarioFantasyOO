package controller;

import java.awt.event.KeyEvent;

import tesssssssss.Input;

public class ControleDoJogador implements Controle {

    private Input input;

    public ControleDoJogador(Input input) {
        this.input = input;
    }

    @Override
    public boolean ParaCima() {return input.isPressed(KeyEvent.VK_W);}
    @Override		
    public boolean ParaBaixo() {return input.isPressed(KeyEvent.VK_S);}
    @Override
    public boolean ParaDireita() {return input.isPressed(KeyEvent.VK_D);}
    @Override
    public boolean ParaEsquerda() {return input.isPressed(KeyEvent.VK_A);}
}
