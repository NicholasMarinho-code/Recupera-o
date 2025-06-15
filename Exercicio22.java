package exercicio22;

import javax.swing.JOptionPane;

public class Exercicio22 {

    public static void main(String[] args) {
       int soma = 0;   
       int somatotal = 0;
        JOptionPane.showMessageDialog(null, "Bem-vindo!");
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for ( int i = 0; i<=3; i++) {
        int numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        soma = soma + numeros;
        }
        somatotal = soma + numero1;
        JOptionPane.showMessageDialog(null, "A soma de seus números é de: " + somatotal);
    }
    
}
