/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nota_de_aula_2;
import java.util.Scanner;
/**
 *
 * @author bruno
 */
public class Nota_de_aula_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto produto1 = new Produto();
        int r;
        
        System.out.println("Cadastro do produto:");
        System.out.print("Codigo: ");
        produto1.setCodigo(sc.nextLine());
        System.out.print("Nome: ");
        produto1.setNome(sc.nextLine());
        System.out.print("Quantidade: ");
        produto1.setQuantidade(sc2.nextInt());
        
        System.out.println("Produto cadastrado com sucesso!");
        do{
        System.out.println("Deseja realizar uma venda?(0/1)");
        switch(r = sc2.nextInt()){
            case 0:
                System.out.println("Encerrando programa.");
                break;
            case 1:
                System.out.print("Qual e a quantidade vendida? ");
                int nVenda = sc2.nextInt();
                produto1.Venda(nVenda);
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
        }while(r != 1 & r != 0);
    }
    
}
