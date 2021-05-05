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
    
    
}
