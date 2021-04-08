/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.util.ArrayList;

/**
 *
 * @author buckl
 */
public class AtaqueBasicoInimigo extends Ataque{
    
    @Override
    public double atacar(int lvl, int atk, ArrayList personagens,int indice){
        this.setMultiplicador(1.0);
        double dano=(this.multiplicador*atk*100)/(((Personagem)personagens.get(indice)).getDef()+100);
        System.out.print(((Personagem)personagens.get(indice)).getNome()+", causando "+dano+" de dano.\n");
        ((Personagem)personagens.get(indice)).tomaDano(dano);
        return dano;
    }
    
}
