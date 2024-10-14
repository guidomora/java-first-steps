package Person;

public class Person {
    private String nombre;
    private String apellido;
    private int edad;

    public Person(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String saludo(){
        return "Hola como estas?" + "mi nombre es " + nombre + " " + apellido 
        + " " + edad;    
    }
}
