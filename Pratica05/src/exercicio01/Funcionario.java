/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author Fatec
 */
public class Funcionario extends Pessoa {

    private double salario;
    
    public Funcionario(String RG, String nome,double salario) {
        super(RG, nome);
        this.salario = salario;   
    }
    
    public double getSalario(){
       return this.salario; 
    }
   
    public void setSalario(double salario){
        this.salario = salario;       
    }
    
    public double aumentar_salario(double percentual){
        return (this.salario * percentual) + this.salario;
        
    }
    
    
}

    
