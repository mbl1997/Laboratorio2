/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import java.util.Date;

/**
 *
 * @author marib
 */
public class sessao {
                     private Date horario;
	 private String filme;
	 private salas salas;

    public sessao() {
    }

    public sessao(Date horario, String filme, salas salas) {
        this.horario = horario;
        this.filme = filme;
        this.salas = salas;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public salas getSalas() {
        return salas;
    }

    public void setSalas(salas salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return "sassao{" + "horario=" + horario + ", filme=" + filme + ", salas=" + salas + '}';
    }
}
