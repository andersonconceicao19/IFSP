import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    String valor = "";

    double vi, aceleracao, tempoPercurso, vF;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a velocidade inicial (m/s): ");
    valor = scanner.next();
    vi = Double.parseDouble(valor);

    System.out.print("Informe a aceleração (m/s²): ");
    valor = scanner.next();
    aceleracao = Double.parseDouble(valor);

    System.out.print("Informe o tempo de percurso (s): ");
    valor = scanner.next();
    tempoPercurso = Double.parseDouble(valor);

    vF = vi + (aceleracao * tempoPercurso);

    System.out.println();
    System.out.println("Velocidade final (m/s): " + vF);
  }
}
