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
public class Doce extends Produto {
    
    private String descricao;
    private boolean caseiro;
    
    public Doce(String nomeProduto, double preco, String descricao, boolean caseiro) 
    {
        super(nomeProduto, preco);
        
        if(descricao != null){
            this.descricao = descricao;
        }
        else{
            this.descricao = "";
        }
        
        this.caseiro = caseiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCaseiro() {
        return caseiro;
    }

    public void setCaseiro(boolean caseiro) {
        this.caseiro = caseiro;
    }
    
    @Override
    public String toString() 
        {
        String informacao ="";
        informacao += "-------------------------------\n";
        informacao += super.toString();
        if(descricao != "")
        {
           informacao += "Descricao do Produto:"+descricao+ "\n";
        }
        else 
        {
            informacao += "Descricao do Produto: Sem descricao\n";
        }

        if(caseiro == true)
        {
            informacao += "Caseiro\n";
        }
        else 
        {
            informacao+= "Não caseiro\n";
        }
        informacao += "-------------------------------\n";
        return informacao;
    }
    
}
