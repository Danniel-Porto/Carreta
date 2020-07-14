/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author mille
 */
public class Funcionario {
    private LocalDate date =  java.time.LocalDate.now();
    private String cpf, rg, nome, endereco, uf, bairro, tipo;
    private int codigo = new Random().nextInt(100);
    private int id = (int)(Math.random() * (999999999 - 0 + 1) + 0);
    private double salario;
    
    public Funcionario (){}

    public Funcionario(String cpf, String rg, String nome, String endereco, String uf, String bairro, double salario) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.endereco = endereco;
        this.uf = uf;
        this.bairro = bairro;
        this.salario = salario;
        this.tipo = "Funcionario";
    }

    public LocalDate getDate() {
        return date;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
}
