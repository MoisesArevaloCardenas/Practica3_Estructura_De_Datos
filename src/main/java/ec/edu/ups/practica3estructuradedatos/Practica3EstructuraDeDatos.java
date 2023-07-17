/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica3estructuradedatos;

import ec.edu.ups.practica3estructuradedatos.controller.ArbolContactos;
import ec.edu.ups.practica3estructuradedatos.models.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class Practica3EstructuraDeDatos {

    public static void main(String[] args) {
        ArbolContactos arbolContactos = new ArbolContactos();

        Contacto c1 = new Contacto("Juan", "1");
        Contacto c2 = new Contacto("Maria", "2");
        Contacto c3 = new Contacto("Pedro", "3");
        Contacto c4 = new Contacto("Pablo", "4");

        arbolContactos.insert(c1);
        arbolContactos.insert(c2);
        arbolContactos.insert(c3);
        arbolContactos.insert(c4);
        arbolContactos.insert(new Contacto("Juliana", "5"));
        arbolContactos.insert(new Contacto("Jhon", "6"));

    }
}
