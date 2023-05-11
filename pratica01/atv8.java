package pratica01;

import javax.swing.JOptionPane;

public class atv8 {
    public static void main(String[] args) throws Exception {
        String x = JOptionPane.showInputDialog("Digite um número: ");
        int y = Integer.parseInt(x);
        if(y%2 == 0){
            JOptionPane.showMessageDialog(null, "Seu nome é par: " + y);
        }
        else{
            JOptionPane.showMessageDialog(null, "seu número é impar: " + y);
        }
    }
}
