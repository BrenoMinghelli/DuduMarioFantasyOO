package Monitor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Chao.TradutorChao;
import Jogador.Jogador;
import Jogador.Movimentacao;

public class Display{
    
    Jogador jogador = new Jogador();
    TradutorChao mapa = new TradutorChao();
	JFrame jframe = new JFrame();
	Movimentacao movimentacao = new Movimentacao();
    
    private int numquarto=1;
    int[][][] salas;								//matriz de salas
    
    public void initDesenhos() {
    	jogador.desenhoplayer(jframe);				//desenhar o personagem
    	leitorQuarto(mapa.quartos(salas),numquarto);	//desenhar o mapa
    	jframe.add(desenhoFormatacao());			//desenhar o fundo invisivel
    }
    
    public void leitorQuarto(int[][][] salas, int nquarto){
    	
		for (int a=0; a<9;a++) {
		     for (int b=0; b<12;b++){
				 if (salas[nquarto][a][b]==0){
					 //System.out.println(nquarto);
					 jframe.add(mapa.desenhoGrama(b,a));
				 }
				 if (salas[nquarto][a][b]==1){
					 jframe.add(mapa.desenhoArvore(b,a));
				 }
				 if (salas[nquarto][a][b]==2){
					 jframe.add(mapa.desenhoPedra(b,a));
				 }
				 if (salas[nquarto][a][b]==3){
					 jframe.add(mapa.desenhoAguaareia(b,a));
				 }
				 if (salas[nquarto][a][b]==4){
					 jframe.add(mapa.desenhoMar(b,a));
				 }
				 if (salas[nquarto][a][b]==5){
					 jframe.add(mapa.desenhoGramapqna(b,a));
				 }
		     }
		}
    }
    
    public void initCanvas(){
    	jframe.setSize(878, 684);								//Tamanho
    	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Fechar
    	jframe.setResizable(false);								//Mudar Tamanho
    	jframe.setVisible(true);								//Visivel
    	jframe.setLocationRelativeTo(null);						//Posicao
    	jframe.setFocusable(true);
    	jframe.setTitle("Tasasasaste");							//Titulo
    }
    
    public JLabel desenhoFormatacao() {
    	ImageIcon fundoimg = new ImageIcon(getClass().getResource("aaaaaaaaa.png"));
    	JLabel fundo = new JLabel (fundoimg);
    	
    	fundo.setBounds(0, 0, 864/*/largura/*/, 648/*/altura/*/);;
		return fundo;
	}
}