package pratica03;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        int bn=0;
            int vetor[];
            int tamanho;
            try (Scanner ler = new Scanner(System.in)) {
                System.out.println("Defina o tamanho do vetor");
                tamanho = ler.nextInt();
                vetor= new int[tamanho];
                for (int i=0; tamanho>i;i++){
                    System.out.printf("Informe %do valor de %d: ", (i+1), tamanho);
                    vetor[i]=ler.nextInt();
                }
            }
            System.out.println(tamanho);
            System.out.println("Ordem inversa:");
            for (int z=(tamanho-1);z>=bn;z--){
               System.out.println(vetor[z]);
            }
    }
}
