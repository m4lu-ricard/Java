/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciopoo;

/**
 *
 * @author leticia
 */
public class Funcionario extends Pessoa{
    protected String cargo;
    protected String dataAdmissao;
    protected Double salario;
    

    public Funcionario(String nome, int idade, String cpf, String dataAdmissao, String cargo, double salario) {
    super(nome, idade, cpf); 
    this.dataAdmissao = dataAdmissao;
    this.cargo = cargo;
    this.salario = salario;
}

    
     @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println( "|| Cargo: " + cargo + " + || Data de admissão: "+ dataAdmissao +
                 " || Salário: "+ salario);
    }
    
    
    public String getCargo(){
      return cargo;
  }
  
  public void setCargo(String cargo){
      this.cargo = cargo;
  }
  
  public String getDataAdmissao(){
      return dataAdmissao;
  }
  
  public void setDataAdmissao(String dataAdmissao){
      this.dataAdmissao = dataAdmissao;
  }
  
  public double getSalario() {
        return salario;
    }

  public void setSalario(double salario) {
        this.salario = salario;
    }
 
  
    public void calcularSalarioAnual(){
        double salarioAnual = salario * 12;
       System.out.println("Salario Anual: " + salarioAnual);
}
    
    public void receberAumento(double percentual) {
    this.salario += this.salario * (percentual / 100);
    System.out.println("Novo salário após aumento de " + percentual + "%: " + this.salario);
}


}// fim class funcionario

