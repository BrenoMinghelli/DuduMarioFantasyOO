package Monitor;
import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import Jogador.Jogador;

public class Display extends JFrame{
    private JFrame jframe;
    private static Canvas canvas;
    private String title;
    private int width, height;

    public Display(String title, int height, int width){
        this.title = title;
        this.width = width;
        this.height = height;
        
        initCanvas();
    }
    
    private void initCanvas(){

        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

        canvas = new Canvas();
        canvas.setSize(864,648);
        setTitle(title);
        add(canvas);
        pack();
        teclado();

    }

    public Canvas getCanvas() {

        if(canvas == null)
        {
            System.out.println("Canvas is null");
            return null;
        }
        return canvas;
    }
    
    public void teclado() {
        final Jogador jogador = new Jogador();
        KeyListener kl=new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("KeT");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("KeP");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				jogador.movimentoX();
			}
		
	};
		addKeyListener(kl);
    	
    }

}