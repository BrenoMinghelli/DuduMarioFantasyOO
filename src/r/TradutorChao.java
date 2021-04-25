package r;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import r.DrawImageOnCavas.ImageLoader;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TradutorChao{
    private Thread thread;
    private boolean running;
    public int width, height;

    private String string;
    
    private BufferStrategy bs;
    private BufferedImage tiAguaareia;
    private BufferedImage tiMar;
    private BufferedImage tiGrama;
    private BufferedImage tiGramapqna;
    private BufferedImage tiArvore;
    private BufferedImage tiPedra;
    
    private Graphics graphics;
    private Display display;
    
	public TradutorChao(int[][] sala1) {
	for (int y=0; y<9;y++) {
	     for (int z=0; z<12;z++){
			 if (sala1[y][z]==1){
		            graphics = display.getCanvas().getGraphics();
		            graphics.drawImage(tiArvore, z*72, y*72, null);
	 }
			 if (sala1[y][z]==2){
		            graphics = display.getCanvas().getGraphics();
		            graphics.drawImage(tiPedra, z*72, y*72, null);
     }
			 if (sala1[y][z]==0){
		            graphics = display.getCanvas().getGraphics();
		            graphics.drawImage(tiGrama, z*72, y*72, null);
     }
	}
}
}
}