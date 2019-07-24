/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

/**
 *
 * @author marib
 */
public class salas {
    private String numeroSala;
      private String  quantidadepoltronas;
      private String numeroPoltronas;

    public salas() {
    }
      
          public salas(String numeroSala, String quantidadepoltronas, String numeroPoltronas) {
        this.numeroSala = numeroSala;
        this.quantidadepoltronas = quantidadepoltronas;
        this.numeroPoltronas = numeroPoltronas;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getQuantidadepoltronas() {
        return quantidadepoltronas;
    }

    public void setQuantidadepoltronas(String quantidadepoltronas) {
        this.quantidadepoltronas = quantidadepoltronas;
    }

    public String getNumeroPoltronas() {
        return numeroPoltronas;
    }

    public void setNumeroPoltronas(String numeroPoltronas) {
        this.numeroPoltronas = numeroPoltronas;
    }

    @Override
    public String toString() {
        return "salas{" + "numeroSala=" + numeroSala + ", quantidadepoltronas=" + quantidadepoltronas + ", numeroPoltronas=" + numeroPoltronas + '}';
    }
}
