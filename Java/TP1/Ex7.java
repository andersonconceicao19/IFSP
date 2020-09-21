
import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    String valor = "";
    double 
      media, 
      cv,
      prod = 1,
      c = 2;
   
    
    double[] values = new double[(int)c];
    
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i <= c; i++) {

      System.out.print("Informe o " + i +"º valor: ");
      valor = scanner.next();
      
      cv = Double.parseDouble(valor);

      prod *= cv;
    }

    media = Math.pow(prod, (1 / c));

    System.out.println();
    System.out.println("Média geométrica: " + media);
  }
}
