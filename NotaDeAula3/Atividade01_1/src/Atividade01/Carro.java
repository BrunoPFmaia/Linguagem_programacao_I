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
public class Carro extends Veiculo{
    private int numPortas;
    
    void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    public int getNumPortas(){
        return numPortas;
    }
       public void detalhesCarro(){
        System.out.println("Detalhes do Carro:\n");
        System.out.println("Marca: " + super.getMarca());
        System.out.println("Modelo: " + super.getModelo());
        System.out.println("Ano de fabricacao: " + super.getanoFabricacao());
        System.out.println("Numero de portas: " + getNumPortas());
        System.out.println("");
    }
}
