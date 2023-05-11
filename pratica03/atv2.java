package pratica03;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)) {
            int bn = 10;
              int vetorbn[] = new int [bn];
              for (int i=0; i<bn; i++){
                System.out.printf("Informe %do valor de %d: ", (i+1), bn);
                vetorbn[i]=ler.nextInt();
              }
               for (int i=0; i<bn; i++){
                 if (vetorbn[i]>=20){
                     System.out.printf("O valor da pos. %d e %d\n", (i+1), vetorbn[i]);
                }
              }
        }
    }
}
