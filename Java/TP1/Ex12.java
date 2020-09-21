import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    String valor = "";

    double altura, raio, volume;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a altura do cone: ");
    valor = scanner.next();
    altura = Double.parseDouble(valor);

    System.out.print("Informe o raio da base: ");
    valor = scanner.next();
    raio = Double.parseDouble(valor);

    volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;

    System.out.println();
    System.out.println("Volume do cone: " + volume);
  }
}
