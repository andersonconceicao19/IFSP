#include <iostream>

using namespace std;


struct data
{
	int dia;
	int mes;
	int ano;
};

int main(int argc, char** argv)
{


	
	return 0;
}

/*
	-- passando valores para a função que deseja colocar na struct
struct data
{
	int dia;
	int mes;
	int ano;
};

void diaDeHoje(data d);
void init(data *d);
void criarData(data *d, int dia, int m, int a);

int main(int argc, char** argv)
{
	data data;
	
	//init(&data);	
	criarData(&data, 25, 05, 1991);
	diaDeHoje(data);
	
	
	return 0;
}

void diaDeHoje(data d){
	cout << d.dia <<"/" << d.mes<< "/" << d.ano;
}
void init(data *d){
	d->dia = 0;
	d->mes = 0;
	d->ano = 0;
}
void criarData(data *d, int dia, int m, int a){
	d->dia = dia;
	d->mes = m;
	d->ano = a;
}*/

/*
// STRUCT USANDO PONTEIRO Usando ponteiro 
struct moto
{
	string cor;
	string marca;
	float valor;
};

int main(int argc, char** argv)
{
	moto m;
	moto *p;
	
	m.cor = "branca";
	m.marca = "fazer";
	m.valor = 13000.00;
	
	p = &m;
	
	cout << "Cor "<< p->cor << " Marca: " << p->marca<<" Valor: " << p->valor << " feito com ponteiro"<<endl;
	
	return 0;
}

*/

/*

	// Usando Struct de forma simples. 
	
	* Não esqueça de declarar os namespace, para poder usar os tipos de dados corretos.
struct nome
{
	string name;
	string lastName;	
};

int main(int argc, char** argv)
{
	nome n;
	
	n.name = "Anderson";
	n.lastName = "Conceicao";
	
	cout << "Meu nome er " << n.name << " " << n.lastName << endl;
	
	return 0;
}
*/