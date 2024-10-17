package test2;

import test2.Auto.Auto;
import test2.Autos.Autos;
import test2.Cliente.Cliente;
import test2.Clientes.Clientes;
import test2.Ventas.Ventas;

public class App {
    public static void main(String[] args) {
        Ventas ventas = new Ventas();
        Autos autos = new Autos(ventas);
        Auto auto = new Auto(2018, "Peugeot", "208 Gt", "1.6 thp");
        Auto auto1 = new Auto(2018, "Ds", "Ds3", "1.6 thp");
        Auto auto2 = new Auto(2018, "Audi", "A1", "1.4");
        Auto auto3 = new Auto(2018, "Fiat", "Abarth 595", "1.4");
        
        autos.agregarAuto(auto);
        autos.agregarAuto(auto1);
        autos.agregarAuto(auto2);
        autos.agregarAuto(auto3);

        autos.listaAutos();

        Cliente cliente = new Cliente("Guido Morabito", 24, null);
        Cliente cliente1 = new Cliente("Hugo Morabito", 64, null);
        Clientes clientes = new Clientes();

        clientes.agregarClientes(cliente);
        clientes.agregarClientes(cliente1);
        // clientes.listaClientes();



        autos.venderAuto(auto3, cliente1);
        autos.listaAutos();
        ventas.getVentas();

        autos.autosOrdenados();
    }

}
