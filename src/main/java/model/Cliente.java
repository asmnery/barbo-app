/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Alberth
 */
public class Cliente {
    
    private int id;
    private String nome;
    private char sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;
    private String endereco;
    private String cep;

    public Cliente(int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char sexo, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
}
