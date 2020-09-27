import java.util.Scanner;
public class Ex5 {
  public static void main(String[] args)
  {  
    Scanner scanner = new Scanner(System.in);
    String valor = "";
    double[][] matriz = new double[3][2];

    for(int i=0; i< 3; i++)
    {
      System.out.println("Lote " + (i + 1) + ": ");
        for(int j=0; j < 2; j++)
        {
            System.out.println("valores " + (j +1) + ": ");
            valor = scanner.next();
            matriz[i][j] = Double.parseDouble(valor);
        }
    }

    for(int i=0; i< 3; i++)
    {
        for(int j = 0; j < 2; j++)
        {
            System.out.println(">>>>> "+matriz[i][j]);
        }
    }
  }
}