/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.controllers;

import br.edu.ifpe.recife.model.classes.Produto;
import br.edu.ifpe.recife.model.dao.ManagerDao;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author melo
 */

@ManagedBean
@SessionScoped
public class ProdutoController {
    
    private Produto cadastro;
    
    @PostConstruct
    public void init(){
        this.cadastro = new Produto();
    }
    
    public void insert(){
        ManagerDao.getCurrentInstance().insert(this.cadastro);
//        repositorios.RepositorioProduto.getCurrentInstance().inserir(cadastro);
                
        this.cadastro = new Produto();
    }

    public Produto getCadastro() {
        return cadastro;
    }

    public void setCadastro(Produto cadastro) {
        this.cadastro = cadastro;
    }    
    
}
