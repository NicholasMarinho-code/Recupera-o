package exxercicio13;

import javax.swing.JOptionPane;

public class Exxercicio13 {
    public static void main(String[] args) {
               JOptionPane.showMessageDialog(null, "Bem-Vindo!!");
        
        String letra = JOptionPane.showInputDialog("Digite uma letra do alfabeto em minúscula");
        
        switch (letra) {
            case ("a") :
                JOptionPane.showMessageDialog(null, "O número 1 corresponde ao domingo");
                break;
            case ("b") :
                JOptionPane.showMessageDialog(null, "O número 2 corresponde à segunda-feira");
                break;
            case ("3") :
                JOptionPane.showMessageDialog(null, "O número 3 corresponde à terça-feira");
                break;
            case ("4") :
                JOptionPane.showMessageDialog(null, "O número 4 corresponde à quarta-feira");
                break;
            case ("5") :
                JOptionPane.showMessageDialog(null, "O número 5 corresponde à quinta-feira");
                break;
            case ("6") :
                JOptionPane.showMessageDialog(null, "O número 6 corresponde à quinta-feira");
                break;
            case ("7") :
                JOptionPane.showMessageDialog(null, "O número 7 corresponde à sábado");
                break;
            default :
                JOptionPane.showMessageDialog(null, "Escolha um número correspondente");
                break;
    }
    }
}
