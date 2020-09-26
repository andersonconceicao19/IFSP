import java.util.Scanner;
public class Ex1 {

  public static void main(String[] args) {
    double n1, n2;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Primeiro valor: "); 
    String n = scanner.next();
    n1 = Double.parseDouble(n);    
    do
    {
      System.out.print("Um valor maior que o primeiro: ");
      n = scanner.next();
      n2 = Double.parseDouble(n);
    } while (n1 >= n2);
  
    System.out.print("Acertou!");
}
}
