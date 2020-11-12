package AmostraTemperatura;

import java.util.Date;
import java.util.Scanner;

public class AmostraTemperatura {
	
	private static int numSeq = 0;
	private Data data;
	private horas hora;
	private float valor;
	
	Scanner s = new Scanner(System.in);
	
	
	public AmostraTemperatura() {
		 setData();
		 setHora();
		 setValor();
		 
	}
	public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
		setData(a, b, c);
		setHora(d, e, f);
		setValor(v);
	}
	public AmostraTemperatura(Data d, horas h, float v) {
		
	}
	
	
	public void setData()
	{		
		data = new Data();
	}
	public void setData(int a, int b, int c)
	{		
		data = new Data(a, b, c);		
		
	}


	public void setHora() {
		hora = new horas();
	}
	public void setHora(int a, int b, int c) {
		hora = new horas(a, b, c);	
	}
	
	public void setValor()
	{
		System.out.print("Digite a temperatura: ");
		valor = s.nextFloat();		
		numSeq++;		
	}
	public void setValor(float v)
	{
		valor = v;	
		numSeq++;		
	}
	
	
	public String getData() {
		 return "" + data.getDia() +"/"+ data.getMes() + "/" + data.getAno() + "";
	}

	public String getHora() {
		return "" + hora.getHor() + ":" + hora.getMin() + ":" + hora.getSeg();
	}
	
	public float getValor()
	{
		
		return valor;
	}
	
	public int getNumSeq() {
		return numSeq;
	}
}
