package test3.Cliente;

import java.util.ArrayList;
import java.util.List;

import test3.Auto.Auto;

public class Cliente {
    private String nombreApellido;
    private List<Auto> autos = null;

    public Cliente(String nombreApellido, Auto autos){
        this.nombreApellido = nombreApellido;
        this.autos = new ArrayList<>();
    }

    public void addAuto(Auto auto){
        autos.add(auto);
    }

    public String getCliente(){
        return "Nombre: " + nombreApellido;
    }

    public List<Auto> getAutosCliente(){
        return autos;
    }
}
