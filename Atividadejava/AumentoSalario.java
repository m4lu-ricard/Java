import java.util.Scanner; 

//Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

class AumentoSalario {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = meuScanner.nextDouble();

        double novoSalario = salario + (salario * 0.25);

        System.out.println("O novo salário com aumento de 25% é: " + novoSalario);
    }
}