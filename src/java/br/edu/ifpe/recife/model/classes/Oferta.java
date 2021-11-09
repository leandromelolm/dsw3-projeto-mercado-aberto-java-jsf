/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author melo
 */

@Entity
public class Oferta {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int codigo;
    @Temporal (TemporalType.DATE)
    private Date data;
    @Temporal (TemporalType.DATE)
    private Date validade;
    @Embedded
    private ItemOferta item;
    @OneToMany
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
