package exercicio11;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem-Vindo!!");
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog ("Digite entre as opções de temperatura: 34, 36 ou 38"));
        
        switch (numero) {
            case 34 :
                JOptionPane.showMessageDialog(null, "Sua temperatura está baixa");
                break;
            case 36 :
                JOptionPane.showMessageDialog(null, "Sua temperatura está normal");
                break;
            case 38 :
                JOptionPane.showMessageDialog(null, "Sua temperatura está alta ( febre )");
                break;
            default :
                JOptionPane.showMessageDialog(null, "Escolha um clima correspondente");
        }
    }
    
}
