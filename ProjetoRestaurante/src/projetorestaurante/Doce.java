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
    
    public Doce(String nomeProduto, float preco, float iva, String descricao, boolean caseiro) {
        super(nomeProduto, preco, iva);
        
        if(descricao != null){
            this.descricao = descricao;
        }
        else{
            this.descricao = "";
        }
        
        this.caseiro = caseiro;
    }
    
}
