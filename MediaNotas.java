import java.util.Scanner; 

// Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

class MediaNotas {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double n1 = meuScanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double n2 = meuScanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double n3 = meuScanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("A média aritmética é: " + media);
        
    }
}
