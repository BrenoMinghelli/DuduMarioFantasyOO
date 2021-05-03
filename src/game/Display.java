package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Chao.TradutorChao;
import Jogador.Desenhista;
import Jogador.Movimentacao;

public class Display{
    
	Desenhista desenhista = new Desenhista();
	JFrame jframe = new JFrame();
	Movimentacao movimentacao = new Movimentacao();
	
    public void initDesenhos(ArrayList<Personagem> personagens,Mochila mochila) {
    	desenhista.desenhoplayer(jframe, personagens, mochila);				//desenhar o personagem    	
    }
    
    public void initCanvas(){
    	jframe.setSize(878, 684);																		//Tamanho
    	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);											//Fechar
    	jframe.setResizable(false);																		//Mudar Tamanho
    	jframe.setVisible(true);																		//Visivel
    	jframe.setLocationRelativeTo(null);																//Posicao
    	jframe.setFocusable(true);
    	jframe.setTitle("Dudu Mario RPG Fantasy: o inimigo agora é outro");						 		//Titulo   
    }
}
    