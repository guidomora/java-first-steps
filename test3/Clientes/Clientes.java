package test3.Clientes;

import java.util.ArrayList;
import java.util.List;

import test3.Cliente.Cliente;

public class Clientes {
    private List<Cliente> clientes;

    public Clientes(){
        this.clientes = new ArrayList<>();
    }

    public void addClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public void clientsList(){
        // for (Cliente cliente : clientes) {
        //     System.out.println(cliente.getCliente());
        //     System.out.println(cliente.getAutosCliente());
        // }
    }
}
