
package exercicio1;

public class Pessoa {
    protected String RG;
    protected String Nome;
    
    public Pessoa(String nome, String rg){
        this.Nome = nome;
        this.RG = rg;
    }
       
    
    public String getNome(){
        return Nome;
    }
    
    public String getRG(){
        return RG;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public void setRG(String rg){
        this.RG = rg;
    }
}
