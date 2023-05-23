package exercicio3;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente1 = new Gerente("Dinho", 1, 1200, 123);
        Gerente gerente2 = new Gerente("Cléber", 2, 1200, 456);
        
        System.out.print("digite a senha do primeiro gerente: ");
        int senha1 = scanner.nextInt();
        System.out.printf("O resultado foi: %b\n", gerente1.autentica(senha1));
        
        System.out.print("digite a senha do segundo gerente: ");
        int senha2 = scanner.nextInt();
        System.out.printf("O resultado foi: %b\n", gerente2.autentica(senha2));
    }
    
}
