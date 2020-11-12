#include <iostream>
#include <unistd.h>
using namespace std;

struct Funcionario
{
	int prontuario;
	string nome;
	double salario;
	struct Funcionario *ant;
};

Funcionario* init()
{
	return NULL;
}

void print(Funcionario* func)
{
	int cont = 1;
	Funcionario* aux;
	aux = func;
	if(aux != NULL) {
		while (aux != NULL)
		{
			cout << "------------------------------" << endl;
			cout << "Funcio?rio " << cont << endl;
			cout << "------------------------------" << endl;
			cout << "Nome: " << aux->nome << endl;
			cout << "Prontuario: " << aux->prontuario << endl;
			cout << "Salario: " << aux->salario << endl << endl;
			aux = aux->ant;
			cont++;
		}
	} else {
		cout << endl << "Nenhum funcion?rio para ser exibido!" << endl << endl;
	}
}
Funcionario* create(Funcionario* func, int prontuario, string nome, double salario)
{
	Funcionario* novoFunc = new Funcionario;
	novoFunc->prontuario = prontuario;
	novoFunc->nome = nome;
	novoFunc->salario = salario;
	novoFunc->ant = func;
	return novoFunc;
}

Funcionario* find(Funcionario* func, int pront)
{
	Funcionario* aux;
	aux = func;
	while (aux != NULL && aux->prontuario != pront)
	{
		aux = aux->ant;
	}
	return aux;
}

Funcionario* remove(Funcionario* func, int pront)
{
	Funcionario *ant = NULL;
	Funcionario *aux;
	
	aux = func;
	while (aux != NULL && aux->prontuario != pront)
	{
		ant = aux;
		aux = aux->ant;
	}
	if (aux == NULL)
	{
		return func;
	}
	if (ant == NULL) // era primeiro
	{
		func = aux->ant;
	}
	else // estava no meio
	{
		ant->ant = aux->ant;
	}
	free(aux);
	return func;
}

bool validarProntuario(Funcionario* func, int prontuario) 
{
	int contDuplic = 0;
	Funcionario* aux;
	aux = func;
	while(aux != NULL)
	{
		if(aux->prontuario == prontuario) {
			contDuplic++;
		}
		aux = aux->ant;
	}
	
	return (contDuplic == 0)? true : false;
		
}

void freeList(Funcionario* func)
{
	Funcionario *aux;
	aux = func;
	while (aux != NULL)
	{
		Funcionario *ant = aux->ant;
		free(aux);
		aux = ant;
	}
}

int main(int argc, char** argv)
{
	setlocale(LC_ALL,"Portuguese");	
	int opcao, prontuario;
	double salario;
	string nome;
	
	Funcionario *funcionario;
	funcionario = init();
	
	do {
		cout << "0. Sair" << endl;
		cout << "1. Incluir" << endl;
		cout << "2. Excluir" << endl;
		cout << "3. Pesquisar" << endl;
		cout << "4. Listar" << endl;
		
		cout << " ";
		cin >> opcao;
		
		switch(opcao) {
			case 0:
				cout << endl << "Programa encerrado!";
				break;
			case 1: 
			{
				cout << endl;
				cout << "Incluir funcionario" << endl;
				cout << "Nome: ";
				cin >> nome;
				cout << "Prontuario: ";
				cin >> prontuario;
				cout << "Salario: R$ ";
				cin >> salario;
				
				bool valido = validarProntuario(funcionario, prontuario);
				
				if(valido) {
					funcionario = create(funcionario, prontuario, nome, salario);
					cout << endl << "Inclusao realizada com sucesso!" << endl << endl;	
				} else {
					cout << endl << "O prontuario inserido existe, tente novamente!" << endl << endl;
				}
				sleep(2.0);
				break;	
			}
			case 2: 
			{
				int pb;
				cout << endl;
				cout << "Excluir Funcionario" << endl;
				cout << "Informe o n?mero do prontu?rio: ";
				cin >> pb;
				
				Funcionario* aux;
				aux = remove(funcionario, pb);
				if(funcionario != aux){ // se for diferente, houve mudan?a na lista
					cout << endl << "Funcion?rio exclu?do com sucesso!" << endl << endl;
					funcionario = aux;
				} else {
					cout << endl << "Nenhum funcion?rio encontrado com esse prontu?rio!" << endl << endl;
				}
				sleep(1.5);
				break;	
			}
			case 3: // Pesquisa de funcion?rios pelo prontu?rio
			{
				int pb;
				cout << endl;
				cout << "PESQUISA POR FUNCION?RIO" << endl;
				cout << "Informe o n?mero do prontu?rio: ";
				cin >> pb;
				
				Funcionario* aux;
				aux = find(funcionario, pb);
				
				cout << endl;
				if(aux != NULL) {					
					cout << "Nome: " << aux->nome << endl;
					cout << "Prontu?rio: " << aux->prontuario << endl;
					cout << "Sal?rio: " << aux->salario << endl;	
				} else {
					cout << "Nenhum funcion?rio encontrado com esse prontu?rio!";
				}				
				cout << endl << endl;
				sleep(2.0);
				break;
			}
			case 4: // Listar funcion?rios
				cout << endl << "LISTAGEM DE FUNCIO?RIOS" << endl;
				print(funcionario);
				sleep(2.0);
				break;
			default:
				cout << "Op??o inv?lida, tente novamente!" << endl << endl;
				sleep(2.0);
				break;
		}
	} while(opcao != 0);
	
	freeList(funcionario);
	
	return 0;
}
