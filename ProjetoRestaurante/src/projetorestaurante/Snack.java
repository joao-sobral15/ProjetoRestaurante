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
        super(nomeProduto, preco, iva);
        
        
    }
    
}
