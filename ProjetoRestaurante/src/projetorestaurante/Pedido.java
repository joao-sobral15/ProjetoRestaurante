/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;
import java.time.LocalTime;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Pedido {
    
    private Date dataAbertura;
    private LocalTime dataFecho = LocalTime.now();
    private boolean estadoPedido;
    ArrayList<Produto> produtosLista;
    

    public Pedido(Date dataAbertura, int estadoPedido) {
        produtosLista = new ArrayList<Produto>();
        this.dataAbertura = dataAbertura;
        this.dataFecho = null;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalTime getDataFecho() {
        return dataFecho;
    }

    public void setDataFecho(LocalTime dataFecho) {
        this.dataFecho = dataFecho;
    }

    public boolean isEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public ArrayList<Produto> getProdutosLista() {
        return produtosLista;
    }

    public void setProdutosLista(ArrayList<Produto> produtosLista) {
        this.produtosLista = produtosLista;
    }
    
    
    public void addProduto()
    {
        
    }
    
    
    
    
    
    
    
}
