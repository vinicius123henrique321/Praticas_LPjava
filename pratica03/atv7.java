package pratica03;

public class atv7 {
    public static void main(String[] args) {
        int A[] = {1,2,4,6,21};
        int B[] = {2,3,6,7,9,11,15,20};
        System.out.println("Lista de elementos iguais:");
        for (int i=0;i<A.length;i++){
            int numA= A[i];
            for (int z=0;z<B.length;z++){
                int numB=B[z];
                if (numA==numB){
                    System.out.print(numA + " ");
                }
            }
        }
        System.out.println("");
    }
}
