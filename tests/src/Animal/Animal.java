package Animal;

public class Animal {
    private String raza;
    private int patas;
    private boolean peligroso;
    static int numero = 0;

    public Animal(String raza, int patas, boolean peligroso){
        this.raza = raza;
        this.patas = patas;
        this.peligroso = peligroso;
        numero++;
    }

    public String hacerSonido(){
        return "hacer sonido";
    }

    public int getCantidad(){
        return numero;
    }
}
