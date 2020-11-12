//Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado. 
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    double diagonal, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a diagonal do quadrado: ");
    String valor = scanner.next();
    diagonal = Double.parseDouble(valor);

    area = Math.pow(diagonal, 2) / 2;

    System.out.println();
    System.out.println("Area do quadrado: " + area);
  }
}
