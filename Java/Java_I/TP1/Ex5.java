// Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado. 
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    double diametro, raio, volume;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a base da esfera: ");
    String valor = scanner.next();
    diametro = Double.parseDouble(valor);

    raio = diametro / 2;

    volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

    System.out.println();
    System.out.println("Volume da esfera: " + volume);
  }
}
