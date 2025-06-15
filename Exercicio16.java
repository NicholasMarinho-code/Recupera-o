package exercicio16;

import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem-Vindo!");
       String produto = JOptionPane.showInputDialog ("Digite um dos produtos da lista: \n" + "Pão de forma \n" + "Maçã \n" + "Cartela de ovos \n" + "Suco \n" + "Refrigerante \n" + "Energético \n" + "Desinfetante \n" + "Detergente \n" + "Sabão em pó \n" + "Sabonete \n " + "Pasta de dente \n" + "Papel higiênico \n"); 
       
       switch (produto.toLowerCase()) {
           case ("pão de forma") :
               JOptionPane.showMessageDialog(null, "Categoria: Alimento");
           break;
           case ("maçã") :
               JOptionPane.showMessageDialog(null, "Categoria: Alimento");
           break;
           case ("cartela de ovos") :
               JOptionPane.showMessageDialog(null, "Categoria: Alimento");
           break;
           case ("suco") :
               JOptionPane.showMessageDialog(null, "Categoria: Bebida");
           break;
           case ("refrigerante") :
               JOptionPane.showMessageDialog(null, "Categoria: Bebida");
           break;
           case ("energético") :
               JOptionPane.showMessageDialog(null, "Categoria: Bebida");
           break;
           case ("desinfetante") :
               JOptionPane.showMessageDialog(null, "Categoria: Produto de Limpeza");
           break;
           case ("detergente") :
               JOptionPane.showMessageDialog(null, "Categoria: Produto de Limpeza");
           break;
           case ("sabão em pó") :
               JOptionPane.showMessageDialog(null, "Categoria: Produto de Limpeza");
           break;
           case ("sabonete") :
               JOptionPane.showMessageDialog(null, "Categoria: Higiêne Pessoal");
           break;
           case ("pasta de dente") :
               JOptionPane.showMessageDialog(null, "Categoria: Higiêne Pessoal");
           break;
           case ("papel higiênico") :
               JOptionPane.showMessageDialog(null, "Categoria: Higiêne Pessoal");
           break;
           default :
               JOptionPane.showMessageDialog(null, "Categoria inválida");
            break;
       }
    }
    
}
