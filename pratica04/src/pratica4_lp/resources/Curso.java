
package pratica4_lp.resources;

import java.util.ArrayList;
import java.util.List;

public class Curso {


    private int numero;
    private String nome;
    private List<Disciplina> listadisciplina;
    
    
    public Curso(int numero,String nome){
        this.numero = numero;
        this.nome = nome;
        listadisciplina = new ArrayList<Disciplina>();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getListadisciplina() {
        return listadisciplina;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        listadisciplina.add(disciplina);
    }

    public void imprimir(){
        System.out.printf("numero do curso: %d, nome do curso: %s, \n",this.numero,this.nome);
        System.out.printf("numero de disciplinas neste curso: %d\n",this.listadisciplina.size());
        System.out.println("LISTA DE DISCIPLINAS");
        if(listadisciplina.isEmpty() == true){
            System.out.print("este curso esta sem disciplinas \n");
        }else{
  
            for(Disciplina disciplina: listadisciplina){
                disciplina.imprimir();
            }
        }
        
    }
    
    public void exibeDisciplinaCargaMaior(){
        int carga_horaria = 0;
        
        for(Disciplina disciplina: listadisciplina){
            if(disciplina.getCargahoraria() > carga_horaria){
                carga_horaria = disciplina.getCargahoraria();
            }
        }
        
        System.out.printf("o maior numero de carga horaria :%d \nLISTA DE DISCIPLINAS COM TAL HORARIO:\n", carga_horaria);
        for(Disciplina disciplina: listadisciplina){
            if(disciplina.getCargahoraria() == carga_horaria){
                System.out.println(disciplina.getCodigo());
            }
        }   
    }
    
    public int CalcularTotalHora(){
        int total = 0;
        for(Disciplina disciplina: listadisciplina){
            total += disciplina.getCargahoraria();
        }
        return total;
    }
    
    
    
}