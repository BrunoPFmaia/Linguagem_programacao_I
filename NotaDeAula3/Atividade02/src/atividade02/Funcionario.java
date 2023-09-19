/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

/**
 *
 * @author bruno
 */
public class Funcionario {
    protected String nome;
    protected Float salario;
    
    public String getNome(){
        return this.nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    public Float getSalario(){
        return this.salario;
    }
    void setSalario(Float salario){
        this.salario = salario;
    }
}
