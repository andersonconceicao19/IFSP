package Horas;

public class horas {

	private int horas;
	private int minutos;
	private int segundos;
	
	public horas() {
		horas= 0;
		minutos = 0;
		segundos = 0;
	}
	public horas(int h, int m, int s)
	{
	horas = h;
	minutos = m;
	segundos = s;
	
	try {
		validate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void printar()
	{
		System.out.println(" hora: "+ horas +" min: "+ minutos +" seg: " + segundos);
	}
	
	// Método para validar se está dentro dos padrões de hora, min. e seg.
	private void validate() throws Exception 
	{
		if(horas < 0 || horas > 23) 
		{
			 throw new Exception("Invalid value for hours");
		}
		if(minutos < 0 || minutos > 60) 
		{
			 throw new Exception("Pô, meu chapa. Minutos é até 60. Ajuda ae");
		}
		if(segundos < 0 || segundos > 23000) 
		{
			 throw new Exception("Segundos invalidos");
		}
			
	}
	
	
}
