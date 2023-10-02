/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nota_de_aula_2;

/**
 *
 * @author bruno
 */
public class Produto {
    protected String codigo;
    protected String nome;
    protected int quantidade;
    
   public String getCodigo(){
       return this.codigo;
   }
   public void setCodigo(String codigo){
       this.codigo = codigo;
   }
   
   public String getNome(){
       return this.nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }

   public int getQuantidade(){
       return this.quantidade;
   }
   public void setQuantidade(int quantidade){
       this.quantidade = quantidade;
   }
   public void Venda(int nVenda){
       this.quantidade -= nVenda;
   }
}
