/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_02_11;

/**
 *
 * @author Kristina
 */
public class Mascota {

    private String nombre;
    private String raza;
    private int edad;
    Dueno propietario;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueno getPropietario() {
        return propietario;
    }

    public void setPropietario(Dueno propietario) {
        this.propietario = propietario;
    }

   

    public Mascota(String nombre, String raza, int edad, Dueno propietario) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.propietario = propietario;
       
    }

    public void mostrarInfo() {
        System.out.println("El nombre de la mascota es " + nombre + " es de raza "
                + raza + " tiene " + edad + " años.\n" + "Su dueño es "
                + this.getPropietario().getNombre());
    }

}
