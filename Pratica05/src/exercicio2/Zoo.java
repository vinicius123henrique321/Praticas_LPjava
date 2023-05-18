/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Fatec
 */
public class Zoo {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("tilapia", 20, "agua");
        Peixe peixe2 = new Peixe("salmao", 15, "agua");
        Cachorro cachorro1 = new Cachorro("cachorro1", 20, "pitbull");
        Cachorro cachorro2 = new Cachorro("cachorro2", 25, "pastor");
        peixe1.imprimir();
        peixe2.imprimir();
        cachorro1.imprimir();
        cachorro2.imprimir();     
    }
    
}
