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
public class venda {
    
    private int codigo;
    private sessao sessao;

    public venda() {
    }

    public venda(int codigo, sessao sessao) {
        this.codigo = codigo;
        this.sessao = sessao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public sessao getSessao() {
        return sessao;
    }

    public void setSessao(sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "venda{" + "codigo=" + codigo + ", sessao=" + sessao + '}';
    }
}
