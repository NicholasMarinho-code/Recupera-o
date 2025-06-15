package exercicio17;

import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-Vindo!");
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
        String operacao = JOptionPane.showInputDialog("Digite uma operacao: (+,-,*,/");
        switch (operacao) {
            case ("+") :
                JOptionPane.showMessageDialog(null, "A soma dos dois números digitados será de: " + (num1 + num2));
            break;
            case ("-") :
                JOptionPane.showMessageDialog(null, "A subtração dos dois números será de: " + (num1 - num2));
            break;
            case ("*") :
                JOptionPane.showMessageDialog(null, "A multiplicação dos dois números será de: " + (num1 * num2));
            break;
            case ("/") :
                if(num2 != 0) {
                JOptionPane.showMessageDialog(null, "A divisão dos dois números será de: " + (num1 / num2));
                }
                else {
                JOptionPane.showMessageDialog(null, "É impossivel dividir por 0");    
                }
            break;
            default: 
                JOptionPane.showMessageDialog(null, "Digite uma operação correspondente");
            break;
            
        
        
        
        }
        
        
        
    }
    
}
