
public class EnsamblarAvion {
    public static void main(String[] args) {
        MotorDeAvion motor = new MotorDeAvion("Rolls Royce", 2000, 1000, MotorDeAvion.Estado.apagado);
        SistemaControlVuelo sistema = new SistemaControlVuelo("FlightSoftware", 4, SistemaControlVuelo.Sistema.pilotoAutomatico);
        Ala ala1 = new Ala("Ala derecha", "Blanca", 40, "Metal");
        Ala ala2 = new Ala("Ala izquierda", "Blanca", 40, "Metal");
        Ala[] alas = { ala1, ala2 };

        Avion avion = new Avion("Boeing", "737", motor, sistema, alas, 350, true);

        System.out.println("Motor:" + " " + motor.marca + " " + motor.hp + " " + motor.libras + " " + motor.estado + " " );
        System.out.println("Sistema de vuelo" + " " + sistema.fabricante + " " + sistema.modos + " " + sistema.sistema);
        System.out.println("Ala 1" + " " + ala1.nombre + " " + ala1.envergadura + " " + ala1.material + " " + ala1.color);
        System.out.println("Ala 2" + " " + ala2.nombre + " " + ala2.envergadura + " " + ala2.material + " " + ala2.color);
        System.out.println("Avion" + " " + avion.marca + " " + avion.modelo + " " + avion.asientos + " " + avion.sistemaEntretenimiento);

    }
}