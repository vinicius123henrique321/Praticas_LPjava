package exercicio1;

public class Funcionario extends Pessoa{
    private double salario;
    
    public Funcionario(String rg, String nome, double salario){
        super(rg, nome);
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double aumentarSalario(double percentual){
        return (this.salario * percentual) + this.salario;
    }    
}
