package Bicicleta;

import Vehiculo.Vehiculo;

public class Bicicleta extends Vehiculo {
    private Modo modo;

    public enum Modo {
        manual,
        automatico
    }

    public Bicicleta(Modo modo){
        this.modo = modo;
    }

    @Override
    public String desplazar(){
        return "desplazamiento en modo " + modo ;
    }
}
