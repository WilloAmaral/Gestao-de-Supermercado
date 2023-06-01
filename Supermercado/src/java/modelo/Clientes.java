package modelo;
// Generated May 25, 2023 2:02:34 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer idCliente;
     private String nome;
     private String apelido;
     private String endereco;
     private int telefone;
     private Set funcionarios = new HashSet(0);
     private Set produtoses = new HashSet(0);
     private Set vendas = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(String nome, String apelido, String endereco, int telefone) {
        this.nome = nome;
        this.apelido = apelido;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Clientes(String nome, String apelido, String endereco, int telefone, Set funcionarios, Set produtoses, Set vendas) {
       this.nome = nome;
       this.apelido = apelido;
       this.endereco = endereco;
       this.telefone = telefone;
       this.funcionarios = funcionarios;
       this.produtoses = produtoses;
       this.vendas = vendas;
    }

    Clientes(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Set getProdutoses() {
        return this.produtoses;
    }
    
    public void setProdutoses(Set produtoses) {
        this.produtoses = produtoses;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }

public String recuperarDados(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session sessao = sessionFactory.openSession();
        Transaction tr=null;
        Iterator it;
        Clientes clientes;
        try{
            tr=sessao.beginTransaction();
           Query q=sessao.createQuery("from Clientes where idCliente=:codigo");
            q.setInteger("codigo", this.idCliente);
            it=q.list().iterator();
            if(it.hasNext()){
                clientes=(Clientes)it.next();
                this.nome=getNome();
                this.apelido=getApelido();
                this.endereco=getEndereco();
                this.telefone=getTelefone();
                this.funcionarios=getFuncionarios();
                this.produtoses=getProdutoses();
                this.vendas=getVendas();
                
            
            }
            tr.commit();
        
        }catch(Exception e){
            e.printStackTrace();
            tr.rollback();
        }
    
    
    return nome+", "+apelido+", "+endereco+", "+telefone+", "+funcionarios+", "+produtoses+", "+vendas;
    }



}


