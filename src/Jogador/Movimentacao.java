package Jogador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Auxiliar.Mapas;
import game.AcharCombate;
import game.Mochila;
import game.Personagem;
import game.RegenChars;

public class Movimentacao{
	
	static Mapas mapas= new Mapas();
	
	static int [][][]matrizsalas;
    public int x=410;
    public int y=324;
    public int velocidade=15;
    
    public int alteradorX=0;
    public int alteradorY=1;
    public int area=0;
    
    public int acaopause=-5;
    public boolean controlpause=false;
    
    public int impedirconsecutivo=4;
    public int contadorconsecutivo=0;
    public int contadorpassos=0;    
    
    private boolean estado=true;
    private int comecar=1;
    
    private boolean combate=false;
    private int fimcombate=-1;

    public void andar(final JLabel andante, final JFrame jframe,
			final JLabel sala1,final JLabel sala2,final JLabel sala3,final JLabel sala4,final JLabel sala5,
			final JLabel sala6,final JLabel sala7,final JLabel sala8,final JLabel sala9,final JLabel sala10,
			final JLabel sala11,final JLabel sala12,final JLabel sala13,final JLabel sala14,final JLabel sala15,
			final JLabel sala16,final JLabel sala17,final JLabel sala18,final JLabel sala19,final JLabel sala20,
			final JLabel titulo,final JLabel fundo,final JLabel selecionar,final JLabel iniciar,
			final JLabel iniciarSEL,final JLabel sair,final JLabel sairSEL,final JLabel escuro, final JLabel pause,final JLabel selecionar2,
			ArrayList<Personagem> personagens,Mochila mochila, final JLabel fundoprimario) {
		
		jframe.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==27) {
				System.exit(0);
				}
			if (comecar==1) {
				menu(e,sairSEL,iniciarSEL, selecionar);
			}
			
			if (comecar==2 ||comecar==-1) {
				pausar(e,pause,selecionar2,personagens,mochila);
			}
			
			if (contadorpassos==34 && (contadorconsecutivo>impedirconsecutivo)) {
					combate=true;
				}
			if (combate==true){				
				if (AcharCombate.encontro(personagens,mochila)==fimcombate) {
					combate=false;
				}
				contadorconsecutivo=0;}
			
	    	if (comecar==2) {
	    		afastar(titulo, fundo, selecionar, iniciar, iniciarSEL, sair, sairSEL);
	    		
	    		cima(e);
				baixo(e);
				esquerda(e);
				direita(e);
				
				
				andante.setBounds(x,y,45,72);
				if (area==1) {
					escuro.setBounds(-1250+x+22,-1250+y+32,2500,2500);
				}
				salasconstruidas(sala1,sala2,sala3,sala4,sala5,sala6,sala7,sala8,sala9,sala10,
	    			sala11,sala12,sala13,sala14,sala15,sala16,sala17,sala18,sala19,sala20,personagens);
	    	}		
			
		}
		@Override
		public void keyReleased(KeyEvent e) {}
		
});
}
    public void menu(KeyEvent e, JLabel sairSEL, JLabel iniciarSEL, JLabel selecionar) {
    	if (e.getKeyCode()==87) {
			estado=seliniciar(selecionar,iniciarSEL,sairSEL);
		}
		if (e.getKeyCode()==83) {
			estado=selsair(selecionar,iniciarSEL,sairSEL);
		}
		if (estado==false) {
			if (e.getKeyCode()==10) {
				System.exit(0);
			}
		}
		if (estado==true) {
			if (e.getKeyCode()==10) {
				comecar++;
			}
		}
    	
    }
    
    public void pausar(KeyEvent key,JLabel pause, JLabel selecionar2, ArrayList<Personagem> personagens, Mochila mochila) {
    	if (key.getKeyCode()==69) {
    		acaopause=acaopause*(-1);
    	}
    	if (acaopause>0) {
			pause.setBounds(50,50,400,200);
			comecar=-1;
		}
    	if (acaopause<0) {
    		pause.setBounds(1000,1000,400,200);
    		selecionar2.setBounds(1000,1000,11,11);	
    		comecar=2;
    	}
		if (key.getKeyCode()==83) {
			controlpause=false;
		}
		if (key.getKeyCode()==87) {
			controlpause=true;
		}
		if (controlpause==true && comecar==-1) {
			selecionar2.setBounds(85,110,11,11);
			if (key.getKeyCode()==10) {
				System.out.println("ESTÁTISTICAS: ");
				System.out.println();
				for(int i=0;i<4;i++) {
					personagens.get(i).imprime();
				}
			}
		}
		if (controlpause==false && comecar==-1) {
			selecionar2.setBounds(85,170,11,11);
			if (key.getKeyCode()==10) {
				System.out.println("MOCHILA:");
				System.out.println();
				mochila.imprime();
			}
		}
    }
    
    public void afastar(JLabel titulo,JLabel fundo,JLabel selecionar,JLabel iniciar,
			JLabel iniciarSEL,JLabel sair,JLabel sairSEL) {
    	
    		titulo.setBounds(1000,1000,800,200);
		
    		iniciarSEL.setBounds(1000,1000,272,110);
    		iniciar.setBounds(1000,1000,272,110);
    		sair.setBounds(1000,1000,272,110);
		
    		fundo.setBounds(1000,1000,1000,700);

    		selecionar.setBounds(1000,1000,45,90);
    }
    
	public boolean seliniciar(JLabel selecionar,JLabel iniciarSEL,JLabel sairSEL) {
		selecionar.setBounds(500,400,45,90);
		iniciarSEL.setBounds(590,400,272,110);
		sairSEL.setBounds(1000,1000,272,110);
		return true;
		
	}
	public boolean selsair(JLabel selecionar,JLabel iniciarSEL,JLabel sairSEL) {
		selecionar.setBounds(500,520,45,90);
		iniciarSEL.setBounds(1000,1000,272,110);
		sairSEL.setBounds(590,530,272,110);
		return false;
		
	}
    
    public void construirsala(JLabel sala,int numquarto, int [][][]pos, int codigo, ArrayList<Personagem> personagens) {
    	if (pos[area][alteradorY][alteradorX]==numquarto){	
    		if (numquarto==13){
    			RegenChars.regenChars(personagens);
    			System.out.println("PARABENS VOCE ESTA EM UMA ZONA ABENCOADA, VC FOI CURADO");
    		}
    			sala.setBounds(-67,-178,1000,1000);
   			 	naoanda(codigo);	
    		}
		 else {
			 sala.setBounds(2000,2000,72,72);
		 }
    }
	
	public void salasconstruidas(final JLabel sala1,final JLabel sala2,final JLabel sala3,final JLabel sala4,final JLabel sala5,
			final JLabel sala6,final JLabel sala7,final JLabel sala8,final JLabel sala9,final JLabel sala10,
			final JLabel sala11,final JLabel sala12,final JLabel sala13,final JLabel sala14,final JLabel sala15,
			final JLabel sala16,final JLabel sala17,final JLabel sala18,final JLabel sala19,final JLabel sala20, ArrayList<Personagem> personagens)  {
		construirsala(sala1,1,mapas.globo(matrizsalas),1,personagens);
		construirsala(sala2,2,mapas.globo(matrizsalas),2,personagens);
		construirsala(sala3,3,mapas.globo(matrizsalas),3,personagens);
		construirsala(sala4,4,mapas.globo(matrizsalas),4,personagens);
		construirsala(sala5,5,mapas.globo(matrizsalas),5,personagens);
		construirsala(sala6,6,mapas.globo(matrizsalas),6,personagens);
		construirsala(sala7,7,mapas.globo(matrizsalas),7,personagens);
		construirsala(sala8,8,mapas.globo(matrizsalas),8,personagens);
		construirsala(sala9,9,mapas.globo(matrizsalas),0,personagens);
		construirsala(sala10,10,mapas.globo(matrizsalas),5,personagens);
		construirsala(sala11,11,mapas.globo(matrizsalas),9,personagens);
		construirsala(sala12,12,mapas.globo(matrizsalas),10,personagens);
		construirsala(sala13,13,mapas.globo(matrizsalas),11,personagens);
		construirsala(sala14,14,mapas.globo(matrizsalas),2,personagens);
		construirsala(sala15,15,mapas.globo(matrizsalas),9,personagens);
		construirsala(sala16,16,mapas.globo(matrizsalas),0,personagens);
		construirsala(sala17,17,mapas.globo(matrizsalas),4,personagens);
		construirsala(sala18,18,mapas.globo(matrizsalas),1,personagens);
		construirsala(sala19,19,mapas.globo(matrizsalas),2,personagens);
		construirsala(sala20,20,mapas.globo(matrizsalas),1,personagens);		
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
			if (y<72) {y=72;}
		}
	}
	public void impediresquerda	(boolean parede) {
		if(parede==true){
			if (x<72) {x=72;}
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
			if (y<72) {y=72;}
				if (y>506){y=504;}
		}
		if(y<216 || y>360) {
			if (x<72) {x=72;}
				if (x>746){x=744;}
		}
	}
    public void cima(KeyEvent key) {
    	if (key.getKeyCode()==87) {					//cima
			y-=velocidade;contadorpassos++;
			if (y<-30) {
				y=600;
				alteradorY--;
				contadorconsecutivo++;
				contadorpassos=0;
			}
    	}
    }
    public void baixo(KeyEvent key) {
    	if (key.getKeyCode()==83) {						//baixo
    		y+=velocidade;
    		contadorpassos++;
    		if (y>600) {
    			y=-32;
    			alteradorY++;
    			contadorconsecutivo++;
    			contadorpassos=0;
			}
    	}
	}
    
    public void esquerda(KeyEvent key) {
    	if (key.getKeyCode()==65) {					//esquerda
			x-=velocidade;
			contadorpassos++;
			if (x<-22) {
				x=840;
				alteradorX--;
				contadorconsecutivo++;
				contadorpassos=0;
				}
			}
    	}
    
    public void direita(KeyEvent key) {
    	if (key.getKeyCode()==68) {					//direita
			x+=velocidade;
			contadorpassos++;
			if (x>840) {
				x=-22;
				alteradorX++;
				contadorconsecutivo++;
				contadorpassos=0;
				}
			}
    	}
}
