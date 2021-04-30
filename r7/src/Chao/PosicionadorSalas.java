package Chao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PosicionadorSalas {
	private int x;
	private int y;
	private int alterador=0;
	
    public int[][] mundo(int[][] globo) {
		int[][] m = new int[][]{
			{ 0, 0, 0,20, 0},
			{ 1, 0,18,19, 0},
			{ 2, 0,17,16,15},
			{ 3, 5,11,13,14},
			{ 4, 6, 9,10,12},
			{ 0, 0, 7, 8, 0},
			};
			return m;
    }
    
    public JLabel desenhoSala1() {
    	ImageIcon sala1img = new ImageIcon(getClass().getResource("sala1.png"));
    	JLabel sala1 = new JLabel (sala1img);
		return sala1;
	}
    public JLabel desenhoSala2(int x,int y) {
    	ImageIcon sala2img = new ImageIcon(getClass().getResource("sala2.png"));
    	JLabel sala2 = new JLabel (sala2img);
    	
		return sala2;
	}
    public JLabel desenhoSala3(int x,int y) {
    	ImageIcon sala3img = new ImageIcon(getClass().getResource("sala3.png"));
    	JLabel sala3 = new JLabel (sala3img);
    
    	
		return sala3;
	}
    
}
