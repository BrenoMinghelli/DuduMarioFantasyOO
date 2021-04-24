package display;

//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import javax.swing.BorderFactory;
//import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import game.Jogo;
import tesssssssss.Input;

public class Tela extends JFrame{
	
	private Canvas canvas; //achei canvas mais facil que JFrame
	private Renderizador renderizador;
	
	public Tela(int largura, int altura, Input input){
		canvas = new Canvas();
		
		setTitle("baile");//nome
		setResizable(false);//nao da para esticar
		//frame.setLocationRelativeTo(null);// acho que daria para posicionar no meio da tela 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setFocusable(false);
		
		this.renderizador= new Renderizador();
		
		canvas.setPreferredSize(new Dimension(largura,altura));
		
		add(canvas);
		addKeyListener(input);
		
		
		pack();
		
		canvas.createBufferStrategy(3);//ver oq acontece com 2
		setVisible(true);
	} 
	
	public void render (Jogo game) throws IOException {
		BufferedImage myPicture = ImageIO.read(new File("D:\\OneDrive\\Área de Trabalho\\EzMrJPeVIAA2ZY3.png"));
		
		renderizador.render(game, graficos);
		
		graficos.dispose();
		getBufferStrategy().show();
	}

}
