import java.util.Scanner; 

// Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

class SomaNumeros {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in); 
        System.out.println("Digite o primeiro número:");
        int n1 = meuScanner.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = meuScanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int n3 = meuScanner.nextInt();

        System.out.println("Digite o quarto número:");
        int n4 = meuScanner.nextInt();

        int soma = n1 + n2 + n3 + n4;
        System.out.println("A soma dos números é: " + soma);
    }
}
