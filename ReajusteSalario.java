import java.util.Scanner; // importando a Classe Scanner

//Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.

class ReajusteSalario {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = meuScanner.nextDouble();

        System.out.println("Digite o percentual de aumento:");
        double percentual = meuScanner.nextDouble();

        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;

        System.out.println("O valor do aumento é: " + aumento);
        System.out.println("O novo salário é: " + novoSalario);
    }
}