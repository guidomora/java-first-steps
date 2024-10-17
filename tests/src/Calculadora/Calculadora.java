package Calculadora;

import DividirPorZeroExceptions.DividirPorZeroExceptions;

public class Calculadora {
    // --------------------------------------------throw para la exception creada 
    public int dividir(int dividendo, int dividsor) throws DividirPorZeroExceptions{
        if(dividsor == 0 ) throw new DividirPorZeroExceptions();
        return dividendo / dividsor;
    }
}
