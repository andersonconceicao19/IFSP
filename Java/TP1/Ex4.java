// A partir dos valores da base e altura de um triângulo, 
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    double base, altura, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Base do triangulo: ");
    String valor = scanner.next();
    base = Double.parseDouble(valor);

    System.out.print("Altura do triangulo: ");
    valor = scanner.next();
    altura = Double.parseDouble(valor);

    area = (base * altura) / 2;

    System.out.println();
    System.out.println("Area do triangulo: " + area);
  }
}
