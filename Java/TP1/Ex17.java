import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    String valor = "";

    double x, y;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor de X: ");
    valor = scanner.next();
    x = Double.parseDouble(valor);

    System.out.print("Informe o valor de Y: ");
    valor = scanner.next();
    y = Double.parseDouble(valor);

    System.out.println();
    System.out.println("X^Y: " + Math.pow(x, y));       
  }
}
