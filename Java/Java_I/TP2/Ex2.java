import java.util.Scanner;
public class Ex2 {

  public static void main(String[] args) {

    double[] valores = new double[10];
    Scanner scanner = new Scanner(System.in);
    double maior = 0;
    double soma = 0;
    
 
    
    for(int i = 0; i< 10; i++)
    {      
      do
      {
      System.out.println("Digite um valor positivo valor positivo: ");
      String valor = scanner.next();
      valores[i] = Double.parseDouble(valor); 
      }
      while(valores[i] < 0);
        
      if(valores[i] > maior)
      {
        maior = valores[i];
      } 
      soma += valores[i];     
    }
    double media = (soma / 3);

    System.out.println("maior valor: " + maior );
    System.out.println("soma dos valores: " + soma );
    System.out.println("media dos valores: " + media );

  }
}
