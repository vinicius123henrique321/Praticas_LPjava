/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Empresa {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Gerente gerente1 = new Gerente("Claudia", 20383845, 3000, 123);
        Gerente gerente2 = new Gerente("Roberto", 58237459, 2500, 456);
        
        System.out.print("Informacoes sobre o gerente 1");
        gerente1.imprimir();
        System.out.println("digite agora a senha do gerente 1");
        int senha_input = scanner.nextInt();
        System.out.printf("o resultado da sua autenticacao: %b\n", gerente1.autentica(senha_input));

        System.out.print("Informacoes sobre o gerente 2");
        gerente2.imprimir();
        System.out.println("Digite agora a senha do gerente 2");
        int senha_input2 = scanner.nextInt();
        System.out.printf("O resultado da sua autenticacao: %b\n", gerente2.autentica(senha_input2));
        
        
    }
    
}
