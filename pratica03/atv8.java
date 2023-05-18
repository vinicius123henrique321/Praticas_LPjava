package pratica03;

public class atv8{

    public static void main(String[] args) {
    int M[] = {1,2,3,4,5,6,7,8,9,10};
    int N[] = {1,1,1,1,1,1,1,1,1,1};
    int soma=0;
    for (int i=0;i<M.length;i++){
        int C=M[i]*N[i];
        soma+=C;
    }
    System.out.print("O produto escalar de ambos os vetores e " + soma);
}
}