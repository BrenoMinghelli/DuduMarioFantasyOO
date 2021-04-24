package display;

import game.Jogo;

import java.awt.*;

public class Renderizador {

    public void render(Jogo game, Graphics graphics) {
        game.getGameObjects().forEach(gameObject -> graphics.drawImage(
                gameObject.getSprite(),
                gameObject.getPosition().getX(),
                gameObject.getPosition().getY(),
                null
        ));
    }
}
