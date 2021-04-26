package Monitor;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Jogador.Jogador;

public class Desenhista implements Runnable {
    private Display display;
    private Thread thread;
    
    private boolean running;
    
    public int width, height;
    private String string;
    
    private BufferStrategy bs;
    
    int[][][] salas;
    
    TradutorChao tradutorChao = new TradutorChao();
    Jogador jogador = new Jogador();

    public Desenhista(String string, int width, int height) {
        this.width = width;
        this.height = height;
        this.string = string;
    }

    @Override
    public void run() {
    	display = new Display(string, width, height);
        while (running) {
            render();
        }
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        
        
        jogador.desenharPlayer(display);
        tradutorChao.pintar(salas,display);
        
    }

    public static final class ImageLoader{
        public static BufferedImage loadImage(String fileName){
            BufferedImage bi = null;
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