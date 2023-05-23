package exercicio3;

public class Funcionario {
    protected int Cpf;
    protected String Nome;
    protected double Salario;
    
    public Funcionario(int cpf, String nome, double salario){
        this.Cpf = cpf;
        this.Nome = nome;
        this.Salario = salario;
    }
    
    public int getCpf(){
        return Cpf;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public double getSalario(){
        return Salario;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public void setSalario(double salario){
        this.Salario = salario;
    }
    
    public void setCpf(int cpf){
        this.Cpf = cpf;
    }
}





