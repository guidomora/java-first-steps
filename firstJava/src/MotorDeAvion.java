public class MotorDeAvion {

    public enum Estado {
        encendido, apagado
    }

    public String marca;
    public int hp;
    public int libras;
    public Estado estado;

    public MotorDeAvion (String marca, int hp, int libras, Estado estado){
        this.marca = marca;
        this.hp = hp;
        this.libras = libras;
        this.estado = estado;
    }

    public void setEstado (Estado estado){
        this.estado = estado;
    }

}
