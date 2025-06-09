package exercicio14;

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bem-Vindo!" );
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1-12"));
        
        switch (mes) {
            case 1 :
                JOptionPane.showMessageDialog(null, "O mês 1 corresponde à Janeiro");
            break;
            case 2 :
                JOptionPane.showMessageDialog(null, "O mês 2 corresponde à Fevereiro");
            break;
            case 3 :
                JOptionPane.showMessageDialog(null, "O mês 3 corresponde à Março");
            break;
            case 4 :
                JOptionPane.showMessageDialog(null, "O mês 4 corresponde à Abril");
            break;
            case 5 :
                JOptionPane.showMessageDialog(null, "O mês 5 corresponde à Maio");
            break;
            case 6 :
                JOptionPane.showMessageDialog(null, "O mês 6 corresponde à Junho");
            break;
            case 7 :
                JOptionPane.showMessageDialog(null, "O mês 7 corresponde à Julho");
            break;
            case 8 :
                JOptionPane.showMessageDialog(null, "O mês 8 corresponde à Agosto");
            break;
            case 9 :
                JOptionPane.showMessageDialog(null, "O mês 9 corresponde à Setembro");
            break;
            case 10 :
                JOptionPane.showMessageDialog(null, "O mês 10 corresponde à Outubro");
            break;
            case 11 :
                JOptionPane.showMessageDialog(null, "O mês 11 corresponde à Novembro");
            break;
            case 12 :
                JOptionPane.showMessageDialog(null, "O mês 12 corresponde à Dezembro");
            break;
            default :
                JOptionPane.showMessageDialog(null, "Digite um mês válido");
            
            
            
            
        }
    } 
}
