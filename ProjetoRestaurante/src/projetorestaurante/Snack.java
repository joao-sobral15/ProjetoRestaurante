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
    
    private int quantidade;
    private boolean picante;
    
    public Snack(String nomeProduto, float preco, float iva, int quantidade, boolean picante) {
        super(nomeProduto, preco);
        this.quantidade = quantidade;
        this.picante = picante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isPicante() {
        return picante;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }
    
       @Override
    public String toString() {
        super.toString();
        String informacao = "";
        
        informacao += "Quantidade:"+quantidade+"\n";
        if(picante == false)
        {
            informacao += "Não picante\n";
        }
        else 
        {
            informacao +="Picante\n";
        }
        
        return informacao;
    }
    
    
}
