/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlatillosBD;

/**
 *
 * @author alepe
 */
public class Pizzas extends Comida{
    private String tipoPizza;

    public Pizzas(String tipoPizza, String temperatura, String tipoComida, short calorias, short tiempoPreparacion, float precio, boolean disponibilidad, String nombre, String descripcion) {
        super(temperatura, tipoComida, calorias, tiempoPreparacion, precio, disponibilidad, nombre, descripcion);
        this.tipoPizza = tipoPizza;
    }

    public String getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    @Override
    public String toString() {
        return "Pizzas{" + "tipoPizza=" + tipoPizza + '}';
    }
    
    
}
