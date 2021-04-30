package Jogador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Chao.TradutorChao;

public class Movimentacao{
	
	int [][][]salas;
	int [][]achar;
    private int x=410;
    private int y=324;
    private int velocidade=20;
    private int alteradorX=0;
    private int alteradorY=0;
    
	public int andar(final JLabel andante, final JFrame jframe,
			final JLabel sala1,final JLabel sala2,final JLabel sala3,final JLabel sala4,final JLabel sala5,
			final JLabel sala6,final JLabel sala7,final JLabel sala8,final JLabel sala9,final JLabel sala10,
			final JLabel sala11,final JLabel sala12,final JLabel sala13,final JLabel sala14,final JLabel sala15,
			final JLabel sala16,final JLabel sala17,final JLabel sala18,final JLabel sala19,final JLabel sala20) {
		
		
		sala1.setBounds(-67,-178,1000,1000);	// primeira sala
		
		jframe.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyPressed(KeyEvent e) {
			cima(e);
			baixo(e);
			esquerda(e);
			direita(e);
			
			System.out.println("Y: "+alteradorY);

			System.out.println("X: "+alteradorX);
			 andante.setBounds(x,y,45,72);
			 
			 if (alteradorX==0 && alteradorY==0){			//sala1
				 sala1.setBounds(-67,-178,1000,1000);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(1);
			 }
			 if (alteradorY==1 && alteradorX==0){			//sala2
				 sala2.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(2);
			 }
			 if (alteradorY==2 && alteradorX==0){			//sala3
				 sala3.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(3);
			 }
			 if (alteradorY==3 && alteradorX==0){			//sala4
				 sala4.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(4);
			 }
			 if (alteradorY==2 && alteradorX==1){			//sala5
				 sala5.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(5);
			 }
			 if (alteradorY==3 && alteradorX==1){			//sala6
				 sala6.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(6);
			 }
			 if (alteradorY==4 && alteradorX==2){			//sala7
				 sala7.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(7);
			 }
			 if (alteradorY==4 && alteradorX==3){			//sala8
				 sala8.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(8);
			 }
			 if (alteradorY==3 && alteradorX==2){			//sala9
				 sala9.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(0);
			 }
			 if (alteradorY==3 && alteradorX==3){			//sala10
				 sala10.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(5);
			 }
			 if (alteradorY==2 && alteradorX==2){			//sala11
				 sala11.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(9);
			 }
			 if (alteradorY==3 && alteradorX==4){			//sala12
				 sala12.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(10);
			 }
			 if (alteradorY==2 && alteradorX==3){			//sala13
				 sala13.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(2);
			 }
			 if (alteradorY==2 && alteradorX==4){			//sala14
				 sala14.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(2);
			 }
			 if (alteradorY==1 && alteradorX==4){			//sala15
				 sala15.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(9);
			 }
			 if (alteradorY==1 && alteradorX==3){			//sala16
				 sala16.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(0);
			 }
			 if (alteradorY==1 && alteradorX==2){			//sala17
				 sala17.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(4);
			 }
			 if (alteradorY==0 && alteradorX==2){			//sala18
				 sala18.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(1);
			 }
			 if (alteradorY==0 && alteradorX==3){			//sala19
				 sala19.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala20.setBounds(2000,2000,72,72);
				 naoanda(2);
			 }
			 if (alteradorY==-1 && alteradorX==3){			//sala20
				 sala20.setBounds(-67,-178,1000,1000);
				 sala1.setBounds(2000,2000,72,72);
				 sala2.setBounds(2000,2000,72,72);
				 sala3.setBounds(2000,2000,72,72);
				 sala4.setBounds(2000,2000,72,72);
				 sala5.setBounds(2000,2000,72,72);
				 sala6.setBounds(2000,2000,72,72);
				 sala7.setBounds(2000,2000,72,72);
				 sala8.setBounds(2000,2000,72,72);
				 sala9.setBounds(2000,2000,72,72);
				 sala10.setBounds(2000,2000,72,72);
				 sala11.setBounds(2000,2000,72,72);
				 sala12.setBounds(2000,2000,72,72);
				 sala13.setBounds(2000,2000,72,72);
				 sala14.setBounds(2000,2000,72,72);
				 sala15.setBounds(2000,2000,72,72);
				 sala16.setBounds(2000,2000,72,72);
				 sala17.setBounds(2000,2000,72,72);
				 sala18.setBounds(2000,2000,72,72);
				 sala19.setBounds(2000,2000,72,72);
				 naoanda(1);
			 }

		}
		@Override
		public void keyReleased(KeyEvent e) {}
		
});
		return 2;
}
	public void naoanda(int codigo) {
		if (codigo==0) {
			impedirsuperior(false);
			impediresquerda(false);
			impedirdireita(false);
			impedirinferior(false);
			impedirL();
		}
		if (codigo==1) {
			impedirsuperior(true);
			impediresquerda(true);
			impedirdireita(true);
			impedirinferior(false);
			impedirL();
		}
		if (codigo==2) {
			impedirsuperior(false);
			impediresquerda(true);
			impedirdireita(true);
			impedirinferior(false);
			impedirL();
		}
		if (codigo==3) {
			impedirsuperior(false);
			impediresquerda(true);
			impedirdireita(false);
			impedirinferior(false);
			impedirL();
		}
		if (codigo==4) {
			impedirsuperior(false);
			impediresquerda(true);
			impedirdireita(false);
			impedirinferior(true);
			impedirL();
		}
		if (codigo==5) {
			impedirsuperior(true);
			impediresquerda(false);
			impedirdireita(false);
			impedirinferior(false);
			impedirL();
		}
		if (codigo==6) {
			impedirsuperior(false);
			impediresquerda(false);
			impedirdireita(false);
			impedirinferior(true);
			impedirL();
		}
		if (codigo==7) {
			impedirsuperior(false);
			impediresquerda(true);
			impedirdireita(false);
			impedirinferior(true);
			if(x<216 || x>602) {
				if (y<72) {y=70;}
			}
			if (y>402) {y=400;}
		}
		if (codigo==8) {
			impedirsuperior(false);
			impediresquerda(false);
			impedirdireita(true);
			impedirinferior(true);
			if(x<216 || x>602) {
				if (y<72) {y=70;}
			}
			if (y>402) {y=400;}
		}
		if (codigo==9) {
			impedirsuperior(true);
			impediresquerda(false);
			impedirdireita(true);
			impedirinferior(false);
			impedirL();
		}
		if (codigo==10) {
			impedirsuperior(false);
			impediresquerda(false);
			impedirdireita(true);
			impedirinferior(true);
			impedirL();
		}
		if (codigo==11) {
			impedirsuperior(false);
			impediresquerda(true);
			impedirdireita(true);
			impedirinferior(true);
			impedirL();
		}
	}
	
	public void impedirsuperior(boolean parede) {
		if(parede==true){
			if (y<72) {y=70;}
		}
	}
	public void impediresquerda	(boolean parede) {
		if(parede==true){
			if (x<72) {x=70;}
		}
	}
	public void impedirinferior	(boolean parede) {
		if(parede==true){
			if (y>506) {y=504;}
		}
	}
	public void impedirdireita	(boolean parede) {
		if(parede==true){
			if (x>746) {x=744;}
		}
	}
	public void impedirL() {
		if(x<216 || x>602) {
			if (y<72) {y=70;}
			if (y>506){y=504;}
		}
		if(y<216 || y>360) {
			if (x<72) {x=70;}
			if (x>746){x=744;}
		}
	}
    public void cima(KeyEvent key) {
    	if (key.getKeyCode()==87) {				//cima
			y-=velocidade;
			if (y<-30) {
				y=600;
				alteradorY--;
			}
    	}
    }
    public void baixo(KeyEvent key) {
    if (key.getKeyCode()==83) {				//baixo
		y+=velocidade;
		if (y>600) {
			y=-32;
			alteradorY++;
			}
    	}
	}
    
    public void esquerda(KeyEvent key) {
    	if (key.getKeyCode()==65) {				//esquerda
			x-=velocidade;
			if (x<-22) {
				x=840;
				alteradorX--;
				}
			}
    	}
    
    public void direita(KeyEvent key) {
    	if (key.getKeyCode()==68) {				//direita
			x+=velocidade;
			if (x>840) {
				x=-22;
				alteradorX++;
				}
			}
    	}
}
