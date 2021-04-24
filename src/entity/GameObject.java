package entity;

import core.Posicao;
import core.Tamanho;

import java.awt.*;

public abstract class GameObject {
    protected Posicao position;
    protected Tamanho size;

    public GameObject() {
        position = new Posicao(50, 50);
        size = new Tamanho(50, 50);
    }

    public abstract void update();
    public abstract Image getSprite();

    public Posicao getPosition() {
        return position;
    }

    public Tamanho getSize() {
        return size;
    }
}