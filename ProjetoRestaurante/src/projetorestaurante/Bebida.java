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
public class Bebida extends Produto {
    
    private float capacidade;
    private boolean referencia;
    
    public Bebida(String nomeProduto, double preco, float capacidade, boolean referencia) {
        super(nomeProduto, preco);
        
        if(capacidade > 0){
            this.capacidade = capacidade;
        }
        else
        {
            this.capacidade = 0;
        }
        this.referencia = referencia;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isReferencia() {
        return referencia;
    }

    public void setReferencia(boolean referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
      
        String informacao = "";
        informacao +=   super.toString() +"\n";
        informacao += "Capacidade:"+capacidade +" ml\n";
        if(referencia == true)
        {
            informacao += "Alcoolica: Sim\n";
        }
        else 
        {
            informacao += "Alcoolica: Não\n";
        }
       
        return informacao;
    }
    
    
  
    
    
    
    
    
    
    
}
