package exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números:");
      int[] v1 = new int[5];
              
      for(int i = 0; i < v1.length ;i++) {
            v1[i] = scanner.nextInt();
      }
              System.out.println("Digite 5 números:");
      
      int[] v2 = new int[5];
        for(int i = 0; i < v2.length ;i++) {
          v2[i] = scanner.nextInt(); }          
        System.out.println("A soma e igual a: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(v1[i] + v2[i]); 
            
        }
    }
    
}
