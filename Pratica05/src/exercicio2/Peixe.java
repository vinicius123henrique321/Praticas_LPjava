/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Fatec
 */
public class Peixe extends Animal {
    private String tipoHabitat ;
    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    public void imprimir(){
        System.out.printf("ATRIBUTOS DE PEIXE\nnome: %s\npeso: %f\nhabitat: %s\n",this.nome,this.peso,this.tipoHabitat);
    }
    
    
}
