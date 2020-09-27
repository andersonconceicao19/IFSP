import java.util.Scanner;
public class Ex8 {
  public static void main(String[] args)
  {  
    Scanner scanner = new Scanner(System.in);
    String valor = "";
    double[][] matriz = new double[3][4];
    double[][] matriz2 = new double[3][4];

    System.out.println("Digite os valores ");
    for(int i=0; i< 3; i++)
    {
        for(int j=0; j < 4; j++)
        {
            valor = scanner.next();
            matriz[i][j] = Double.parseDouble(valor);
        }
    }
    System.out.println("Deseja multiplicar esta matriz por quantos? ");
    valor = scanner.next();
    double x = Double.parseDouble(valor);

    for(int i=0; i< 3; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            matriz2[i][j] = matriz[i][j] * x;
        }
    }

    for(int i=0; i< 3; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            System.out.print(matriz2[i][j] + " | ");
        }
        System.out.println("");
    }
  }
}