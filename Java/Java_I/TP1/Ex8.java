import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    double mm = 1852;
    double km = 1000;
    
    String valor = "";
    double milhas, distm, distkm;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a distância em milhas: ");
    valor = scanner.next();

    milhas = Double.parseDouble(valor);

    distm = milhas * mm;

    distkm = distm / km;

    System.out.println();
    System.out.println("Distância em quilômetros: " + distkm);
  }
}
