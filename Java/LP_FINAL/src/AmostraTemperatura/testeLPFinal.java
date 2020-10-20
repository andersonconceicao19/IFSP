package AmostraTemperatura;

public class testeLPFinal {

	public static void main(String[] args) {
		
		AmostraTemperatura t1 = new AmostraTemperatura(19, 7, 1994, 2, 23, 45, 2);
		
		System.out.println("Propriedade temperatura t1: "+ t1.getValor());
		System.out.println("Propriedade data t1: "+ t1.getData());
		System.out.println("Propriedade hora t1: "+ t1.getHora());
	
		System.out.println();
		System.out.println();
	
		AmostraTemperatura t2 = new AmostraTemperatura();
		System.out.println("Propriedade temperatura t2: "+ t2.getValor());
		System.out.println("Propriedade data t2 : "+ t2.getData());
		System.out.println("Propriedade hora t2 : "+ t2.getHora());
		
		
		System.out.println();
		System.out.println();
		System.out.println("Os novos dados");
		t1.setValor();
		t1.setData();
		t1.setHora();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Propriedade temperatura 1 modificada: "+ t1.getValor());
		System.out.println("Propriedade data 1 modificada: "+ t1.getData());
		System.out.println("Propriedade hora 1 modificada: "+ t1.getHora());
		
		System.out.println("Propriedade valor: "+ t1.getNumSeq());
		
		
	
		
	}

}
