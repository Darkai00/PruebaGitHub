/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlatillosBD;

/**
 *
 * @author alepe
 */
public class Comida extends ElementosMenu{
    private String temperatura, tipoComida;
    private short calorias, tiempoPreparacion;

    public Comida(String temperatura, String tipoComida, short calorias, short tiempoPreparacion, float precio, boolean disponibilidad, String nombre, String descripcion) {
        super(precio, disponibilidad, nombre, descripcion);
        this.temperatura = temperatura;
        this.tipoComida = tipoComida;
        this.calorias = calorias;
        this.tiempoPreparacion = tiempoPreparacion;
    }
    
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public short getCalorias() {
        return calorias;
    }

    public void setCalorias(short calorias) {
        this.calorias = calorias;
    }

    public short getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(short tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Comida{" + "temperatura=" + temperatura + ", tipoComida=" + tipoComida + ", calorias=" + calorias + ", tiempoPreparacion=" + tiempoPreparacion + '}';
    }
    
    
}
