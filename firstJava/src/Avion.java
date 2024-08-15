

public class Avion {
    public String marca;
    public String modelo;
    public MotorDeAvion motor;
    public SistemaControlVuelo sistemaControlVuelo;
    public Ala[] alas;
    public int asientos;
    public boolean sistemaEntretenimiento;

    public Avion(String marca, String modelo, MotorDeAvion motor,
    SistemaControlVuelo sistemaControlVuelo, Ala[] alas, int asientos, boolean sistemaEntretenimiento){

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.sistemaControlVuelo = sistemaControlVuelo;
        this.alas = alas;
        this.asientos = asientos;
        this.sistemaEntretenimiento = sistemaEntretenimiento;
    }


}
