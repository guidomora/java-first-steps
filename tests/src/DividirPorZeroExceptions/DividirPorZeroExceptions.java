package DividirPorZeroExceptions;

public class DividirPorZeroExceptions extends Exception {
    @Override
    public String getMessage(){
        return "No se puede dividir por 0";
    }
}
