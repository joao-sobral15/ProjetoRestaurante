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
    private int totalPedido;
    ArrayList<Produto> produtosLista;
    

    public Pedido(int nMesa) {
        produtosLista = new ArrayList<Produto>();
        this.dataAbertura = LocalDateTime.now();
        this.dataFecho = null;
        this.nMesa = nMesa;
        this.totalPedido =0;
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
        if (estadoPedido ==1)
        {
            estadoPedido++;
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

    public ArrayList<Produto> getProdutosLista() {
        return produtosLista;
    }

    public void setProdutosLista(ArrayList<Produto> produtosLista) {
        this.produtosLista = produtosLista;
    }

    @Override
    public String toString() {
        
        String informacao = "";
        
        informacao += "Mesa" +nMesa +"\n";
        informacao += "Data de Abertura:" +dataAbertura+"\n";
        informacao += "Total do Pedido"+totalPedido+"\n";
        
        informacao += "Items do Pedido"+"\n";
        informacao += produtosLista.toString();
        return informacao;
    }
    
    
}
