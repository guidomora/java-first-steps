import Bicicleta.Bicicleta;
import Coche.Coche;
import Coche.Coche.Modo;
import Vehiculo.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {


        Coche coche = new Coche(Modo.normal);
        Bicicleta bici = new Bicicleta(Bicicleta.Modo.manual);
        Vehiculo vehiculo = new Vehiculo();
        

        vehiculo.desplazar();  
        coche.desplazar();     
        bici.desplazar();
    }
}
