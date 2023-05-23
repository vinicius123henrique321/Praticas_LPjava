package exercicio2;

public class Animal {
    protected double Peso;
    protected String Nome;
    
    public Animal(double peso, String nome){
        this.Nome = nome;
        this.Peso = peso;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public double getPeso(){
        return Peso;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public void setPeso(double peso){
        this.Peso = peso;
    }
}
