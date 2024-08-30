package Testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteDois extends Fibonacci{

  // Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    TesteDois teste = new TesteDois();

    System.out.println("Digite um número entre 1 e 46: ");
    // Após o 47 a cadeia de lógica é perdida pois o tipo Long aceita até 9,223,372,036,854,775,807
    // Por isso coloquei essa escala [1 - 46] para a repetição da sequência
    long numero = sc.nextLong();
    teste.calculo(numero);
    sc.close();
  }
}
class Fibonacci{

  protected long a;
  protected long b;
  protected long numero;

  public Fibonacci(){
  }

  public Fibonacci(int a, int b, int numero) {
    this.a = a;
    this.b = b;
    this.numero = numero;
  }

  public long getA() {
    return a;
  }
  public void setA(long a) {
    this.a = a;
  }
  public long getB() {
    return b;
  }
  public void setB(long b) {
    this.b = b;
  }
  public long getNumero() {
    return numero;
  }
  public void setNumero(long numero) {
    this.numero = numero;
  }

  public void calculo(long numero){
    boolean verdadeiro = false;
    a = 0; b = 1;
    this.numero = numero;
    List<Long> lista =  new ArrayList<>();

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