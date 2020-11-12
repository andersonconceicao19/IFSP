package Horas;

import java.util.Scanner;

public class horas {

	private int horas;
	private int minutos;
	private int segundos;
	
	Scanner s = new Scanner(System.in);
	private int valor;
	
	public horas() {
		horas= 0;
		minutos = 0;
		segundos = 0;
		setHor();
		setMin();
		setSeg();		
		
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
	
	public void setHor(int h) {
		horas = h;
		try {
			validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setMin(int m) {
		minutos = m;
		try {
			validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setSeg(int s) {
		segundos = s;
		try {
			validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void setHor() {
		
		do {
			System.out.print("Digite o valor em horas: ");			
			valor = s.nextInt();
		}
		while(valor < 0 || valor > 23);
		
		
		try {
			validate();
			horas = valor;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	public void setMin() {
		do {
			System.out.print("Digite o valor em minutos: ");			
			valor = s.nextInt();
		}
		while(valor < 0 || valor > 59);
		
		
		try {
			validate();
			minutos = valor;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setSeg() {
		do {
			System.out.print("Digite o valor em segundos: ");			
			valor = s.nextInt();
		}
		while(valor < 0 || valor > 59);
		
		
		try {
			validate();
			segundos = valor;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getHor()
	{
		return horas;
	}

	public int getMin()
	{
		return minutos;
	}

	public int getSeg()
	{
		return segundos;
	}

	public String getHora1()
	{
		return "" + horas + ":" + minutos + ":" + segundos;
	}
	
	public String getHora2()
	{
		if(horas >= 0 && horas < 12) {
			return "" + horas + ":" + minutos + ":" + segundos + " a.m" ;
		}
		else {
			return "" + horas + ":" + minutos + ":" + segundos + " p.m";
		}
		
	}
	
	public int getSegundos()
	{
		return ((horas * 60) * 60 ) + (minutos * 60) + segundos;		
		
	}
	// Método para validar se está dentro dos padrões de hora, min. e seg.	
	private void validate() throws Exception 
	{
		if(horas < 0 || horas > 23) 
		{
			 throw new Exception("ta de brincadeira né?");
		}
		if(minutos < 0 || minutos > 59) 
		{
			 throw new Exception("Pô, meu chapa. Minutos é até 60. Ajuda ae");
		}
		if(segundos < 0 || segundos > 59 ) 
		{
			 throw new Exception("Segundos invalidos");
		}
			
	}
	
	
}
