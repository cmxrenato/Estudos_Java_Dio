package geral;

import java.util.Random;
//Classe
public class Pessoa {    
//Atributos
private String nome;
private double codigo_identificador;
private Random aleatorio;   
//Métodos
public Pessoa (String nome){
     aleatorio = new Random();
     this.setNome(nome);
     this.codigo_identificador = aleatorio.nextDouble();
}
private void setNome (String nome) { 
     this.nome = nome; //só pode ser executado dentro da própria classe.
}  
public String getNome () {
     return this.nome;
}
public double getCodigoIdentificador (){
     return this.codigo_identificador;
}   
public static void main(String args[]){
    Pessoa p1 = new Pessoa("Teste A");
    p1.setNome("Renato");//só pode ser executado dentro da própria classe.
    System.out.println("Cód: "+p1.getCodigoIdentificador());
    System.out.println("Pessoa 1: "+p1.getNome());
}
}
