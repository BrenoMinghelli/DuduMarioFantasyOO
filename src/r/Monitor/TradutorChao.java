package Monitor;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Monitor.Desenhista.ImageLoader;

public class TradutorChao{
    
    private Graphics graphics;
    private BufferedImage tiAguaareia;
    private BufferedImage tiMar;
    private BufferedImage tiGrama;
    private BufferedImage tiGramapqna;
    private BufferedImage tiArvore;
    private BufferedImage tiPedra;
    private int numeroQuarto=0;
	
    public void fontes() {
    	tiGrama     = ImageLoader.loadImage("texture/grama.png");//	    0
    	tiArvore    = ImageLoader.loadImage("texture/arvore.png");//    1
    	tiPedra     = ImageLoader.loadImage("texture/pedra.png");//	    2
    	tiAguaareia = ImageLoader.loadImage("texture/aguaareia.png");// 3
        tiMar       = ImageLoader.loadImage("texture/mar.png");//	    4
        tiGramapqna = ImageLoader.loadImage("texture/gramapqna.png");// 5        
    }
    
    public void leitorQuarto(int[][][] salas, Display display){
    	graphics = display.getCanvas().getGraphics();
    	fontes();
		for (int y=0; y<9;y++) {
		     for (int z=0; z<12;z++){
				 if (salas[numeroQuarto][y][z]==0){
					 graphics.drawImage(tiGrama, z*72, y*72, null);
				 }
				 if (salas[numeroQuarto][y][z]==1){
					 graphics.drawImage(tiArvore, z*72, y*72, null);
				 }
				 if (salas[numeroQuarto][y][z]==2){
					 graphics.drawImage(tiPedra, z*72, y*72, null);
				 }
				 if (salas[numeroQuarto][y][z]==3){
					 graphics.drawImage(tiAguaareia, z*72, y*72, null);
				 }
				 if (salas[numeroQuarto][y][z]==4){
					 graphics.drawImage(tiMar, z*72, y*72, null);
				 }
				 if (salas[numeroQuarto][y][z]==5){
					 graphics.drawImage(tiGramapqna, z*72, y*72, null);
				 }
		     }
		}
    }
    
    public void pintar(int[][][] salas, Display display){        
		int[][] sala1 = new int[][]{
			  { 1, 1, 1,	 1, 1, 1,	 1, 1, 1,	 1, 1, 1 },
			  { 1, 20, 2,	 0, 0, 0,	 0, 0, 2,	 2, 2, 1 },
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
		salas = new int[][][] {sala1,sala2,sala3};
		leitorQuarto(salas,display);
		
    }
}