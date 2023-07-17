/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3estructuradedatos.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Node {

    private Contacto contacto;
    private Node left;
    private Node right;

    public Node(Contacto contacto) {
        this.contacto = contacto;
        left = null;
        right = null;
    }
    
    public Contacto getContacto() {
        return contacto;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

}
