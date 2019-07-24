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
public class filme {
             private String codigo;
	private String nomeFilme;
	private String  genero;
	private String sinopse;

            public filme() {
            }

                    public filme(String codigo, String nomeFilme, String genero, String sinopse) {
                        this.codigo = codigo;
                        this.nomeFilme = nomeFilme;
                        this.genero = genero;
                        this.sinopse = sinopse;
                    }

            public String getCodigo() {
                return codigo;
            }

            public void setCodigo(String codigo) {
                this.codigo = codigo;
            }

            public String getNomeFilme() {
                return nomeFilme;
            }

            public void setNomeFilme(String nomeFilme) {
                this.nomeFilme = nomeFilme;
            }

            public String getGenero() {
                return genero;
            }

            public void setGenero(String genero) {
                this.genero = genero;
            }

            public String getSinopse() {
                return sinopse;
            }

            public void setSinopse(String sinopse) {
                this.sinopse = sinopse;
            }
}
