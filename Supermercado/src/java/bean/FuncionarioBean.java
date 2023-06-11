/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DAO.FuncionarioDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelos.Funcionario;

/**
 *
 * @author Duilio Amaral
 */
public class FuncionariosBean {
  
    private Funcionarios Funcionario;
    private List<Funcionarios> funcionarios;

    public Funcionaros getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    
    

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public FuncionariosBean() {
        funcionario = new funcionario();
    }

    public void inserir() {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.inserirFuncionario(funcionario);
        funcionario = new Funcionarios();
        addMessage("Funcionarioinserido com sucesso");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

    

