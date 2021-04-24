package Entidades;

import java.awt.*;
import java.io.IOException;

import Propriedades.Posicao;
import Propriedades.Tamanho;

public abstract class GameObject {
    protected Posicao posicao;
    protected Tamanho tamanho;

    public GameObject() {
        posicao = new Posicao(50, 50);
        tamanho = new Tamanho(50, 50);
    }

    public abstract void update();
    public abstract Image getSprite() throws IOException;

    public Posicao getPosicao() {
        return posicao;
    }

    public Tamanho getSize() {
        return tamanho;
    }
}