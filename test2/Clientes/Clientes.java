package test2.Clientes;

import java.util.ArrayList;
import java.util.List;

import test2.Cliente.Cliente;

public class Clientes {
    private List<Cliente> clientes;


    public Clientes(){
        this.clientes = new ArrayList<>();
    }

    public void agregarClientes(Cliente cliente){
        clientes.add(cliente);
    }


    public void listaClientes(){
        System.out.println("------ Listado de clientes ------");
        for (Cliente cliente : clientes) {
            cliente.getCliente();
        }
    }
}
