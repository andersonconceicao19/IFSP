import java.util.Scanner;
public class Ex4 {
  public static void main(String[] args)
  {  
    Scanner scanner = new Scanner(System.in);
    String valor = "";
    double[][] matriz = new double[2][3];

    for(int i=0; i< 2; i++)
    {
        System.out.println("Lote " + (i+1) + ": ");
        for(int j=0; j < 3; j++)
        {
            System.out.println("valor " + (j +1) + ": ");
            valor = scanner.next();
            matriz[i][j] = Double.parseDouble(valor);
        }
    }

    for(int i=0; i< 2; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            System.out.println(">>>>>>> "+matriz[i][j]);
        }
    }
  }
}