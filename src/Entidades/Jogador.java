package Entidades;

import tesssssssss.teeee;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Controle.Controle;
import Propriedades.Posicao;

public class Jogador extends Andantes {

    public Jogador(Controle controller) {
        super(controller);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public Image getSprite() throws IOException {
        BufferedImage image = new BufferedImage(tamanho.getLargura(), tamanho.getAltura(), BufferedImage.TYPE_INT_RGB);

        BufferedImage graphics = ImageIO.read(new File("res/chao/arvore.png"));

        return image;
    }
}
