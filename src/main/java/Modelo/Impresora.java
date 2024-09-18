/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.LinkedList;
import java.util.Queue;

public class Impresora {
    private String modelo;
    private Queue<TrabajoDeImpresion> colaImpresion;

    public Impresora(String modelo) {
        this.modelo = modelo;
        this.colaImpresion = new LinkedList<>();
    }

    public void agregarTrabajo(TrabajoDeImpresion trabajo) {
        colaImpresion.add(trabajo);
    }

    public void imprimirTrabajo() {
        if (!colaImpresion.isEmpty()) {
            TrabajoDeImpresion trabajo = colaImpresion.poll();
            System.out.println("Imprimiendo: " + trabajo.getDocumento());
        } else {
            System.out.println("No hay trabajos en la cola.");
        }
    }
}

