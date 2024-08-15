

public class App {
    public static void main(String[] args) throws Exception {

        Ala ala1 = new Ala("ala1", "Blanca", 40, "Metal");
        Ala ala2 = new Ala("ala2", "Blanca", 40, "Metal");
        System.out.println(ala1.flap());
        System.out.println(ala2.flap());

        // --------------------------------------------------------

        SistemaControlVuelo sistema1 = new SistemaControlVuelo("Boeing", 4, SistemaControlVuelo.Sistema.manual);
        System.out.println("Fabricante: " + sistema1.fabricante);
        System.out.println("Modos: " + sistema1.modos);
        System.out.println("Sistema: " + sistema1.sistema);

        // ----------------------------------------------------------

        MotorDeAvion motor = new MotorDeAvion("Rolls royce", 2000, 600, MotorDeAvion.Estado.encendido);
        System.out.println(motor.marca);
        System.out.println(motor.hp);
        System.out.println(motor.libras);
        System.out.println(motor.estado);
    }
}
