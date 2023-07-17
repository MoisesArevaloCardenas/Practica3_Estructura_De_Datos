/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3estructuradedatos.controller;

import ec.edu.ups.practica3estructuradedatos.models.Contacto;
import ec.edu.ups.practica3estructuradedatos.models.Node;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbolContactos {

    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insert(Contacto contacto) {
        if (raiz == null) {
            raiz = new Node(contacto);
        } else {
            insertRecursivo(raiz, contacto);
        }
    }

    public void insertRecursivo(Node node, Contacto contacto) {
        if (contacto.getNombre().compareTo(node.getContacto().getNombre()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(contacto));
            } else {
                insertRecursivo(node.getLeft(), contacto);
            }
        } else if (contacto.getNombre().compareTo(node.getContacto().getNombre()) > 0) {
            if (node.getRight() == null) {
                node.setRight(new Node(contacto));
            } else {
                insertRecursivo(node.getRight(), contacto);
            }

        } else {

        }
    }

    public boolean setEquilibrio() {
        return verificarBalance(raiz);
    }

    public boolean verificarBalance(Node node) {
        if (node == null) {
            return true;//Arbol Vacio
        }
        int alturaIzq = obtenerAltura(node.getLeft());
        int alturaDer = obtenerAltura(node.getRight());
        int diferencial = Math.abs(alturaIzq - alturaDer);

        if (diferencial > 1) {
            return false;
        }
        return verificarBalance(node.getLeft()) && verificarBalance(node.getRight());
    }

    private int obtenerAltura(Node node) {
        if (node == null) {
            return 0;
        }
        int alturaIzq = obtenerAltura(node.getLeft());
        int alturaDer = obtenerAltura(node.getRight());

        return Math.max(alturaIzq, alturaDer) + 1;
    }
}
