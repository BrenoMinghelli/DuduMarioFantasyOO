package Jogador;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import game.AcharCombate;
import game.Display;
import game.Mochila;
import game.Personagem;

import java.awt.event.KeyListener;

public class Desenhista{
	
	private int y= 324;
	private int x= 410;
	
	static JFrame jframe = new JFrame();

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
    
	ImageIcon tituloimg = new ImageIcon(getClass().getResource("titulo.png"));
	JLabel titulo = new JLabel (tituloimg);
	
	ImageIcon fundoimg = new ImageIcon(getClass().getResource("fundo.png"));
	JLabel fundo = new JLabel (fundoimg);
	
	ImageIcon selecionarimg = new ImageIcon(getClass().getResource("selecionar.png"));
	final JLabel selecionar = new JLabel (selecionarimg);
	
	ImageIcon iniciarimg = new ImageIcon(getClass().getResource("iniciarpuro.png"));
	final JLabel iniciar = new JLabel (iniciarimg);
	
	ImageIcon iniciarSELimg = new ImageIcon(getClass().getResource("iniciarSEL.png"));
	final JLabel iniciarSEL = new JLabel (iniciarSELimg);
	
	ImageIcon sairimg = new ImageIcon(getClass().getResource("sair puro.png"));
	final JLabel sair = new JLabel (sairimg);
	
	ImageIcon sairSELimg = new ImageIcon(getClass().getResource("sairSEL.png"));
	final JLabel sairSEL = new JLabel (sairSELimg);
	
	ImageIcon escuroimg = new ImageIcon(getClass().getResource("escuro.png"));
	final JLabel escuro = new JLabel (escuroimg);
	
	ImageIcon pauseimg = new ImageIcon(getClass().getResource("pause.png"));
    JLabel pause = new JLabel (pauseimg);
    
    ImageIcon selecionar2img = new ImageIcon(getClass().getResource("selecionar2.png"));
    JLabel selecionar2 = new JLabel (selecionar2img);
    
	ImageIcon fundoprimarioimg = new ImageIcon(getClass().getResource("aaaaaaaaa.png"));
	JLabel fundoprimario = new JLabel (fundoimg);
	
    public void desenhoplayer(JFrame jframe, ArrayList<Personagem> personagens,Mochila mochila) {
    	
    	movimentacao.andar(boneco,jframe,sala1,sala2,sala3,sala4,sala5,sala6,sala7,sala8,sala9,sala10,
    			sala11,sala12,sala13,sala14,sala15,sala16,sala17,sala18,sala19,sala20,
    			titulo, fundo, selecionar, iniciar, iniciarSEL,sair,sairSEL,escuro,pause,selecionar2,personagens,mochila,fundoprimario);
    
		jframe.add(titulo);
		jframe.add(iniciarSEL);
		jframe.add(iniciar);
		jframe.add(sairSEL);
		jframe.add(sair);
		jframe.add(selecionar);
		jframe.add(fundo);
    	
		jframe.add(selecionar2);
		jframe.add(pause);
		//jframe.add(escuro);
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
		jframe.add(fundoprimario);
		
		sala1.setBounds(-67,-178,1000,1000);	// primeira sala
		boneco.setBounds(x,y,45,72);
		escuro.setBounds(-1250+x,-1250+y,2500,2500);
		
		titulo.setBounds(32,50,800,200);
		
		iniciarSEL.setBounds(590,400,272,110);
		iniciar.setBounds(590,400,272,110);
		sair.setBounds(590,530,272,110);
		
		fundo.setBounds(0,0,1000,700);
		pause.setBounds(50,50,400,200);

		selecionar.setBounds(500,400,45,90);
		fundo.setBounds(0, 0, 864/*/largura/*/, 648/*/altura/*/);;
	}
}