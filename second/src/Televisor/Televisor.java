package Televisor;

import Resolucion.Resolucion;

public class Televisor {
    private String marca;
    private String modelo;
    private int fabricacion;
    private Tipo tipo;
    private int size;
    private Resolucion resolucion;
    private boolean smart;
    private boolean prendido;

    public enum Tipo {
        P,
        L,
        O
    }

    public Televisor(String marca, String modelo, int fabricacion, Tipo tipo,
    int size, Resolucion resolucion, boolean smart, boolean prendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.tipo = tipo;
        this.size = size;
        this.resolucion = resolucion;
        this.smart = smart;
        this.prendido = prendido;
    }

    public String toString() {
        return marca + "--" + modelo + "--" + fabricacion + "--" + tipo + "--" + size + "--" + resolucion.toString() + "--" + smart + "--" + prendido;
    }

    public String estadoTv(){
        if (prendido) {
            return "El televisor se encuentra prendido";
        } else {
            return "El televisor se encuentra apagado";
        }
    }

    // Getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getFabricacion(){
        return fabricacion;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public int getSize(){
        return size;
    }
    public Resolucion getResolucion(){
        return resolucion;
    }

    public boolean getSmart(){
        return smart;
    }

    public boolean getPrendido(){
        return prendido;
    }

    // Setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setFabricacion(int fabricacion){
        this.fabricacion = fabricacion;
    }

    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setResolucion(Resolucion resolucion){
        this.resolucion = resolucion;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }

    public void setPrendido(boolean prendido){
        this.prendido = prendido;
    }
} 
