package Jogador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Movimentacao{
	
    private int nquarto=0;
    private int x=-22;
    private int y=-36;
    private int velocidade=6;
    private int teste=0;
	
	public void andar(final JLabel andante, JFrame jframe) {
		andante.setBounds(x,y,45,72);
		jframe.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==87) {
				y-=velocidade;
			}
			if (e.getKeyCode()==83) {
				y+=velocidade;
				if (y>600) {
					nquarto++;
					System.out.println(nquarto);
					y=0;
				}
			}
			if (e.getKeyCode()==65) {
				x-=velocidade;
			}
			if (e.getKeyCode()==68) {
				x+=velocidade;
			}
			 andante.setBounds(x,y,45,72);
		}
		@Override
		public void keyReleased(KeyEvent e) {}
	});
}
	

}
