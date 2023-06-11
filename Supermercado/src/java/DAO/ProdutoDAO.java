/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelos.Produtos;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;

/**
 *
 * @author Duilio Amaral
 */
public class ProdutoDAO {
    


public void inserirProduto(Produtos produto) {
    Session sessao = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(produto);
        sessao.getTransaction().commit();
    } catch (HibernateException e) {
        System.out.println(e.getMessage());
        sessao.getTransaction().rollback();
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }
}

public void actualizarProduto(Produtos produto) {
    Session sessao = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(produto);
        sessao.getTransaction().commit();
    } catch (HibernateException e) {
        System.out.println(e.getMessage());
        sessao.getTransaction().rollback();
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }
}

public void apagarProduto(Produtos produto) {
    Session sessao = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(produto);
        sessao.getTransaction().commit();
    } catch (HibernateException e) {
        System.out.println(e.getMessage());
        sessao.getTransaction().rollback();
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }
}

public List<Produtos> apresentarProdutos() {
    Session sessao = null;
    List<Produtos> listaProdutos = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Produto");
        listaProdutos = (List<Produtos>) query.list();
    } catch (HibernateException e) {
        System.out.println(e.getMessage());
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }
    return listaProdutos;
}

public List<Produtos> apresentarProduto() {
    throw new UnsupportedOperationException("Not supported yet.");
}
}
