package Testes;

import java.util.Scanner;

public class TesteCinco {

  // Escreva um programa que inverta os caracteres de um string.
  // IMPORTANTE:
  // a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
  // b) Evite usar funções prontas, como, por exemplo, reverse;

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a palavra: ");
    String palavra = sc.next();

    char[] letras = palavra.toCharArray();
    char[] letrasInvertidas = new char[letras.length];

    for (int i = 0, j = letras.length - 1; i < letras.length; i++, j--) {
      letrasInvertidas[i] = letras[j];
    }

    String stringInvertida = new String(letrasInvertidas);
    System.out.println("String Invertida: " + stringInvertida);


    sc.close();

 
  }
}
