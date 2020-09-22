import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    String valor = "";

    double 
      somaPreco = 0, 
      pagamento, 
      rM,
      p,
      prods = 5;
    
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i <= prods; i++) {
      System.out.print("Informe o custo do " + i + "º produto: ");
      valor = scanner.next();
      p = Double.parseDouble(valor);
      
      somaPreco += p;
    }

    System.out.print("Informe valor pago: ");
    valor = scanner.next();
    pagamento = Double.parseDouble(valor);



    rM = pagamento - somaPreco;      

    System.out.println();
    System.out.println("Troco: " + rM);       
  }
}
