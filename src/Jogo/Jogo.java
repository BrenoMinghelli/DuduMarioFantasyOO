package Jogo;

import tesssssssss.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Controle.ControleDoJogador;
import Entidades.GameObject;
import Entidades.Jogador;
import Monitor.Tela;

public class Jogo {

    private Tela display;
    private List<GameObject> gameObjects;
    private Input input;

    public Jogo(int largura, int altura) {
        input = new Input();
        display = new Tela(largura, altura, input);
        gameObjects = new ArrayList<>();
        gameObjects.add(new Jogador(new ControleDoJogador(input)));
    }

    public void update() {
        gameObjects.forEach(gameObject -> gameObject.update());
    }

    public void render() throws IOException {
        display.rendedr(this);
    }
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
