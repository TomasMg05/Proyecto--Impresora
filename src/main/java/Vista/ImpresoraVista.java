/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

// Vista: ImpresoraVista.java
import java.util.Scanner;

public class ImpresoraVista {
    private Scanner scanner = new Scanner(System.in);

    public String obtenerDocumento() {
        System.out.println("Ingrese el nombre del documento a imprimir:");
        return scanner.nextLine();
    }

    public int obtenerNumeroPaginas() {
        System.out.println("Ingrese el número de páginas:");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
