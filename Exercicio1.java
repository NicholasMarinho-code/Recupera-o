package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       int[] numeros = new int[5];
         Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 5 números:");
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
            
            System.out.println("Os números digitados foram:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        } 
        
    }


