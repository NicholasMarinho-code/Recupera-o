package exercicio15;

import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao caixa eletrônico virtual!");
    
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Porfavor insira o seu saldo: "));
        String opcao = JOptionPane.showInputDialog("Digite uma opção entre: saque, depósito ou saldo:");
        
        switch (opcao.toLowerCase()) {
            case "saque":
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar:"));
                if (saldo == 0 || saque > saldo) {
                    JOptionPane.showMessageDialog(null, "Você não pode sacar esse valor.");
                } else {
                    JOptionPane.showMessageDialog(null, "Você sacou: " + saque);
                    JOptionPane.showMessageDialog(null, "Seu saldo agora é de: " + (saldo - saque));
                }
                break;

            case "depósito":
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar:"));
                JOptionPane.showMessageDialog(null, "Você depositou: " + deposito);
                 JOptionPane.showMessageDialog(null, "Seu saldo agora é de: " + (deposito + saldo));
                break;

            case "saldo":
                JOptionPane.showMessageDialog(null, "Seu saldo é de: " + saldo);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
        
    }
    
}
