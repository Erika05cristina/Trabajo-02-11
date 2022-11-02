/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabajo_02_11;

/**
 *
 * @author Kristina
 */
public class Trabajo_02_11 {

    public static void main(String[] args) {

        var andres = new Dueno("Andres", "010638139", "Ricaurte");
        var carlos = new Dueno("Carlos", "019394729", "Baños");
        var sofia = new Dueno("Sofia", "010371836", "Sayausi");

        var pipo = new Mascota("Pipo", "pastor aleman", 4, andres);
        var princesa = new Mascota("Princesa", "Snaucer", 3, carlos);
        var sasha = new Mascota("Sasha", "Jetsu", 1, sofia);
        var atencion1 = new Atencion("14:00-16:00", "Jaime", 12.30, pipo);
        var atencion2 = new Atencion("09:00-10:30", "Pepito", 10.50, princesa);
        var atencion3 = new Atencion("08:00-8:40", "Andrea", 8.00, sasha);

        System.out.println("-----------------");
        atencion1.mostrarInfo();
        pipo.mostrarInfo();
        andres.mostrarInfo();

        System.out.println("-----------------");
        atencion2.mostrarInfo();
        princesa.mostrarInfo();
        carlos.mostrarInfo();

        System.out.println("-----------------");
        atencion3.mostrarInfo();
        sasha.mostrarInfo();
        sofia.mostrarInfo();

    }
}
