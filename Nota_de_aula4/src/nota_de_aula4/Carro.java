/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nota_de_aula4;

/**
 *
 * @author bruno
 */
public class Carro {
    protected String modelo;
    protected String marca;
    
    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    void mostrarDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
