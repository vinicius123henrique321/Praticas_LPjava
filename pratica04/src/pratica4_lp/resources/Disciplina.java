
package pratica4_lp.resources;

public class Disciplina {

    
    private int codigo;
    private int cargahoraria;
    
    
    public Disciplina(int codigo, int cargahoraria){
        this.codigo = codigo;
        this.cargahoraria = cargahoraria;
    }
    
    public void imprimir(){
        System.out.printf("codigo: %d, cargahoraria:%d \n",codigo,cargahoraria);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
}
