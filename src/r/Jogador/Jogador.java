package Jogador;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import java.awt.event.KeyListener;

import Monitor.Display;
import Monitor.Desenhista.ImageLoader;

public class Jogador {
	
    private Graphics graphics;
    private BufferedImage tiPlayer;
    public int x=0;
    private int y=72;
    
    public void fontes() {
    	tiPlayer = ImageLoader.loadImage("texture/boneco.png");//			Player  
    }
    
    public void desenharPlayer(Display display){
    	fontes();
    	graphics = display.getCanvas().getGraphics();
    	graphics.drawImage(tiPlayer, x, 72, null);
    	x+=10;
}   
    public int movimentoX() {
    	System.out.println("sssssssssssssss");
    	this.x=x;
    	System.out.println(x);
    	x+=10;
    	return x;
    }
}

