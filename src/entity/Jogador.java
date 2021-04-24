package entity;

import controller.Controle;
import core.Posicao;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Jogador extends Andantes {

    public Jogador(Controle controller) {
        super(controller);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public Image getSprite() {
        BufferedImage image = new BufferedImage(size.getLargura(), size.getAltura(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.BLUE);
        graphics.fillRect(0, 0, size.getLargura(), size.getAltura());

        graphics.dispose();
        return image;
    }
}
