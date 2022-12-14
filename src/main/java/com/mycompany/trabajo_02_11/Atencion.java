/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_02_11;

/**
 *
 * @author Kristina
 */
public class Atencion {

    private String horario;
    private String nombreVeterinario;
    private double costo;
    Mascota mascota;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Atencion(String horario, String nombreVeterinario, double costo, Mascota mascota) {
        this.horario = horario;
        this.nombreVeterinario = nombreVeterinario;
        this.costo = costo;
        this.mascota = mascota;
    }

    public void mostrarInfo() {
        System.out.println("El horario de atencion es de " + horario + "\nEl nombre del veterinario es "
                + nombreVeterinario + "\nEl costo de la cita es $" + costo + " y se atendio a "
                + this.getMascota().getNombre());
    }

}
