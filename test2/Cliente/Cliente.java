package test2.Cliente;

import test2.Auto.Auto;

public class Cliente {
    private String nombreApellido;
    private int edad;
    private Auto auto;

    public Cliente(String nombreapellido, int edad, Auto auto) {
        this.nombreApellido = nombreapellido;
        this.edad = edad;
        this.auto = auto;
    }

    public void autoCliente(Auto auto){
        this.auto = auto;
    }

    public void getCliente() {
        System.out.println("Cliente: " + nombreApellido + " " + edad);
        if (auto != null) {
            auto.getCar(); // Imprime la información del auto
        } else {
            System.out.println("No compro auto, todavia");
        }
    }

}
