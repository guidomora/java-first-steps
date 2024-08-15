public class Ala {

    // Atributos
    public String nombre;
    public String color;
    public int envergadura;
    public String material;

    // Constructor -->  simplifica la creacion e inicializacion de objetos
    public Ala(String nombre, String color, int envergadura, String material){
        this.nombre = nombre;
        this.color = color;
        this.envergadura = envergadura;
        this.material = material;
    }

    // Metodos
    public String flap(){
        return "flap funcionando" + " " + nombre;
    }
}
