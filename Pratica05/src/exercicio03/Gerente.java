/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

public class Gerente extends Funcionario{
    private int senha;
    public Gerente(String nome, int cpf,double salario,int senha){
        super(nome,cpf,salario);
        this.senha = senha;
    }
    
    public int getSenha(){
        return this.senha;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public void imprimir(){
        System.out.printf("DADOS DO GERENTE\nNOME: %s\nCPF: %d\nSALARIO: %2f\nSENHA: %d\n",
                            this.nome,this.cpf,this.salario,this.senha);
        }
    
    public boolean autentica(int senha){
        return senha == this.senha;
    } 
}
