package Chao;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TradutorChao{
    
    public JLabel desenhoGrama(int x,int y) {
    	ImageIcon gramaimg = new ImageIcon(getClass().getResource("grama.png"));
    	JLabel grama = new JLabel (gramaimg);
    	
    	grama.setBounds(x*72,y*72, 72, 72);
    	
		return grama;
	}
    public JLabel desenhoArvore(int x,int y) {

    	ImageIcon arvoreimg = new ImageIcon(getClass().getResource("arvore.png"));
    	JLabel arvore = new JLabel (arvoreimg);
    	
    	arvore.setBounds(x*72,y*72, 72, 72);
    	
		return arvore;
	}
    public JLabel desenhoPedra(int x,int y) {

    	ImageIcon pedraimg = new ImageIcon(getClass().getResource("pedra.png"));
    	JLabel pedra = new JLabel (pedraimg);
    	
    	pedra.setBounds(x*72,y*72, 72, 72);
    	
		return pedra;
	}
    public JLabel desenhoAguaareia(int x,int y) {

    	ImageIcon aguaareiaimg = new ImageIcon(getClass().getResource("aguaareia.png"));
    	JLabel aguaareia = new JLabel (aguaareiaimg);
    	
    	aguaareia.setBounds(x*72,y*72, 72, 72);
    	
		return aguaareia;
	}
    public JLabel desenhoMar(int x,int y) {

    	ImageIcon marimg = new ImageIcon(getClass().getResource("mar.png"));
    	JLabel mar = new JLabel (marimg);
    	
    	mar.setBounds(x*72,y*72, 72, 72);
    	
		return mar;
	}
    public JLabel desenhoGramapqna(int x,int y) {

    	ImageIcon gramapqnaimg = new ImageIcon(getClass().getResource("gramapqna.png"));
    	JLabel gramapqna = new JLabel (gramapqnaimg);
    	
    	gramapqna.setBounds(x*72,y*72, 72, 72);
    	
		return gramapqna;
	}
    
    public int[][][] quartos(int[][][] salas){ 
		int[][] sala1 = new int[][]{
			  { 1, 1, 1,	 1, 1, 1,	 1, 1, 1,	 1, 1, 1 },
			  { 1, 2, 2,	 0, 0, 0,	 0, 0, 2,	 2, 2, 1 },
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
			  { 1, 5, 5,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 5, 5,	 5, 0, 0,	 0, 0, 0,	 0, 0, 1 },
					  
			  { 1, 5, 5,	 5, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 5, 5,	 5, 5, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 5, 5,	 5, 5, 0,	 0, 0, 0,	 0, 0, 1 },
				  
			  { 1, 5, 5,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
			  { 1, 5, 0,	 0, 0, 0,	 0, 0, 0,	 0, 0, 1 },
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
		return salas;
    }
}