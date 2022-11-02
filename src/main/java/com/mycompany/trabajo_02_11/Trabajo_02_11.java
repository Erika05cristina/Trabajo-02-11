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
        var atencion1 = new Atencion("14:00-16:00", "Jaime", 12.30);
        var atencion2 = new Atencion("09:00-10:30", "Pepito", 10.50);
        var atencion3 = new Atencion("08:00-8:40", "Andrea", 8.00);

        var andres = new Dueno("Andres", "010638139", "Ricaurte");
        var carlos = new Dueno("Carlos", "019394729", "Baños");
        var sofia = new Dueno("Sofia", "010371836", "Sayausi");

        var pipo = new Mascota("Pipo", "pastor aleman", 4, andres, atencion1);
        var princesa = new Mascota("Princesa", "Snaucer", 3, carlos, atencion2);
        var sasha = new Mascota("Sasha", "Jetsu", 1, sofia, atencion3);
        
        System.out.println("-----------------");
        pipo.mostrarInfo();
        andres.mostrarInfo();
        atencion1.mostrarInfo();
        System.out.println("-----------------");
        princesa.mostrarInfo();
        carlos.mostrarInfo();
        atencion2.mostrarInfo();
        System.out.println("-----------------");
        sasha.mostrarInfo();
        sofia.mostrarInfo();
        atencion3.mostrarInfo();

    }
}
