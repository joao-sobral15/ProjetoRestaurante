/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Prato extends Produto {
   
    ArrayList<Prato> produtos = new ArrayList<>();
    private String descricao;
   
    public Prato(String nomeProduto, double preco, String descricao) {
        super(nomeProduto, preco);
        if(descricao != null){
            this.descricao = descricao;
        }
        else{
            this.descricao = "";
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        String informacao ="";
        
        informacao += super.toString();
        if(descricao != "")
        {
           informacao += "Descricao do Produto:"+descricao;
        }
        else 
        {
            informacao += "Descricao do Produto: Sem descricao";
        }
        
        return informacao;
    }
      
    
    
    
    
    
}
