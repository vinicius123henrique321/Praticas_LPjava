package exercicio3;

public class Gerente extends Funcionario{
    private int Senha;
    
    public Gerente(String nome, int cpf, double salario, int senha){
        super(cpf, nome, salario);
        this.Senha = senha;
    }
    
    public boolean autentica(int senhateste){
        return senhateste == this.Senha;
    }
    
    public void imprimir(){
        System.out.printf("os atributos são: Nome: %s\n cpf: d%\n salario: 2f%\n senha: d%\n", 
                this.Nome, this.Cpf, this.Salario, this.Senha);        
    } 
}
