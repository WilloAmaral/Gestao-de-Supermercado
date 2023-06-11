/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DAO.PedidoDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelos.Pedidos;

/**
 *
 * @author Duilio Amaral
 */
public class PedidosBean {
  
    private Pedidos pedido;
    private List<Pedidos> pedidos;

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    
    

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public PedidosBean() {
        pedido = new Pedidos();
    }

    public void inserir() {
        PedidoDAO dao = new PedidoDAO();
        dao.inserirPedido(pedido);
        pedido = new Pedidos();
        addMessage("Pedido inserido com sucesso");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

    

