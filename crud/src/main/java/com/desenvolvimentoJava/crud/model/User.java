package com.desenvolvimentoJava.crud.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long codigo;

    public String nome;

    public String cpf;

    public Date aniversario;

    public User(){
    }
    public User(Long codigo, String nome, String cpf, Date aniversario ){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.aniversario = aniversario;
    }

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo){
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

    public Date getAniversario() {
        return aniversario;
    }
    public void setDataNascimento(Date aniversario){
        this.aniversario = aniversario;
    }
}