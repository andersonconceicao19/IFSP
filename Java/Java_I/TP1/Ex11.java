import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    String valor = "";

    double diametro, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o diâmetro da circunferência: ");
    valor = scanner.next();
    diametro = Double.parseDouble(valor);

    Double raio = diametro / 2;

    area = Math.PI * Math.pow(raio, 2);

    System.out.println();
    System.out.println("Area da circunferência: " + area);
  }
}
