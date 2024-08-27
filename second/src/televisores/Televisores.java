package televisores;

import Resolucion.Resolucion;
import Televisor.Televisor;
import Televisor.Televisor.Tipo;

public class Televisores {
    public static void main(String[] args) {

        Resolucion resolucion4k = new Resolucion("4K");

        Televisor televisor1 = new Televisor("LG", "C55XM2", 2023, Tipo.O, 55, resolucion4k, true, false);
        Televisor televisor2 = new Televisor("Samsung", "Quantum Dot", 2024, Tipo.O, 75, resolucion4k, true, true);

        televisor1.setPrendido(true);

        System.out.println(televisor1.toString()); 
        System.out.println(televisor2.toString());

        System.out.println(televisor1.getModelo() + " " + televisor1.estadoTv());
        System.out.println(televisor2.getModelo() + " " +televisor2.estadoTv());
    }
}

