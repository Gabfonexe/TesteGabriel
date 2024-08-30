package Testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteDois extends Fibonacci{

  // Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    TesteDois teste = new TesteDois();

    System.out.println("Digite o número: ");
    int numero = sc.nextInt();
    teste.calculo(numero);
    sc.close();
  }
}
class Fibonacci{

  protected int a;
  protected int b;
  protected int numero;

  public Fibonacci(){
  }

  public Fibonacci(int a, int b, int numero) {
    this.a = a;
    this.b = b;
    this.numero = numero;
  }

  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void calculo(int numero){
    boolean verdadeiro = false;
    a = 0; b = 1;
    this.numero = numero;
    List<Integer> lista =  new ArrayList<>();

    for(int i=0; i<numero; i++){
      if(numero >= 0){
        lista.add(a);
        lista.add(b);
        a = b + a;
        b = a + b;
        if(lista.contains(numero)){
          verdadeiro = true;
        }
      }
    }
    
    System.out.println(lista);
    if(verdadeiro == true){
      System.out.println("O Número: " + numero + " Pertentece a sequência");
    }

  }
  

}