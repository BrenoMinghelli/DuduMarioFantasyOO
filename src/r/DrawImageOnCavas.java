package r;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawImageOnCavas implements Runnable {
    private Display display;
    private Thread thread;
    private boolean running;
    public int width, height;
    public int numeroQuarto=3;
    private String string;
    private BufferStrategy bs;
    private Graphics graphics;
    private BufferedImage tiAguaareia;
    private BufferedImage tiMar;
    private BufferedImage tiGrama;
    private BufferedImage tiGramapqna;
    private BufferedImage tiArvore;
    private BufferedImage tiPedra;
    //private Graphics f;

    public DrawImageOnCavas(String string, int width, int height) {
        this.width = width;
        this.height = height;
        this.string = string;
    }

    @Override
    public void run() {
        init();
        System.err.println("run..." + running);
        while (running) {
            //System.err.println("run..." + running);
            render();
        }
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();

        if (bs == null) {
            System.out.println("bs is null....");
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        
        
        for(int i=0;i<0;i++){
        	for(int j=0;j<0;j++){ 
            graphics = display.getCanvas().getGraphics();
            graphics.drawImage(tiAguaareia, i*72, j*72, null);
        }
        }
        for(int a=0;a<0;a++){
        	for(int b=0;b<0;b++){ 
            graphics = display.getCanvas().getGraphics();
            graphics.drawImage(tiMar, a*72, b*72, null);
        }
        }
        
		int[][] sala1 = new int[][]{
			  { 1, 1, 1,	 1, 1, 1,	 1, 1, 1,	 1, 1, 1 },
			  { 1, 2, 2,	 0, 0, 0,	 0, 0, 2,	 2, 2, 1 },
			  { 1, 2, 0,	 0, 0, 0,	 0, 0, 0,	 2, 2, 1 },
			  
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 2, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 2, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  
			  { 1, 2, 0,	 0, 0, 0,	 0, 0, 0,	 2, 2, 1 },
			  { 1, 2, 2,	 0, 0, 0,	 0, 0, 2,	 2, 2, 1 },
			  { 1, 1, 1,	 0, 0, 0,	 0, 2, 2,	 1, 1, 1 },
			};
		int[][] sala2 = new int[][]{
			  { 1, 1, 1,	 0, 0, 0,	 0, 0, 0,	 1, 1, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
					  
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
				  
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 1, 1,	 0, 0, 0,	 0, 0, 0,	 1, 1, 1 },
			};	
		int[][] sala3 = new int[][]{
			  { 1, 1, 1,	 0, 2, 0,	 0, 2, 0,	 1, 1, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 2, 0,	 0, 0, 1 },
			  { 1, 0, 0,	 0, 0, 0,	 0, 2, 0,	 0, 0, 1 },
						  
			  { 1, 0, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 2, 2,	 2, 2, 2,	 2, 2, 2,	 2, 2, 1 },
			  { 1, 0, 0,	 0, 0, 2,	 2, 2, 2,	 2, 2, 1 },
					  
			  { 1, 0, 0,	 0, 0, 2,	 0, 2, 0,	 0, 0, 1 },
			  { 1, 0, 0,	 0, 0, 2,	 0, 2, 0,	 0, 0, 1 },
			  { 1, 1, 1,	 0, 0, 2,	 0, 2, 0,	 1, 1, 1 },
			};	
		int[][][] salas = new int[][][] {sala1,sala2,sala3};
					
		for (int y=0; y<9;y++) {
		     for (int z=0; z<12;z++){
		    	 if (numeroQuarto==1) {
					 if (salas[0][y][z]==1){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiArvore, z*72, y*72, null);
		 }
					 if (salas[0][y][z]==2){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiPedra, z*72, y*72, null);
		 }
					 if (salas[0][y][z]==0){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiGrama, z*72, y*72, null);
		 }
		 }
		    	 if (numeroQuarto==2) {
					 if (salas[1][y][z]==1){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiArvore, z*72, y*72, null);
		 }
					 if (salas[1][y][z]==2){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiPedra, z*72, y*72, null);
		 }
					 if (salas[1][y][z]==0){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiGrama, z*72, y*72, null);
		 }
		 }
		    	 if (numeroQuarto==3) {
					 if (salas[2][y][z]==1){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiArvore, z*72, y*72, null);
			 }
					 if (salas[2][y][z]==2){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiPedra, z*72, y*72, null);
		     }
					 if (salas[2][y][z]==0){
				            graphics = display.getCanvas().getGraphics();
				            graphics.drawImage(tiGrama, z*72, y*72, null);
		  }
		  }
			    	 
	      }
		  }
			//TradutorChao tradutorChao= new TradutorChao(sala1);
       // g = Display.getCanvas().getGraphics();
        //g.drawImage(testImage, 0, 0, null);
        //f = Display.getCanvas().getGraphics();
        //f.drawImage(testImage, 72, 0, null);
    }

    public static final class ImageLoader
    {
        static BufferedImage loadImage(String fileName)
        {
            BufferedImage bi = null;
            //System.err.println("....setimg...." + fileName);
            try {
                bi = ImageIO.read(new File(fileName)); 
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Image could not be read");
                System.exit(1);
            }
            return bi;
        }
    }

    private void init() {
        display = new Display(string, width, height);
        tiAguaareia = ImageLoader.loadImage("texture/aguaareia.png");
        tiMar = ImageLoader.loadImage("texture/mar.png");
        tiGrama = ImageLoader.loadImage("texture/grama.png");
        tiGramapqna = ImageLoader.loadImage("texture/gramapqna.png");
        tiArvore = ImageLoader.loadImage("texture/arvore.png");
        tiPedra = ImageLoader.loadImage("texture/pedra.png");
    }

    public synchronized void start() {
        if (running) return;
        running = true;
        thread = new Thread(this);
        thread.start();

    }

    public synchronized void stop() {
        if (!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

}