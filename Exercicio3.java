package exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {
       int[] par = new int[10];
       int local = 0;
       
       for  (int num = 2; num <= 20; num++ ) {
            
           if (num%2 == 0) { 
               par[local] = num;
               local++;
           }
       }
            for (int i = 0; i < par.length; i++) {
            System.out.println(par[i]);   
    }
    }
}
