/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;

/**
 *
 * @author danie
 */
public class Snack extends Produto {
    private boolean picante;
    
    public Snack(String nomeProduto, float preco, boolean picante) {
        super(nomeProduto, preco);
        this.picante = picante;
    }

    public boolean isPicante() {
        return picante;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }
    
       @Override
    public String toString() {
        
        String informacao = "";
       // informacao += "-------------------------------\n";
        informacao += super.toString();
        if(picante == false)
        {
            informacao += "Não picante\n";
        }
        else 
        {
            informacao +="Picante\n";
        }
        //informacao += "-------------------------------\n";
        return informacao;
    }
}
