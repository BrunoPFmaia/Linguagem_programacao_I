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
public class Moto extends Veiculo{
    private int cilindradas;
    
    void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    public int getCilindradas(){
        return cilindradas;
    }
    public void detalhesMoto(){
        System.out.println("Detalhes da Moto:\n");
        System.out.println("Marca: " + super.getMarca());
        System.out.println("Modelo: " + super.getModelo());
        System.out.println("Ano de fabricacao: " + super.getanoFabricacao());
        System.out.println("Cilindradas: " + getCilindradas());
        System.out.println("");
    }
}
