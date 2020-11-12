#include <iostream>
using namespace std;

class Data
{
	private: 	
	   int dia;
	   int mes;
	   int ano;	
    public:
    	Data(int dia, int mes, int ano)
		{
			this->dia = dia;
			this->mes = mes;
			this->ano = ano;
		}
		Data()
		{
			this->dia = 0;
			this->mes = 0;
			this->ano = 0;
		}
    	void setDia(int dia)
    	{
			this->dia = dia;
		}
		void setMes(int mes)
    	{
			this->mes = mes;
		}
		void setAno(int ano)
    	{
			this->ano = ano;
		}
		int getDia()
		{
			return this->dia;
		}
		int getMes()
		{
			return this->mes;
		}
		int getAno()
		{
			return this->ano;
		}
		
	
};


int main(int argc, char** argv)
{
    Data *hoje = new Data(28, 8, 2020);
    cout << hoje->getData() << endl;
    
    Data *amanha = hoje->dia_seguinte();
    cout << amanha->getData() << endl;
    
	 
	return 0;
}