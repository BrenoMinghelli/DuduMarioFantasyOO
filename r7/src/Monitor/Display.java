package Monitor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Chao.PosicionadorSalas;
import Chao.TradutorChao;
import Jogador.Desenhista;
import Jogador.Movimentacao;

public class Display{
    
    Desenhista desenhista = new Desenhista();
	JFrame jframe = new JFrame();
	Movimentacao movimentacao = new Movimentacao();
	PosicionadorSalas possalas = new PosicionadorSalas();
	
    public void initDesenhos() {
    	desenhista.desenhoplayer(jframe);				//desenhar o personagem    	
    	jframe.add(desenhoFormatacao());					//desenhar o fundo invisivel
    }
    
    public void initCanvas(){
    	jframe.setSize(878, 684);								//Tamanho
    	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Fechar
    	jframe.setResizable(false);								//Mudar Tamanho
    	jframe.setVisible(true);								//Visivel
    	jframe.setLocationRelativeTo(null);						//Posicao
    	jframe.setFocusable(true);
    	jframe.setTitle("Joguete");							//Titulo
    }
    
    public JLabel desenhoFormatacao() {
    	ImageIcon fundoimg = new ImageIcon(getClass().getResource("aaaaaaaaa.png"));
    	JLabel fundo = new JLabel (fundoimg);
    	
    	fundo.setBounds(0, 0, 864/*/largura/*/, 648/*/altura/*/);;
		return fundo;
	}
}