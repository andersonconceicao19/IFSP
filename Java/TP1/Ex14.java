import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    String valor = "";

    double eR, cE, cV, eV, livre;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o raio da esfera: ");
    valor = scanner.next();
    eR = Double.parseDouble(valor);

    System.out.print("Informe a aresta do cubo: ");
    valor = scanner.next();
    cE = Double.parseDouble(valor);

    cV = Math.pow(cE, 3);
    eV = (4 * Math.PI * Math.pow(eR, 3)) / 3;

    livre = cV - eV;

    System.out.println();
    System.out.println("Volume livre: " + livre);
  }
}
