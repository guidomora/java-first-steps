package test3;

import java.util.List;


import test3.Auto.Auto;
import test3.Autos.Autos;
import test3.Cliente.Cliente;
import test3.Clientes.Clientes;

/**
 * Concesionaria
 */
public class Concesionaria {
    Autos autos = new Autos();
    Auto auto1 = new Auto(2018, "Peugeot", "208 Gt", "Hatchback");
    Auto auto2 = new Auto(2017, "Ds", "Ds3", "Hatchback");
    Auto auto3 = new Auto(2020, "Toyota", "Hilux", "Pickup");
    Auto auto4 = new Auto(2024, "BMW", "X6", "suv");
    Auto auto5 = new Auto(2024, "Audi", "A4", "sedan");
    
    
    Clientes clientes = new Clientes();
    Cliente cliente1 = new Cliente("Guido Morabito", auto4);
    Cliente cliente2 = new Cliente("Hugo Morabito", auto3);

    public Concesionaria(){
        autos.addAuto(auto1);
        autos.addAuto(auto2);
        autos.addAuto(auto3);
        autos.addAuto(auto4);
        autos.addAuto(auto5);
        System.out.println("-------- Lista de autos disponibles ------");
        autos.getAutos();

        // System.out.println("-------- Lista de clientes ------");
        clientes.addClientes(cliente1);
        clientes.addClientes(cliente2);
        // clientes.clientsList();
    }
}