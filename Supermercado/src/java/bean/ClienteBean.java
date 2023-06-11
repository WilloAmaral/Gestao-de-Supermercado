package bean;

import DAO.clienteDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelos.Clientes;

@ManagedBean
@ViewScoped
public class ClienteBean {

    private Clientes cliente;
    private List<Clientes> clientes;

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Clientes> getClientes() {
        clienteDAO dao = new clienteDAO();
        clientes = dao.apresentarClientes();
        return clientes;
    }

    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }

    public ClienteBean() {
        cliente = new Clientes();
    }

    public void inserir() {
        clienteDAO dao = new clienteDAO();
        dao.inserircliente(cliente);
        cliente = new Clientes();
        addMessage("Cliente inserido com sucesso");
    }
    

   

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
