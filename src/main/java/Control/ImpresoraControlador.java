/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Impresora;
import Modelo.TrabajoDeImpresion;
import Vista.ImpresoraVista;

public class ImpresoraControlador {
    private Impresora impresora;
    private ImpresoraVista vista;

    public ImpresoraControlador(Impresora impresora, ImpresoraVista vista) {
        this.impresora = impresora;
        this.vista = vista;
    }

    public void agregarTrabajoDeImpresion() {
        String documento = vista.obtenerDocumento();
        int paginas = vista.obtenerNumeroPaginas();
        
        TrabajoDeImpresion trabajo = new TrabajoDeImpresion(documento, paginas);
        impresora.agregarTrabajo(trabajo);
        vista.mostrarMensaje("Trabajo agregado a la cola.");
    }

    public void imprimirTrabajo() {
        impresora.imprimirTrabajo();
    }
}
