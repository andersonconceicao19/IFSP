#include <iostream>
#include <string>
#include <ctime>
#include <vector>
using namespace std;

#define TAM 10

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
		time_t t;
		struct tm *data;
		
		time(&t);
		data = localtime(&t);
		
		this->dia = data->tm_mday;
		this->mes = data->tm_mon+1;
		this->ano = (data->tm_year + 1900);
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
	string getData()
	{
		string dia = (this->dia < 10)? "0" + to_string(this->dia) : to_string(this->dia);
		string mes = (this->mes < 10)? "0" + to_string(this->mes) : to_string(this->mes);
		string ano = to_string(this->ano);				
		
		return dia + "/" + mes + "/" + ano;
	}
	Data* dia_seguinte()
	{
		int diasNoMes[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Data *d1 = new Data(this->dia, this->mes, this->ano);

		if (d1->ano % 4 == 0)
		{
			diasNoMes[1]++;
		}

		d1->dia++;
		if (d1->dia > diasNoMes[d1->mes - 1])
		{
			d1->dia = 1;
			if (++d1->mes > 12)
			{
				d1->mes = 1;
				d1->ano++;
			}
		}

		return d1;
	}
};

class Contato
{
	private:
		string email;
		string nome;
		string telefone;
		string nasc;
		
	public:
		Contato(string email, string nome, string telefone, string nasc)
		{
			this->email = email;
			this->nome = nome;
			this->telefone = telefone;
			this->nasc = nasc;
		}		
		Contato()
		{
			this->email = "";
			this->nome = "";
			this->telefone = "";
			this->nasc = "";
		}
		
		//setters
		void setEmail(string email)
		{
			this->email = email;
		}
		void setNome(string nome)
		{
			this->nome = nome;
		}
		void setTelefone(string telefone)
		{
			this->telefone = telefone;
		}
		void setNasc(string nasc)
		{
			this->nasc = nasc;
		}
		
		string getEmail()
		{
			return this->email;
		}
		string getNome()
		{
			return this->nome;
		}
		string getTelefone()
		{
			return this->telefone;
		}
		string getNasc()
		{
			return this->nasc;
		}
		
		int getIdade()
		{
			Data *dtHoje = new Data(6, 9, 2020);
			int anoAtual = dtHoje->getAno();
			int anoNasc = stoi((this->nasc).substr(6, 4)); // extraindo ano
			int mesNasc = stoi((this->nasc).substr(3, 2)); // extraindo mês
			int diaNasc = stoi((this->nasc).substr(0, 2)); // extraindo dia
			
			int idade = anoAtual - anoNasc;			
			if(dtHoje->getMes() < mesNasc) {
				idade--;
			} else if(dtHoje->getMes() == mesNasc) {
				if(dtHoje->getDia() < diaNasc) {
					idade--;
				}
			}
			
			return idade;
		}
};

void resContatos(Contato *contatos[])
{
	for(int i=0; i<TAM; i++)
	{
		string nome = contatos[i]->getNome();
		string nasc = contatos[i]->getNasc();
		string idade = to_string(contatos[i]->getIdade());
		cout << nome << " --->\t" << "DN: " << nasc << " - " << idade << " anos" << endl;
	}
}

int mediaIdade(Contato *contatos[])
{
	int ci = 0;
	for(int i=0; i<TAM; i++)
	{
		ci += contatos[i]->getIdade();
	}
	
	return ci / TAM;
}

vector<string> acimaDaMedia(Contato *contatos[])
{
	vector<string> media;	
	for(int i=0; i<TAM; i++)
	{
		if(contatos[i]->getIdade() > mediaIdade(contatos))
		{
			media.push_back(contatos[i]->getNome());
		}
	}
	
	return media;	
}


int maioresDeDezoito(Contato *contatos[])
{
	int maiores = 0;
	for(int i=0; i<TAM; i++)
	{
		if(contatos[i]->getIdade() >= 18)
		{
			maiores++;
		}
	}
	
	return maiores;
}


vector<string> getMaisVelho(Contato *contatos[])
{
	vector<string> contatoMaior;
	
	int maior = 0;
	for(int i=0; i<TAM; i++)
	{
		if(i == 0)
		{
			maior = contatos[i]->getIdade();
			contatoMaior.push_back(contatos[i]->getNome());
		} else { 
			if(maior < contatos[i]->getIdade())
			{
				maior = contatos[i]->getIdade();
				contatoMaior = {};
				contatoMaior.push_back(contatos[i]->getNome());
			} else if(maior == contatos[i]->getIdade())
			{
				contatoMaior.push_back(contatos[i]->getNome());
			}
		}
	}
	
	contatoMaior.push_back(to_string(maior)); 
	return contatoMaior;
}

int main(int argc, char** argv)
{
	setlocale(LC_ALL,"");
	
	Contato *contatos[TAM];
	
	string nome, email, telefone, nasc;
	for(int i=0; i<TAM; i++)
	{
		cout << "CONTATO " << i + 1 << endl;
		cout << endl;
		
		cout << "Nome: ";
		cin >> nome;
		
		cout << "E-mail: ";
		cin >> email;
		
		cout << "Telefone: ";
		cin >> telefone;
		
		cout << "Data Nasc. (dd/mm/aaaa): ";
		cin >> nasc;
		
		contatos[i] = new Contato(email, nome, telefone, nasc);
		cout << endl;
	}
	
	resContatos(contatos);
	
	cout << endl << "MÉDIA DAS IDADES: " << mediaIdade(contatos) << " anos" << endl;
	cout << endl << "CONTATOS MAIORES DE IDADE: " << maioresDeDezoito(contatos) << " CONTATOS" << endl;
	
	
	vector<string> nomesmedia = acimaDaMedia(contatos);
	cout << endl << "CONTATOS ACIMA DA MÉDIA DE IDADE (" << mediaIdade(contatos) << " ANOS):" << endl;
	for(int i=0; i<nomesmedia.size(); i++)
	{
		cout << nomesmedia[i] << endl;
	}
	
	vector<string> maisVelhos = getMaisVelho(contatos);
	
	cout << endl << "CONTATOS MAIS VELHOS (" << maisVelhos[maisVelhos.size()-1] << " ANOS): " << endl;
	for(int i=0; i<maisVelhos.size()-1; i++)
	{
		cout << i+1 << " - " << maisVelhos[i] << endl;
	}

	return 0;
}