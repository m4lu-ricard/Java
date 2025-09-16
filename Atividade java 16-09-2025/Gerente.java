public class Gerente extends Funcionario {
    protected int equipe;
    protected double bonus;
    

   public Gerente(String nome, int idade, String cpf, String dataAdmissao, String cargo, double salario, int equipe, double bonus) {
        super(nome, idade, cpf, dataAdmissao, cargo, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }
   
    public void calcularSalarioComBonus() {
        double total = salario + bonus;
        System.out.println("Salário com bônus: " + total);
    }

    public void gerenciarEquipe() {
        System.out.println("Gerente gerencia " + equipe + "equipes.");
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        System.out.println("Equipe: " + equipe + " || Bônus: " + bonus);
    }
    
     public int getEquipe(){
      return equipe;
  }
  
  public void setEquipe(int Equipe){
      this.equipe = equipe;
  }
  
  public double getBonus(){
      return bonus;
  }
  
  public void setBonus(double Bonus){
      this.bonus = bonus;
  }
    
    
}
