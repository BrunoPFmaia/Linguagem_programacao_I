/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

/**
 *
 * @author bruno
 */
public class Gerente extends Funcionario{
    private String departamento;
    
    public String getDepartamento(){
        return this.departamento;
    }
    void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    void calcularBonus(){
        this.salario = this.salario * 1.10f;
    }
}
