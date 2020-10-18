package Horas;


public class progtest {

	public static void main(String[] args)
	{
	 	/* Passando parametros pelo construtor */
		 horas h = new horas(2, 00, 01);
		 
		 /* * Para entrar com valores próprios, basta descomentar este código & Comentar a instancia acima.
		  
		  
		  // Sem passar parametro pelo construtor
		  horas h = new horas();
		 
		// Setando valores apartir da digitação do usuario.
		 		 
		h.setHor();	
		h.setMin();	
		h.setSeg();
		*/
		 
		
		 // pegando valores das propriedades setados anteriormente.
		int hor = h.getHor();
		int seg = h.getSeg();
		int min = h.getMin();		 
		
		// Pegando hora em formatos diferentes;
		String x1 = h.getHora1();	
		String x2 = h.getHora2();		
		System.out.println(x1);
		System.out.println(x2);
		
		// Retornando os segundos
		int ss = h.getSegundos();
		System.out.println(ss);
		
		
	}
}
