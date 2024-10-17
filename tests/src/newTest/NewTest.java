package newTest;

public class NewTest {
    private String hola = "hola";
    private String hola1 = "hola1";

    public NewTest(String hola, String hola1) {
        this.hola = hola;
        this.hola1 = hola1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Si ambos objetos son el mismo, son iguales.
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si el objeto es null o no son de la misma clase, no son iguales.
        }
        NewTest other = (NewTest) obj; // Casteamos el objeto a tipo NewTest
        // Comparamos los atributos
        return hola.equals(other.hola) && hola1.equals(other.hola1);
    }


}
