
package exercicio1;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("010101", "cleiton", 1200);
        System.out.printf("salario do funcionário: %e \n", funcionario.getSalario());
        System.out.printf("novo salario do funcionário: %e \n", funcionario.aumentarSalario(0.10));
    }
}
