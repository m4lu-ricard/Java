import java.util.Scanner; // importando a Classe Scanner

//Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
//sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre este salário.

class SalarioFinal {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o salário base do funcionário:");
        double salarioBase = meuScanner.nextDouble();

        double gratificacao = salarioBase * 0.05; // 5% de gratificação
        double imposto = salarioBase * 0.07;      // 7% de imposto

        double salarioReceber = salarioBase + gratificacao - imposto;

        System.out.println("A gratificação é: " + gratificacao);
        System.out.println("O imposto é: " + imposto);
        System.out.println("O salário a receber é: " + salarioReceber);
    }
}