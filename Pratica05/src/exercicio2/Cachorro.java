package exercicio2;

public class Cachorro extends Animal{
    private String raca;
    
    public Cachorro(String nome, double peso, String raca){
        super(peso, nome);
        this.raca = raca;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public void ImprimirCachorro(){
        System.out.printf("Os atributos são nome: %s\n peso: %f\n raca: %s\n", this.Nome, this.Peso, this.raca);
    }
}
