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
   
    private static int sequencia = 0;
    private String nomeProduto;
    private double preco;
    private int nPedido;
     private static int contaNumeros = 0;
    
    
    public Produto(String nomeProduto, double preco)
    {
        if (nomeProduto == "")
        {
            this.nomeProduto = "Sem Nome";
        }
        else
        {
            this.nomeProduto = nomeProduto;
        }
            this.preco = preco;
            
        this.nPedido = contaNumeros++;
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        
        String informacao = "";
        informacao += "-------------------------------\n";
        informacao += "Id do Produto"+nPedido+"\n";
        informacao += "Nome do Produto:"+nomeProduto+"\n";
        informacao += "Preço:"+preco+"\n";
        informacao += "\n";
        informacao += "-------------------------------\n";
        
        return informacao;
    }
}
