public class Main {
   
    public static void main(String[] args) {
        //pessoa
        Pessoa p1 = new Pessoa("Mario",32,"321.684.908-00");
        p1.mostrarDados();
        
        //funcionario String nome, int idade, String cpf, String dataAdmissao, String cargo, double salario
        Funcionario f1 = new Funcionario("Maria",26,"222.444.555-00","11/09/2011","Analista",4500.0);
        f1.mostrarDados();
        f1.calcularSalarioAnual();
        f1.receberAumento(10);
        
        //gerente
        Gerente g1 = new Gerente("Letícia", 19, "123.456.789-00", "12/02/2025", "Programadora", 1500.0, 5, 100.0);
        g1.mostrarDados();
        g1.calcularSalarioComBonus();
        g1.gerenciarEquipe();
        
        //POLIMORFISMO
//        Pessoa [] pessoas = {p1,f1,g1};
//        
//        for (int i =0;i < pessoas.lenght; i++){
//            System.out.println("Pessoa "+(i+1)+":");
//            pessoas[i].mostrarDados();
//            System.out.println();
//        }
    }
}


