/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

/**
 *
 * @author Fatec
 */
public class exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("010101","cleiton",1200);
        System.out.printf("salario do funcionario: %e \n",funcionario1.getSalario());
        System.out.printf("salario do funcionario com aumento: %e \n",funcionario1.aumentar_salario(0.10));
    }
    
}
