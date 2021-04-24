package Jogo;

import java.io.IOException;

public class GameLoop implements Runnable {

    private Jogo game;

    private boolean running;
    private final double TaxaUpdates = 1.0d/60.0d;

    private long timeProximo;
    private int fps, ups;

    public GameLoop(Jogo game) {
        this.game = game;
    }

    @Override
    public void run() {
        running = true;
        double accumulator = 0;
        long currentTime, lastUpdate = System.currentTimeMillis();
        timeProximo = System.currentTimeMillis() + 1000;

        while(running) {
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000d;
            accumulator += lastRenderTimeInSeconds;
            lastUpdate = currentTime;

            if(accumulator >= TaxaUpdates) {
                while(accumulator >= TaxaUpdates) {
                    update();
                    accumulator -= TaxaUpdates;
                }
                
					try {
						render();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
            }
            printStats();
        }
    }

    private void printStats() {
        if(System.currentTimeMillis() > timeProximo) {
            System.out.println(String.format("FPS: %d, UPS: %d", fps, ups));
            fps = 0;
            ups = 0;
            timeProximo = System.currentTimeMillis() + 1000;
        }
    }

    private void update() {
        game.update();
        ups++;
    }

    private void render() throws IOException {
        game.render();
        fps++;
    }
}
