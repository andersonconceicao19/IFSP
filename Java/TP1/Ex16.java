import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    String valor = "";

    double aD, aR;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o ângulo em graus: ");
    valor = scanner.next();
    aD = Double.parseDouble(valor);



    aR = aD * Math.PI / 180;

    System.out.println();
    System.out.println("Seno: " + Math.sin(aR));    
    System.out.println("Cosseno: " + Math.cos(aR));     
    System.out.println("Tangente: " + Math.tan(aR));     
    System.out.println("Secante: " + (1 / Math.cos(aR)));       
  }
}
