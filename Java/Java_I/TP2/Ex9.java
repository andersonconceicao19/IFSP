import java.util.Scanner;
public class Ex9 {

  public static void main(String[] args)
  {  
    Scanner scanner = new Scanner(System.in);
    String valor = "";
    int l, c;

    do{
    System.out.println("Qt de linhas: ");
    valor = scanner.next();
    l = Integer.parseInt(valor);
    }while(l >10 || l < 0);

    do{
    System.out.println("Qt de colunas: ");
    valor = scanner.next();
    c = Integer.parseInt(valor);
    }while(c >10 || c < 0);

    double[][] matriz = new double[l][c];
    double[][] transposta = new double[c][l];

    for(int i=0; i< l; i++)
    {        
        for(int j = 0; j < c; j++)
        {
            System.out.print("coluna " + (j + 1) + ": " );
            valor = scanner.next();
            matriz[i][j] = Double.parseDouble(valor);
        }
    }

    for(int i=0; i< c; i++)
    {        
        for(int j = 0; j < l; j++)
        {
            transposta[i][j] = matriz[j][i];
        }
    }   
    
    for(int i=0; i< c; i++)
    {
        for(int j = 0; j < l; j++)
        {
            System.out.print(transposta[i][j] + " | ");
        }
        System.out.println("");
    }


  }
}