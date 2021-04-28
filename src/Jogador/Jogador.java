package Jogador;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyListener;

import Monitor.Display;

public class Jogador extends JFrame {

	Movimentacao movimentacao = new Movimentacao();
	
    public int x=0;
    private int y=0;
    private int velocidade=4;

	ImageIcon bonecoimg = new ImageIcon(getClass().getResource("boneco.png"));
	JLabel boneco = new JLabel (bonecoimg);
	
    public JLabel desenhoplayer(JFrame jframe) {
    	
    	movimentacao.andar(boneco,jframe);
		return (JLabel) jframe.add(boneco);
	}
}

