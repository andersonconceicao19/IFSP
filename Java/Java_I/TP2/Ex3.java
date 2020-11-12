import java.util.Scanner;
public class Ex3 {
  public static void main(String[] args) {   
    String valor;
    Scanner scanner = new Scanner(System.in);
    double positivos, negativos, maior, menor, soma;

    int sl =0;
    do{
        int n;
        positivos = 0;
        negativos = 0;    
        maior = 0;
         menor = 0;
        soma = 0;

        do{
            System.out.println("Digite quantos serao digitados: Tem de ser menor que 20");
            valor = scanner.next();    
            n = Integer.parseInt(valor);
        }
        while(n > 20 || n < 0);
    
        
        double[] qt = new double[n];
    
        System.out.println("Digite os valores: ");
    
        for(int i = 0;i < qt.length; i++)
        {
            valor = scanner.next();
            qt[i] = Double.parseDouble(valor);
            soma += qt[i];
            
    
        }
            for(int i = 0; i < qt.length; i++)
            {
                // qt de positivo e negativo
                if(qt[i] >= 0)
                {
                    positivos++;
                }
                else{
                    negativos++;
                }
                // Maior e menor valor
                if(qt[i] > maior)
                {
                    maior = qt[i];
                }
                if(qt[i] < menor)
                {
                    menor = qt[i];
                }
            }
        
        
        double media = (soma / qt.length);
        double negPor = (negativos / qt.length)*100;
        double posPor = (positivos / qt.length)*100;
    
        System.out.println("maior valor: " + maior );
        System.out.println("menor dos valores: " + menor );
        System.out.println("soma dos valores: " + soma );
        System.out.println("media dos valores: " + media );
        System.out.println("Qt negativo dos valores: " + negPor + "%");
        System.out.println("Qt Positivo dos valores: " + posPor+ "%");
        System.out.println();
        
      
        System.out.println("Deseja encerrar ? N ou S ");
        valor = scanner.next(); 
        
           
    }
    while(valor == "n");

    
  }
}