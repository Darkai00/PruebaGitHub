/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlatillosBD;

/**
 *
 * @author alepe
 */
public class Pastas extends Comida{
    private String tipoPasta;

    public Pastas(String tipoPasta, String temperatura, String tipoComida, short calorias, short tiempoPreparacion, float precio, boolean disponibilidad, String nombre, String descripcion) {
        super(temperatura, tipoComida, calorias, tiempoPreparacion, precio, disponibilidad, nombre, descripcion);
        this.tipoPasta = tipoPasta;
    }

    

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    @Override
    public String toString() {
        return "Pastas{" + "tipoPasta=" + tipoPasta + '}';
    }
    
    
}
