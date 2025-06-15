package exercicio31;

import javax.swing.JOptionPane;

public class Exercicio31 {
    public static void main(String[] args) {
       String senha = "";
        
        while (!senha.equals("1234")) {
             senha = (JOptionPane.showInputDialog("Digite a senha: "));
           
        
        }
    }
    
}
