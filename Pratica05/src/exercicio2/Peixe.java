package exercicio2;

public class Peixe extends Animal{
    private String tipoHabitat;
    
    public Peixe(String nome, String tipohabitat, double peso){
        super(peso, nome);
        this.tipoHabitat = tipohabitat;
    }
    
    public String getTipoHabitat(){
        return tipoHabitat;
    }
    
    public void setTipoHabitat(String tipohabitat){
        this.tipoHabitat = tipohabitat;
    }

    public void ImprimirPeixe(){
        System.out.printf("Os atributos são nome: %s\n peso: %f\n habitat: %s\n", this.Nome, this.Peso, this.tipoHabitat);
    }
}
