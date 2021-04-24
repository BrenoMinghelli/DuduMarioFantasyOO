package Monitor;

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

import Jogo.Jogo;
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

    public void rendedr(Jogo jogo){
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        renderizador.render(jogo, graphics);

        graphics.dispose();
        bufferStrategy.show();
    }


}
