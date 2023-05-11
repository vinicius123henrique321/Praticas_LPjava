package pratica03;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int bn=10;
            int vetor1[]= new int[bn];
            int vetor2[]= new int[bn];
            int ct1=0;
            int ct2=0;
            int ct3=0;
            int maior=0;
            int soma=0;
            
            for (int i=0;i<bn;i++){
                System.out.println("Insira o valor: ");
                vetor1[i]=ler.nextInt();
                if (vetor1[i]%2==0){               
                  vetor2[ct1]=vetor1[i];
                  ct1+=1;
                }
            }
            
            for (int i=0;i<bn;i++){
                if (vetor2[i]>0){
                  ct2+=1;    
                }
                ct3=vetor2[i];
                if (ct3>maior){
                  maior=ct3;
                }
                soma+=vetor2[i];
            }
            
            System.out.println("\nQuantidade total do vetor: "+ ct2);
            System.out.println("O maior valor encontrado foi: "+ maior);
            System.out.println("A media foi de: " + (soma/ct2));
        }
    }
}

