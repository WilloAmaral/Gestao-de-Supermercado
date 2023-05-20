
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
  import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */
public class ClienteBean implements Serializable{

    private List<Cliente> clientes;
    private Cliente clienteSelecionado;

    
    public void init() {
        clientes = new ArrayList<>();
        // Aqui vamos carregar os clientes do banco de dados ou adicionar alguns clientes fictícios para teste
    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

    public Cliente getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public void adicionarCliente() {
        clientes.add(clienteSelecionado);
        clienteSelecionado = new Cliente(); // Limpar o objeto para adicionar um novo cliente
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void atualizarCliente() {
        // A lógica para atualizar o cliente no banco de dados pode ser adicionada aqui
    }
}

    