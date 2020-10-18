package Data;

public class testData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		
		// String x = d.mostra2();
		
		int dt = d.diasTranscorridos();
		System.out.println("Quantidade de dias transcorridos: "+ dt);
		String datacorrente = d.apresentaDataAtual();
		
		System.out.println("Data Corrente: "+ datacorrente);
	}

}
