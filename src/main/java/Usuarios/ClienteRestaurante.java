/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author alepe
 */
public class ClienteRestaurante {
    public String nombre;
    public String A_P;
    public String A_M;
    public int edad;
    public String direccion;
    public String email;
    public boolean tieneCuenta;
    public boolean clienteFrecuente;
    public short telefono;

    public ClienteRestaurante(String nombre, String A_P, String A_M, int edad, String direccion, String email, boolean tieneCuenta, boolean clienteFrecuente, short telefono) {
        this.nombre = nombre;
        this.A_P = A_P;
        this.A_M = A_M;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.tieneCuenta = tieneCuenta;
        this.clienteFrecuente = clienteFrecuente;
        this.telefono = telefono;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_P() {
        return A_P;
    }

    public void setA_P(String A_P) {
        this.A_P = A_P;
    }

    public String getA_M() {
        return A_M;
    }

    public void setA_M(String A_M) {
        this.A_M = A_M;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTieneCuenta() {
        return tieneCuenta;
    }

    public void setTieneCuenta(boolean tieneCuenta) {
        this.tieneCuenta = tieneCuenta;
    }

    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente(boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }

    public short getTelefono() {
        return telefono;
    }

    public void setTelefono(short telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteRestaurante{" + "nombre=" + nombre + ", A_P=" + A_P + ", A_M=" + A_M + ", edad=" + edad + ", direccion=" + direccion + ", email=" + email + ", tieneCuenta=" + tieneCuenta + ", clienteFrecuente=" + clienteFrecuente + ", telefono=" + telefono + '}';
    }
    
    
    
            }