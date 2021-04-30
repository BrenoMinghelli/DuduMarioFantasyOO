package Jogador;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Chao.PosicionadorSalas;

import java.awt.event.KeyListener;

import Monitor.Display;

public class Desenhista extends JFrame {

	Movimentacao movimentacao = new Movimentacao();
	
	ImageIcon bonecoimg = new ImageIcon(getClass().getResource("boneco.png"));
	JLabel boneco = new JLabel (bonecoimg);
    
    ImageIcon sala1img = new ImageIcon(getClass().getResource("sala1.png"));
    JLabel sala1 = new JLabel (sala1img);
    
    ImageIcon sala2img = new ImageIcon(getClass().getResource("sala2.png"));
    JLabel sala2 = new JLabel (sala2img);
    
    ImageIcon sala3img = new ImageIcon(getClass().getResource("sala3.png"));
    JLabel sala3 = new JLabel (sala3img);
    
    ImageIcon sala4img = new ImageIcon(getClass().getResource("sala4.png"));
    JLabel sala4 = new JLabel (sala4img);
    
    ImageIcon sala5img = new ImageIcon(getClass().getResource("sala5.png"));
    JLabel sala5 = new JLabel (sala5img);
    
    ImageIcon sala6img = new ImageIcon(getClass().getResource("sala6.png"));
    JLabel sala6 = new JLabel (sala6img);
    
    ImageIcon sala7img = new ImageIcon(getClass().getResource("sala7.png"));
    JLabel sala7 = new JLabel (sala7img);
    
    ImageIcon sala8img = new ImageIcon(getClass().getResource("sala8.png"));
    JLabel sala8 = new JLabel (sala8img);
    
    ImageIcon sala9img = new ImageIcon(getClass().getResource("sala9.png"));
    JLabel sala9 = new JLabel (sala9img);
    
    ImageIcon sala10img = new ImageIcon(getClass().getResource("sala10.png"));
    JLabel sala10 = new JLabel (sala10img);
    
    ImageIcon sala11img = new ImageIcon(getClass().getResource("sala11.png"));
    JLabel sala11 = new JLabel (sala11img);
    
    ImageIcon sala12img = new ImageIcon(getClass().getResource("sala12.png"));
    JLabel sala12 = new JLabel (sala12img);
    
    ImageIcon sala13img = new ImageIcon(getClass().getResource("sala13.png"));
    JLabel sala13 = new JLabel (sala13img);
    
    ImageIcon sala14img = new ImageIcon(getClass().getResource("sala14.png"));
    JLabel sala14 = new JLabel (sala14img);
    
    ImageIcon sala15img = new ImageIcon(getClass().getResource("sala15.png"));
    JLabel sala15 = new JLabel (sala15img);
    
    ImageIcon sala16img = new ImageIcon(getClass().getResource("sala16.png"));
    JLabel sala16 = new JLabel (sala16img);
    
    ImageIcon sala17img = new ImageIcon(getClass().getResource("sala17.png"));
    JLabel sala17 = new JLabel (sala17img);
    
    ImageIcon sala18img = new ImageIcon(getClass().getResource("sala18.png"));
    JLabel sala18 = new JLabel (sala18img);
    
    ImageIcon sala19img = new ImageIcon(getClass().getResource("sala19.png"));
    JLabel sala19 = new JLabel (sala19img);
    
    ImageIcon sala20img = new ImageIcon(getClass().getResource("sala20.png"));
    JLabel sala20 = new JLabel (sala20img);
    
    public void desenhoplayer(JFrame jframe) {
    	
    	movimentacao.andar(boneco,jframe,sala1,sala2,sala3,sala4,sala5,sala6,sala7,sala8,sala9,sala10,sala11,sala12,sala13,sala14,sala15,sala16,sala17,sala18,sala19,sala20);
		jframe.add(boneco);
		jframe.add(sala1);
		jframe.add(sala2);
		jframe.add(sala3);
		jframe.add(sala4);
		jframe.add(sala5);
		jframe.add(sala6);
		jframe.add(sala7);
		jframe.add(sala8);
		jframe.add(sala9);
		jframe.add(sala10);
		jframe.add(sala11);
		jframe.add(sala12);
		jframe.add(sala13);
		jframe.add(sala14);
		jframe.add(sala15);
		jframe.add(sala16);
		jframe.add(sala17);
		jframe.add(sala18);
		jframe.add(sala19);
		jframe.add(sala20);
		
		boneco.setBounds(410,324,45,72);
	}
}