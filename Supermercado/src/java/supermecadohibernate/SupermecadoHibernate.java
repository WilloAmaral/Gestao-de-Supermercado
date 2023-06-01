/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermecadohibernate;

import java.util.Scanner;

/**
 *
 * @author NELZIA
 */
public class SupermecadoHibernate {

    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
        System.out.println("Testandoooooo");
        int cod=ler.nextInt();
        Clientes a = new Clientes(cod);
        System.out.println(a.recuperarDados());
        
        
    }
    
}
