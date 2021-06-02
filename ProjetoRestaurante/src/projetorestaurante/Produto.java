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
    private float preco;
    private float iva;
    
    public Produto(String nomeProduto, float preco, float iva)
    {
        if (nomeProduto == "")
        {
            this.nomeProduto = "";
        }
        else
        {
            this.nomeProduto = nomeProduto;
        }
        
        if(iva>0)
        {
            this.iva = iva;
        }
        
        if(preco >0)
        {
            this.preco = preco*this.iva;
        }
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        
        String informacao = "";
        
        informacao += "Nome do Produto:"+nomeProduto+"\n";
        informacao += "Preço:"+preco;
        informacao += "IVA:"+iva;
        
        return informacao;
    }
    
   
    
}
