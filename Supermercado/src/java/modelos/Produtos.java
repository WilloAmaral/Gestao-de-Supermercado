package modelos;
// Generated 01/06/2023 18:27:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Produtos generated by hbm2java
 */
public class Produtos  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private Float preco;
     private Set pedidosHasProdutoses = new HashSet(0);

    public Produtos() {
    }

    public Produtos(String nome, Float preco, Set pedidosHasProdutoses) {
       this.nome = nome;
       this.preco = preco;
       this.pedidosHasProdutoses = pedidosHasProdutoses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getPreco() {
        return this.preco;
    }
    
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public Set getPedidosHasProdutoses() {
        return this.pedidosHasProdutoses;
    }
    
    public void setPedidosHasProdutoses(Set pedidosHasProdutoses) {
        this.pedidosHasProdutoses = pedidosHasProdutoses;
    }




}


