import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    
    
    double base, altura, area;    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Base do retangulo: ");
    String valor = scanner.next();
    base = Double.parseDouble(valor);

    System.out.print("Altura do retangulo: ");
    valor = scanner.next();
    altura = Double.parseDouble(valor);

    area = base * altura;

    System.out.println();
    System.out.println("Area do triangulo: " + area);
  }
}
