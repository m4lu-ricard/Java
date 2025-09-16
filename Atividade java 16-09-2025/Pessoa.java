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
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;


public Pessoa (String t_nome,int t_idade, String t_cpf){ 
     this.nome = t_nome;
     this.idade = t_idade;
     this.cpf = t_cpf;
    }

public void mostrarDados(){
        System.out.println("Nome:" + this.nome + "|| Idade:" + this.idade + "|| CPF:"+ this.cpf );
    }
    
  public String getNome(){
      return nome;
  }
  
  public void setNome(String nome){
      this.nome = nome;
  }
  
  public int getIdade() {
        return idade;
    }

  public void setIdade(int idade) {
        this.idade = idade;
    }
  
  public String getCpf(){
      return cpf;
  }
  
  public void setIdade(String cpf){
      this.cpf = cpf;
  }
  
  
  
}//fim class
