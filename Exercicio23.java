package exercicio23;
public class Exercicio23 {
    public static void main(String[] args) {
       int soma = 0;
       for (int i = 1; i<=50; i++ ) {
           if( i%2 == 0) { soma = soma + i;
       } 
       }
       JOptionPane.showMessageDialog(null, "A soma de todos os números pares é de: " + soma);
    }
}

