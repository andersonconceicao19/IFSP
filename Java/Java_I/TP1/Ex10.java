import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    String valor = "";

    double celsius, fahrenheit;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a temperature em graus celsius: ");
    valor = scanner.next();
    celsius = Double.parseDouble(valor);

    fahrenheit = 32 + ( celsius * 9/5 );

    System.out.println();
    System.out.println("Gruas em fahrenheit: " + fahrenheit);
  }
}
