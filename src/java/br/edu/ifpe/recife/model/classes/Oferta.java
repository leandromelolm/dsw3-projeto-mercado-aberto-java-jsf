/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author melo
 */
public class Oferta {
    
    private int codigo;
    private Date data;
    private Date validade;
    private ItemOferta item;
    private List<Pedido> realizados;
    
    public Oferta(){
        this.data = new Date();
        this.realizados = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public ItemOferta getItem() {
        return item;
    }

    public void setItem(ItemOferta item) {
        this.item = item;
    }

    public List<Pedido> getRealizados() {
        return realizados;
    }

    public void setRealizados(List<Pedido> realizados) {
        this.realizados = realizados;
    }
    
    
    
}
