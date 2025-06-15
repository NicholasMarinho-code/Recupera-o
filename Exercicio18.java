package exercicio18;

import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Bem-vindo!");
       
       double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
       String conversao = JOptionPane.showInputDialog("Qual tipo de conversão \n" + "Use de exemplo: (km p/ m)"); 
       switch (conversao) {
           case ("km p/ hm") : 
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10) + "hm");
           break;
           case ("km p/ dam") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 100) + "dam");
           break;
           case ("km p/ m") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 1000) + "m");
           break;
           case ("km p/ dm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10000) + "dm");
           break;
           case ("km p/ cm") :
               JOptionPane.showMessageDialog(null, "A conversãoo ficou: " + (num * 100000) + "cm");
           break;
           case ("km p/ mm") :
               JOptionPane.showMessageDialog(null, "A conversãoo ficou: " + (num * 1000000) + "mm");
           break;
           case ("hm p/ km") : 
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10) + "km");
           break;
           case ("hm p/ dam") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10) + "dam");
           break;
           case ("hm p/ m") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 100) + "m");
           break;
           case ("hm p/ dm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 1000) + "dm");
           break;
           case ("hm p/ cm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10000) + "cm");
           break;
           case ("hm p/ mm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 100000) + "mm");
           break;
           case ("dam p/ km") : 
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100) + "km");
           break;
           case ("dam p/ hm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10) + "hm");
           break;
           case ("dam p/ m") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10) + "m");
           break;
           case ("dam p/ dm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 100) + "dm");
           break;
           case ("dam p/ cm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 1000) + "cm");
           break;
           case ("dam p/ mm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10000) + "mm");
           break;
           case ("m p/ km") : 
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 1000) + "km");
           break;
           case ("m p/ hm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100) + "hm");
           break;
           case ("m p/ dam") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10) + "dam");
           break;
           case ("m p/ dm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10) + "dm");
           break;
           case ("m p/ cm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 100) + "cm");
           break;
           case ("m p/ mm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 1000) + "mm");
           break;
           case ("dm p/ km") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10000) + "km");
           break;
           case ("dm p/ hm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 1000) + "hm");
           break;
           case ("dm p/ dam") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100) + "dam");
           break;
           case ("dm p/ m") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10) + "m");
           break;
           case ("dm p/ cm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10) + "cm");
           break;
           case ("dm p/ mm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 100) + "mm");
           break;
           case ("cm p/ km") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100000) + "km");
           break;
           case ("cm p/ hm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10000) + "hm");
           break;
           case ("cm p/ dam") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 1000) + "dam");
           break;
           case ("cm p/ m") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100) + "m");
           break;
           case ("cm p/ dm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10) + "dm");
           break;
           case ("cm p/ mm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num * 10) + "mm");
           break;
           case ("mm p/ km") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 1000000) + "km");
           break;
           case ("mm p/ hm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100000) + "hm");
           break;
           case ("mm p/ dam") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10000) + "dam");
           break;
           case ("mm p/ m") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 1000) + "m");
           break;
           case ("mm p/ dm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 100) + "dm");
           break;
           case ("mm p/ cm") :
               JOptionPane.showMessageDialog(null, "A conversão ficou: " + (num / 10) + "cm");
           break;
           default :
               JOptionPane.showMessageDialog(null, "Nenhum tipo de conversão encontrada");
           break;
       }
       
    }
    
}
