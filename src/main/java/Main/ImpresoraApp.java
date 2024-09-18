/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Control.ImpresoraControlador;
import Modelo.Impresora;
import Vista.ImpresoraVista;

public class ImpresoraApp {
    public static void main(String[] args) {
        Impresora impresora = new Impresora("Modelo X123");
        ImpresoraVista vista = new ImpresoraVista();
        ImpresoraControlador controlador = new ImpresoraControlador(impresora, vista);

        controlador.agregarTrabajoDeImpresion();
        controlador.imprimirTrabajo();
    }
}

