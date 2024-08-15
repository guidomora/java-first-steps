public class App {
    public static void main(String[] args) throws Exception {
        Ala ala1 = new Ala();

        ala1.nombre = "Ala 1";
        ala1.color = "Blanco";
        ala1.envergadura = 40;
        ala1.material = "Metal";
        
        System.out.println(ala1.flap());

        Ala ala2 = new Ala();

        ala2.nombre = "Ala 2";
        ala2.color = "Negro";
        ala2.envergadura = 40;
        ala2.material = "Metal";

        System.out.println(ala2.flap());
    
    }
}
