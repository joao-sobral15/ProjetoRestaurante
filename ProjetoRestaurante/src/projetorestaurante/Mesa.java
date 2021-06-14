/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Mesa {
    
    private int numeroMesa;
    private boolean disponibilidade;

    public Mesa(int numeroMesa, boolean disponibilidade) {
        this.numeroMesa = numeroMesa;
        this.disponibilidade = disponibilidade;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

  
    public void alteraEstado()
    {
        if (disponibilidade == true)
        {
            disponibilidade = false;
        }
        else 
        {
            disponibilidade = true;
        }
    }
   
    @Override
    public String toString() {
         String informacao = "";
        
        informacao += "Numero da Mesa:"+numeroMesa+"\n";
        if(disponibilidade == true)
        {
            informacao += "Disponibilidade: Disponivel\n";
        }
        else 
        {
            informacao += "Disponibilidade: Não Disponivel\n";
        }
        informacao += "\n";
        
        return informacao;
    }
    
    
    
    
    
    
    
    
    
}
