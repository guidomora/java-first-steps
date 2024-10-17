package test3.Auto;

public class Auto implements Comparable<Auto> {
    private int year;
    private String marca;
    private String modelo;
    private String categoria;

    public Auto(int year,String marca,String modelo,String categoria){
        this.year = year;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getAuto(){
        return "Marca: " + marca + " " + "Año " + year + " Categoria: "+ categoria + " Modelo: " + modelo;
    }

    @Override
    public int compareTo(Auto other){
        return this.marca.compareTo(other.marca);
    }
}
