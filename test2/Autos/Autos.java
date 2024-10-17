package test2.Autos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test2.Auto.Auto;
import test2.Cliente.Cliente;
import test2.Ventas.Ventas;

public class Autos {
    private List<Auto> autos;
    private Ventas listado = new Ventas();
    
    public Autos(Ventas ventas){
        this.autos = new ArrayList<>();
        this.listado = ventas;
    }
    public void agregarAuto(Auto auto) {
       autos.add(auto);
    }

    public void mostrarVentas() {
        listado.getVentas();
    }

    public void listaAutos(){
        System.out.println("------ Listado de autos disponibles------");
        for (Auto auto : autos) {
            auto.getCar();
        }
    }

    public void autosOrdenados(){
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
        Collections.sort(autos);
        listaAutos();
    }

    public void venderAuto(Auto auto, Cliente cliente){
        if (autos.contains(auto)) {
            System.out.println("------ Venta ---------");
            cliente.autoCliente(auto);
            autos.remove(auto);
            System.out.println("El cliente compro:");
            cliente.getCliente();
            listado.agregarVenta(auto);
        } else {
            System.out.println("El auto no esta disponible");
        }

    }

}