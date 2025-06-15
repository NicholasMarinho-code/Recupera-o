/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio26;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        
                System.out.println("Digite um número: ");
                int numero = scanner.nextInt();

       for(int i = 1; i <=10; i++) {
       
       int tabuada = numero * i;
       
       System.out.println(numero + "x" + i + "=" + tabuada); 
       }
        
        
        scanner.close();
    }
    
}
