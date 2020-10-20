package AmostraTemperatura;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Data {
	
	
	private int dia;
	private int mes;
	private int ano;
	
	int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	
	Scanner s = new Scanner(System.in);
	int valor;
	
	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;	
		setMes();
		setAno();
		setDia();		
	}
	public Data(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
		try {
			validate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void setDia() {
		
		int auxDia = encontraOmes();
		if(!bissexto())
		{
			do {
				System.out.print("Dia: ");			
				valor = s.nextInt();
				
			}
			while(valor < 0 || valor > auxDia);
		}
		else {
			do {
				System.out.print("Dia: ");			
				valor = s.nextInt();
				
			}
			while(valor < 0 || valor > (auxDia + 1));

		}
		
				
		
		try {
			validate();
			dia = valor;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	public void setMes() {
		
		do {
			System.out.print("Mes: ");			
			valor = s.nextInt();
		}
		while(valor < 0 || valor > 12);
		
		
		try {
			validate();
			mes = valor;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	public void setAno() {
		
		do {
			System.out.print("Ano: ");			
			valor = s.nextInt();
		}
		while(valor < 1900);
		
		
		try {
			validate();
			ano = valor;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public void setDia(int d) {
		dia = d;
	}
	public void setMes(int m) {
		mes = m;
	}
	public void setAno(int a) {
		ano = a;
	}

	// retorna as propridades privadas da classe.
	public int getDia()
	{
		return dia;
	}
	public int getMes()
	{
		return mes;
	}
	public int getAno()
	{
		return ano;
	}
	
	public String mostra1()
	{
		return "" + dia +"/"+mes+"/"+ano;
	}
	public String mostra2()
	{			
		switch(mes)
		{
		case 01 | 1:
			return "" + dia +"/Janeiro/"+ano;
		case 02 | 2:
			return "" + dia +"/Fevereiro/"+ano;
		case 03 | 3:
			return "" + dia +"/Março/"+ano;
		case 04 | 4:
			return "" + dia +"/Abril/"+ano;
		case 05 | 5:
			return "" + dia +"/Maio/"+ano;
		case 06 | 6:
			return "" + dia +"/Junho/"+ano;
		case 07 | 7:
			return "" + dia +"/Julho/"+ano;
		case 8:
			return "" + dia +"/Agosto/"+ano;
		case 9:
			return "" + dia +"/Setembro/"+ano;
		case 10:
			return "" + dia +"/Outubro/"+ano;
		case 11:
			return "" + dia +"/Novembro/"+ano;
		case 12:
			return "" + dia +"/Dezembro/"+ano;
		default:
			return "Meses do ano";
		}
	}
	public boolean bissexto() {
	    return ano % 4 == 0;
	  }
	
	
	public int diasTranscorridos() 
	{
		int aux =0;
		for(int i=0; i< (mes-1); i++)
		{
			aux = aux + meses[i];
		}
		aux = aux + dia;
		return aux;
	}
	
	private int encontraOmes()
	{
		switch(mes)
		{
		case 01 | 1:
			return meses[0];
		case 02 | 2:
			return meses[1];
		case 03 | 3:
			return meses[2];
		case 04 | 4:
			return meses[3];
		case 05 | 5:
			return meses[4];
		case 06 | 6:
			return meses[5];
		case 07 | 7:
			return meses[6];
		case 8:
			return meses[7];
		case 9:
			return meses[8];
		case 10:
			return meses[9];
		case 11:
			return meses[10];
		case 12:
			return meses[11];
		default:
			return 0;
		}
	}
	
	public String apresentaDataAtual() {
	    DateFormat dateFormat = DateFormat.getDateInstance(
	      DateFormat.FULL,
	      Locale.ROOT
	    );

	    String dataCorrente = dateFormat.format(new Date());

	    return dataCorrente;
	  }
	
	// Método para validar se está dentro dos padrões de hora, min. e seg.	
		private void validate() throws Exception 
		{
			int aux = encontraOmes();
			if(dia < 0 || dia > aux) 
			{
				 throw new Exception("ta de brincadeira né?");
			}
			if(mes > 12 || mes < 0) 
			{
				 throw new Exception("ajuda ae");
			}
				
		}
		
}
