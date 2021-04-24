package Modelos;

import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grafico {
	public static Image loadImage(String filePath) {
		try {
			return ImageIO.read(Grafico.class.getResource(filePath));
		} catch (IOException e) {
			System.out.println("DEU ERRO AMIGO"+filePath);
		}
		return null;
	}

}
