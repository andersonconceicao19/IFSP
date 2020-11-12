// Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    String valor = "";
    double media, convertido, soma = 0;
    
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i < 5; i++) 
    {

      System.out.print("Informe o " + i +"º valor: ");
      valor = scanner.next();
      
      convertido = Double.parseDouble(valor);

      soma += convertido;
    }

    media = soma / 4;

    System.out.println();
    System.out.println("Média aritmética: " + media);
  }
}
