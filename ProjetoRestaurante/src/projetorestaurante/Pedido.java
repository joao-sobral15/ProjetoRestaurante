/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package projetorestaurante;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Pedido{
    
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFecho;
    private int estadoPedido;
    private int nMesa;
    private double totalPedido;
    //ArrayList<Produto> produtosLista;
    

    public Pedido(int nMesa, double preco, String nomeProduto) {
        this.dataAbertura = LocalDateTime.now();
        this.dataFecho = null;
        this.nMesa = nMesa;
        this.totalPedido  = preco;
        this.estadoPedido =1;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public void alterarEstado()
    {
            estadoPedido++;
        if (estadoPedido == 3)
        {
            dataFecho = LocalDateTime.now();
        }
    }
    

    public LocalDateTime getDataFecho() {
        return dataFecho;
    }

    public void setDataFecho(LocalDateTime dataFecho) {
        this.dataFecho = dataFecho;
    }

    public int getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getnMesa() {
        return nMesa;
    }

    public void setnMesa(int nMesa) {
        this.nMesa = nMesa;
    }

    @Override
    public String toString() {
        
        String informacao = "";
        informacao += "-------------------------------";
        informacao += "Mesa" +nMesa +"\n";
        informacao += "Data de Abertura:" +dataAbertura+"\n";
        if(estadoPedido == 1)
        {
         informacao += "Estado do pedido: em preparação \n";   
        }
        else if(estadoPedido == 2)
        {
            informacao += "Estado do Pedido: Entregue \n";
        }
        else
        {
            informacao += "Estado do Pedido: Fechado \n";
        }
        informacao += "Total do Pedido"+totalPedido+"\n";
        informacao += "Hora de fecho"+dataFecho+"\n";
        informacao += "-------------------------------";
        return informacao;
    }
}
