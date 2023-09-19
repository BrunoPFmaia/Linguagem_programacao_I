/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

/**
 *
 * @author brunoP.66
 */
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    
    protected void setMarca(String marca){
        this.marca = marca;
    }
    
    protected String getMarca(){
        return marca;
    }
    
    protected void setmodelo(String modelo){
        this.modelo = modelo;
    }
    
    protected String getModelo(){
        return modelo;
    }
    
    protected void setanoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    
    protected int getanoFabricacao(){
        return anoFabricacao;
    }
}
