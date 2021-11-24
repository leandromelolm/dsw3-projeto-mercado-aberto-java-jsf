/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author melo
 */
@Entity
public class Usuario {
    
    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(length = 14, unique = true, nullable = false)    
    private String cpf;
    @Column(length = 150,nullable = false)
    private String nome;
    @Column(length = 30, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private String senha;
    @Column(length = 250, nullable = false)
    private String endereco;
    @Column(length = 9, nullable = false)
    private String cep;
    @Column(length = 11, nullable = false)
    private String telefone;    
    @OneToMany
    private List<Avaliacao> recebidas;
    @OneToMany
    private List<Pedido> realizados;
    @OneToMany
    private List<Oferta> ofertas;
    
    public Usuario(){
    this.ofertas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Avaliacao> getRecebidas() {
        return recebidas;
    }

    public void setRecebidas(List<Avaliacao> recebidas) {
        this.recebidas = recebidas;
    }

    public List<Pedido> getRealizados() {
        return realizados;
    }

    public void setRealizados(List<Pedido> realizados) {
        this.realizados = realizados;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
    
    
    
}
