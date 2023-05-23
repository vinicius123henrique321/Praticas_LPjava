package exercicio2;

public class Zoo {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("dog1", 10, "caramelo");
        Cachorro cachorro2 = new Cachorro("dog2", 12, "budercollie");
        Peixe peixe1 = new Peixe("claudio", "Agua salgada", 2);
        Peixe peixe2 = new Peixe("claudia", "Agua doce", 2);
        cachorro1.ImprimirCachorro();
        cachorro2.ImprimirCachorro();
        peixe1.ImprimirPeixe();
        peixe2.ImprimirPeixe();
    }
    
}
