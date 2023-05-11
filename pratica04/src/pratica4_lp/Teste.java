
package pratica4_lp;
import pratica4_lp.resources.Disciplina;
import pratica4_lp.resources.Curso;

public class Teste {

    public static void main(String[] args) {
        Disciplina D1,D2,D3,D4;
        D1 = new Disciplina(1, 2);
        D2 = new Disciplina(2, 5);
        D3 = new Disciplina(3, 8);
        D4 = new Disciplina(4, 1);
        
        Curso curso1 = new Curso(1234, "Curso teste");
        curso1.adicionarDisciplina(D1);
        curso1.adicionarDisciplina(D2);
        curso1.adicionarDisciplina(D3);
        curso1.adicionarDisciplina(D4);
        
        
        curso1.imprimir();
        curso1.exibeDisciplinaCargaMaior();
        
        System.out.printf("SOMA TOTAL DE CARGA HORARIA DAS DISCIPLINAS: %d\n",curso1.CalcularTotalHora());
    }
    
}
