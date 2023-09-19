/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade02;
import java.util.Scanner;
/**
 *
 * @author bruno
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        Gerente gerente1 = new Gerente();
        Diretor diretor1 = new Diretor();
        
        do{
            System.out.println("Informe a opcao desejada:");
            System.out.println("1- Cadastrar gerente");
            System.out.println("2- Cadastrar Diretor");
            System.out.println("3- Sair");
            int r = sc2.nextInt();
            if(r == 1){
                System.out.println("Informe os dados do gerente.");
                System.out.print("Nome: ");
                gerente1.setNome(sc.nextLine());
                System.out.print("Salario: ");
                gerente1.setSalario(sc2.nextFloat());
                System.out.print("Departamento: ");
                gerente1.setDepartamento(sc.nextLine());
                gerente1.calcularBonus();
            }
            else if(r == 2){
                System.out.println("Informe os dados do Diretor.");
                System.out.print("Nome: ");
                diretor1.setNome(sc.nextLine());
                System.out.print("Salario: ");
                diretor1.setSalario(sc2.nextFloat());
                System.out.print("Acoes: ");
                diretor1.setAcoes(sc2.nextInt());
                    }
            else if(r == 3){
                break;
            }
        }while(true);
        sc.close();
        sc2.close();
    }
    
}
