package pratica03;

import java.util.Arrays;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
            int tamvet=8;int pedra=4;
            int var1=0; int var2=4;int var3=4; int var4=0;
            int vetor[] = new int [tamvet];
            int vetor2[] = new int[tamvet];
            try (Scanner ler = new Scanner(System.in)) {
                for (int i=0; i<tamvet;i++){
                    System.out.println("Insira o valor:");
                    vetor[i]= ler.nextInt();
                }
            }
            
            do {vetor2[var1]=vetor[var2];var2++;var1++;}
            while (var1<pedra);
            
            do {vetor2[var3]=vetor[var4];var4++;var3++;}
            while (var4<pedra);
            
            System.out.println("Vetor: "+ Arrays.toString(vetor2));
    }
}
