
package pratica04;

import java.util.List;

public class Disciplina {

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the listaDisciplina
     */
    public List getListaDisciplina() {
        return listaDisciplina;
    }

    /**
     * @param listaDisciplina the listaDisciplina to set
     */
    public void setListaDisciplina(List listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
    private int numero;
    private String nome;
    private List listaDisciplina;
}
