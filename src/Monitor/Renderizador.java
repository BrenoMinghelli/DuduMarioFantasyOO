package Monitor;

import java.awt.*;
import java.io.IOException;

import Jogo.Jogo;

public class Renderizador {

    public void render(Jogo game, Graphics graphics) {
        game.getGameObjects().forEach(gameObject -> {
			try {
				graphics.drawImage(
				        gameObject.getSprite(),
				        gameObject.getPosicao().getX(),
				        gameObject.getPosicao().getY(),
				        null
				);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
    }
}
