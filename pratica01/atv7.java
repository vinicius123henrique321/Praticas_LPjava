package pratica01;

import javax.swing.JOptionPane;

public class atv7 {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Digite seun nome: ");
        if(nome != ""){
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        }
        else{
            JOptionPane.showMessageDialog(null, "retorne e digite seu nome");
        }
    }
}

