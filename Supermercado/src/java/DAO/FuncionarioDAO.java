/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelos.Funcionario;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;

/**
 *
 * @author Duilio Amaral
 */
public class FuncionarioDAO {
    


public void inserirFuncionarios(Funcionarios funcionario) {
    Session sessao = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(funcionario);
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

public void actualizarFuncionario(Funcionarios funcionario) {
    Session sessao = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(funcionario);
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

public void apagarFuncionario(Funcionarios funcionario) {
    Session sessao = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(funcionario);
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

public List<Funcionarios> apresentarFuncionarios() {
    Session sessao = null;
    List<Produtos> listaProdutos = null;
    try {
        sessao = HibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Funcionario");
        listaFuncionarios = (List<Funcionarios>) query.list();
    } catch (HibernateException e) {
        System.out.println(e.getMessage());
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }
    return listaProdutos;
}

public List<Funcionarios> apresentarFuncionarios() {
    throw new UnsupportedOperationException("Not supported yet.");
}
}
