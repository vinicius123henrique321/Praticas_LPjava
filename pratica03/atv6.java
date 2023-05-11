package pratica03;

import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        int bn=10;
            int ct; int crl=0;
            try (Scanner ler = new Scanner(System.in)) {
                int vetor[] = {2,5,4,54,43,22,5,9,30,15};
                
////          CASO QUEIRA QUE A PESSOA INSIRA OS VALORES
////
//            int vetor[]= new int [bn];
//            System.out.print("Insira 10 valores no vetor a seguir\n");
//            for (int i=0;i<bn;i++){
//                System.out.println("Insira o valor a seguir:");
//                vetor[i]=ler.nextInt();
//            }
//          
                System.out.println("\nInsira o valor que deseja procurar");
                System.out.printf("Valor: ");
                ct= ler.nextInt();
                for (int i=0;i<bn;i++){
                    crl++;
                    if (vetor[i]==ct){
                       System.out.printf("O numero %d encontra-se na pos. %d",ct,crl);
                       return;              
                    }
                }
            }
            
////          CASO QUEIRA UMA LISTA JÁ FEITA
           
            System.out.println("Não foi encontrado o num. no vetor");
    }
}
