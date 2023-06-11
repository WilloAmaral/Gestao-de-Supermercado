/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelos.Pedidos;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;

/**
 *
 * @author Duilio Amaral
 */
public class PedidoDAO {
   
    public void inserirPedido(Pedidos pedido) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(pedido);
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

    public void atualizarPedido(Pedidos pedido) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(pedido);
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

    public void apagarPedido(Pedidos pedido) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.delete(pedido);
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

    public List<Pedidos> apresentarPedidos() {
        Session sessao = null;
        List<Pedidos> listaPedidos = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Query query = sessao.createQuery("from Pedido");
            listaPedidos = (List<Pedidos>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
        return listaPedidos;
    }

    public List<Pedidos> apresentarPedido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

    

