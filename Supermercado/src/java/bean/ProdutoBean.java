/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DAO.ProdutoDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelos.Produtos;

/**
 *
 * @author Duilio Amaral
 */
public class ProdutoBean {
    private Produtos produto;
    private List<Produtos> produtos;

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public List<Produtos> getProdutos() {
        ProdutoDAO dao = new ProdutoDAO();
        produtos = dao.apresentarProdutos();
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public ProdutoBean() {
        produto = new Produtos();
    }

    public void inserir() {
        ProdutoDAO dao = new ProdutoDAO();
        dao.inserirProduto(produto);
        produto = new Produtos();
        addMessage("Produto inserido com sucesso");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
