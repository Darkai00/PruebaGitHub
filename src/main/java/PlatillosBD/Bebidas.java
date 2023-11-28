/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlatillosBD;

/**
 *
 * @author alepe
 */
public class Bebidas extends ElementosMenu{
    private short ml;
    private String sabor;
    private String color;

    public Bebidas(short ml, String sabor, String color, float precio, boolean disponibilidad, String nombre, String descripcion) {
        super(precio, disponibilidad, nombre, descripcion);
        this.ml = ml;
        this.sabor = sabor;
        this.color = color;
    }
    
    
    
    public short getMl() {
        return ml;
    }

    public void setMl(short ml) {
        this.ml = ml;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "ml=" + ml + ", sabor=" + sabor + ", color=" + color + '}';
    }
    
    
    
}
