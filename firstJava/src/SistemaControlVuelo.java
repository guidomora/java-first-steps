public class SistemaControlVuelo {
    
    public enum Sistema {
        manual, pilotoAutomatico
    }
    
    public String fabricante;
    public int modos;
    public Sistema sistema;

    public SistemaControlVuelo(String fabricante, int modos, Sistema sistema){
        this.fabricante = fabricante;
        this.modos = modos;
        this.sistema = sistema;
    }

    public void setSistema (Sistema sistema) {
        this.sistema = sistema;
    }
}
