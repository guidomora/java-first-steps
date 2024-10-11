package Coche;

import Vehiculo.Vehiculo;

public class Coche extends Vehiculo {
    private Modo modo;


    public enum Modo {
        automatico,
        normal
    }

    public Coche(Modo modo){
        this.modo = modo;
    }

    public void setModo(Modo modo){
        this.modo = modo;
    }

    @Override
    public String desplazar(){
        return "desplazamiento en modo " + modo ;
    }
}
