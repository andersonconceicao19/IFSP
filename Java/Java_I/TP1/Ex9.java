import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    String valor = "";

    double resistencia, correnteE, voltage;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a resistência: ");
    valor = scanner.next();
    resistencia = Double.parseDouble(valor);

    System.out.print("Informe a corrente elétrica: ");
    valor = scanner.next();
    correnteE = Double.parseDouble(valor);

    voltage = resistencia * correnteE;

    System.out.println();
    System.out.println("Potencial elétrico: " + voltage);
  }
}
