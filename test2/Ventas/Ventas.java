package test2.Ventas;

import java.util.ArrayList;
import java.util.List;

import test2.Auto.Auto;

public class Ventas {
    List<Auto> listadoVentas;

    public Ventas(){
        this.listadoVentas = new ArrayList<>();
    }

    public void agregarVenta(Auto auto) {
        listadoVentas.add(auto);
    }

    public void getVentas(){
        System.out.println("---- Autos vendidos --------");
        for (Auto auto : listadoVentas) {
            auto.getCar();
        }
    }
}
