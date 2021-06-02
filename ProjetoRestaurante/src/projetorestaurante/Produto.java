/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;

/**
 *
 * @author User
 */
public class Produto {
   
    private String nomeProduto;
    private double preco;
    
    public Produto(String nomeProduto, double preco)
    {
        if (nomeProduto == "")
        {
            this.nomeProduto = "";
        }
        else
        {
            this.nomeProduto = nomeProduto;
        }
        
            this.preco = preco;
        
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        
        String informacao = "";
        
        informacao += "Nome do Produto:"+nomeProduto+"\n";
        informacao += "Preço:"+preco+"\n";
        informacao += "\n";
        
        return informacao;
    }
}
