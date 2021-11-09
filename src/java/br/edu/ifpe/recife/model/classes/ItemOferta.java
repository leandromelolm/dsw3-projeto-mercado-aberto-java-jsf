/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.classes;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author melo
 */

@Embeddable
public class ItemOferta {
    
    @Column
    private int codigo;
    @Column
    private Double preco;
    @Column
    private int quantidade;
    @Column
    private String obsevarcoes;
    @ManyToOne
    private Produto produto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObsevarcoes() {
        return obsevarcoes;
    }

    public void setObsevarcoes(String obsevarcoes) {
        this.obsevarcoes = obsevarcoes;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
}
