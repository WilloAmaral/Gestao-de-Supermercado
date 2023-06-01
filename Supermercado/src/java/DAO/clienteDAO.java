/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;
import supermecadohibernate.Clientes;

/**
 *
 * @author Duilio Amaral
 */
@ManagedBean
@RequestScoped
public class clienteDAO {

    /**
     * Creates a new instance of inserirCliente
     */
    public clienteDAO() {
    }
     public void inserircliente(Clientes cliente) {
        Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(cliente);
            sessao.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            sessao.getTransaction().rollback();
        }finally{
            if(sessao!=null){
                sessao.close();
            }
        }
    }

    public void actualizarCliente(Clientes cliente) {
                Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(cliente);
            sessao.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            sessao.getTransaction().rollback();
        }finally{
            if(sessao!=null){
                sessao.close();
            }
        }
    }

    public void apagarCliente (Clientes Cliente) {
               Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.delete(Cliente);
            sessao.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            sessao.getTransaction().rollback();
        }finally{
            if(sessao!=null){
                sessao.close();
            }
        }
    }

    public List<Clientes> apresentarCliente() {
        Session sessao=null;
        List<Clientes>listaClientes=null;
        try {
            sessao=HibernateUtil.getSessionFactory().openSession();
            Query query=sessao.createQuery("from Cliente");
            listaClientes=(List<Clientes>)query.list();
            
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(sessao!=null){
                sessao.close();
            }
        } 
        return listaClientes;
    }

    public void inserircliente(modelo.Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<modelo.Clientes> apresentarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
