import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    String valor = "";

    double qtDolar, qtD, qtBRL;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a cotação do dólar: ");
    valor = scanner.next();
    qtDolar = Double.parseDouble(valor);

    System.out.print("Informe quantia em dólares a converter: ");
    valor = scanner.next();
    qtD = Double.parseDouble(valor);

    qtBRL = qtD / qtDolar;

    System.out.println();
    System.out.println("Quantia em reais: " + qtBRL);
  }
}
