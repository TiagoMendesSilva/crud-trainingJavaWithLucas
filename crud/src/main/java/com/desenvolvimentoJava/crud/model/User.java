package com.desenvolvimentoJava.crud.model;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    public Integer codigo;

    public String nome;

    public String cpf;

    public Date dataNascimento;

    public User(){

    }
    public User(Integer codigo, String nome, String cpf, Date dataNascimento ){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}