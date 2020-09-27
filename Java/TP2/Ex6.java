import java.util.Scanner;
public class Ex6 {
  public static void main(String[] args)
  {  
    Scanner scanner = new Scanner(System.in);
    String valor = "";
    String[][] matriz = new String[2][3];

    for(int i=0; i< 2; i++)
    {
      System.out.println("Nomes: ");
        for(int j=0; j < 3; j++)
        {
           
            valor = scanner.next();
            matriz[i][j] = valor;
        }
    }

    for(int i=0; i< 2; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            System.out.println(">>>>> "+ matriz[i][j]);
        }
    }
  }
}