/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

// Modelo: TrabajoDeImpresion.java
public class TrabajoDeImpresion {
    private String documento;
    private int paginas;

    public TrabajoDeImpresion(String documento, int paginas) {
        this.documento = documento;
        this.paginas = paginas;
    }

    public String getDocumento() {
        return documento;
    }

    public int getPaginas() {
        return paginas;
    }
}

