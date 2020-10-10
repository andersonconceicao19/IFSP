#include <iostream>
#include <unistd.h>
using namespace std;


struct Senha {
	int numSenha;
	struct Senha *prox;
};


struct SenhasGeradas {
	Senha *ini;
	Senha *fim;
};

struct SenhasAtendidas {
	Senha *ini;
	Senha *fim;
};


SenhasGeradas* initSenhasGeradas();
SenhasAtendidas* initSenhasAtendidas();
void enqueueGeradas(SenhasGeradas *sg, int valor);
int isEmptyGeradas(SenhasGeradas *sg);
int isEmptyAtendidas(SenhasAtendidas *sa);
void dequeueGeradas(SenhasGeradas *sg);
void enqueueAtendidas(SenhasAtendidas *sa, SenhasGeradas *sg);
void printAtendidas(SenhasAtendidas *sa);
int countAtendidas(SenhasAtendidas *sa);
int countGeradas(SenhasGeradas *sg);

int main(int argc, char** argv)
{
	
	SenhasGeradas *senhaGer;
	senhaGer = initSenhasGeradas();
	
	SenhasAtendidas *senhaAtend;
	senhaAtend = initSenhasAtendidas();
	
	int opcao, senhaGerada = 0;
	do {		
		cout << endl;
		cout << "0. Sair" << endl;
		cout << "1. Gerar senha" << endl;
		cout << "2. Realizar atendimento" << endl;
		
		cout << endl;
		cout << "Senhas esperando atendimento  : " << countGeradas(senhaGer) << endl;
		cout << "Senhas atendidas at� o momento: " << countAtendidas(senhaAtend) << endl;
		
		cout << endl << "Escolha -> ";
		cin >> opcao;
		
		switch(opcao)
		{
			// Sair
			case 0: 
			{				
				int isEmpty = isEmptyGeradas(senhaGer);
				// se a fila senhas geradas n�o estiverem vazias, bloqueia a sa�da do programa.
				if(isEmpty == 0) {
					cout << "ATEN��O, VOC� N�O PODE FINALIZAR, POIS AINDA EXISTEM SENHAS A SEREM ATENDIDAS!" << endl;
					opcao = -1;
					sleep(1.5);
				}
				break;
			}
			// Gerar senha
			case 1:
				// enfileirando na SenhasGeradas.
				enqueueGeradas(senhaGer, ++senhaGerada);
				break;
			// Realizar atendimento
			case 2: 
				// se n�o existirem senhas geradas, n�o existe atendimento.
				if(isEmptyGeradas(senhaGer)) {
					cout << "N�O EXISTEM SENHAS PARA SEREM ATENDIDAS!" << endl;
					sleep(1.5);
				} else { // enfileirando em senhas atendidas e desenfileirando em senhas geradas.
					enqueueAtendidas(senhaAtend, senhaGer);
					dequeueGeradas(senhaGer);
				}
				break;
		}
				
	} while(opcao != 0);
	
	printAtendidas(senhaAtend);
	
	cout << endl << endl;
	cout << "Total de senhas atendidas: " << countAtendidas(senhaAtend) << endl;
	
	return 0;
};

SenhasGeradas* initSenhasGeradas() {
	SenhasGeradas *sg = new SenhasGeradas;
	sg->ini = NULL;
	sg->fim = NULL;
	return sg;
};

SenhasAtendidas* initSenhasAtendidas() {
	SenhasAtendidas *sa = new SenhasAtendidas;
	sa->ini = NULL;
	sa->fim = NULL;
	return sa;
};

int isEmptyGeradas(SenhasGeradas *sg) {
	return (sg->ini == NULL);
};

int isEmptyAtendidas(SenhasAtendidas *sa) {
	return (sa->ini == NULL);
};

void enqueueGeradas(SenhasGeradas *sg, int valor) {
	Senha *senha = new Senha;
	senha->numSenha = valor;
	senha->prox = NULL;
	if(isEmptyGeradas(sg)) {
		sg->ini = senha;
	} else {
		sg->fim->prox = senha;
	}
	sg->fim = senha;
};


void dequeueGeradas(SenhasGeradas *sg) {
	Senha *senha = sg->ini;
	sg->ini = senha->prox;
	if(sg->ini == NULL) {
		sg->fim = NULL;
	}
	free(senha);
};


void enqueueAtendidas(SenhasAtendidas *sa, SenhasGeradas *sg) {
	Senha *senha = new Senha;
	senha->numSenha = sg->ini->numSenha;
	senha->prox = NULL;
	if(isEmptyAtendidas(sa)) {
		sa->ini = senha;
	} else {
		sa->fim->prox = senha;
	}
	sa->fim = senha;
};


void printAtendidas(SenhasAtendidas *sa) {
	Senha *senha;
	senha = sa->ini;
	
	cout << endl;
	cout << "Fila de senhas atendidas" << endl;
	while(senha != NULL) {
		cout << senha->numSenha << " | ";
		senha = senha->prox;
	}
};


int countAtendidas(SenhasAtendidas *sa) {
	int qtde = 0;
	Senha *senha;
	senha = sa->ini;
	while(senha != NULL) {
		qtde++;
		senha = senha->prox;
	}
	return qtde;
}

int countGeradas(SenhasGeradas *sg) {
	int qtde = 0;
	Senha *senha;
	senha = sg->ini;
	while(senha != NULL) {
		qtde++;
		senha = senha->prox;
	}
	return qtde;
}
