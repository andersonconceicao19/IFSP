// Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado. 
import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    
    double aresta, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Aresta do quadrado: ");
    String valor = scanner.next();
    aresta = Double.parseDouble(valor);

    area = Math.pow(aresta, 2);

    System.out.println();
    System.out.println("Area do quadrado: " + area);
  }
}
