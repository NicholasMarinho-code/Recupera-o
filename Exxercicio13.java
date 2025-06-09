package exxercicio13;

import javax.swing.JOptionPane;

public class Exxercicio13 {
    public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Bem-Vindo!!");
        
        String letra = JOptionPane.showInputDialog("Digite uma letra do alfabeto em minúscula");
        
        switch (letra.toLowerCase()) {
            case ("a") :
                JOptionPane.showMessageDialog(null, "A letra: " + letra + " é uma vogal");
                break;
            case ("e") :
                JOptionPane.showMessageDialog(null, "A letra: " + letra + " é uma vogal");
                break;
            case ("i") :
                JOptionPane.showMessageDialog(null, "A letra: " + letra + " é uma vogal");
                break;
            case ("o") :
                JOptionPane.showMessageDialog(null, "A letra: " + letra + " é uma vogal");
                break;
            case ("u") :
                JOptionPane.showMessageDialog(null, "A letra: " + letra + " é uma vogal");
                break;
            default :
                JOptionPane.showMessageDialog(null, "A letra: " + letra + " é uma consoante");
                break;
    }
    }
}
