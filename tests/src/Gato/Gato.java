package Gato;

import Animal.Animal;

public class Gato extends Animal{
    public Gato(String raza, int patas, boolean peligroso){
        // asigna la info heredada
        super(raza, patas, peligroso);
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }
}
