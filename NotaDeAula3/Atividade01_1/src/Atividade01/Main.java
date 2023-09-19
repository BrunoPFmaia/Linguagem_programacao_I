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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moto moto1 = new Moto();
        Carro carro1 = new Carro();
        
        // sets moto1
        moto1.setCilindradas(300);
        moto1.setMarca("Mercedes");
        moto1.setanoFabricacao(1995);
        moto1.setmodelo("Scooter");
        
        // Detalhes moto
        moto1.detalhesMoto();
        
        // sets carro1
        carro1.setMarca("Chevrolet");
        carro1.setNumPortas(2);
        carro1.setanoFabricacao(2000);
        carro1.setmodelo("Camaro");
        
        // Detalhes carro1
        carro1.detalhesCarro();
    }
    
}
