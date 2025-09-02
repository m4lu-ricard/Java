import java.util.Scanner; 

//Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

class MediaPonderada {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double n1 = meuScanner.nextDouble();
        System.out.println("Digite o peso da primeira nota:");
        double p1 = meuScanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double n2 = meuScanner.nextDouble();
        System.out.println("Digite o peso da segunda nota:");
        double p2 = meuScanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double n3 = meuScanner.nextDouble();
        System.out.println("Digite o peso da terceira nota:");
        double p3 = meuScanner.nextDouble();

        double mediaPonderada = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}