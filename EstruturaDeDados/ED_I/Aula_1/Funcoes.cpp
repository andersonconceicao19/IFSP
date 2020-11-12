#include <iostream>
#include <locale.h>
using namespace std;
int incrementaPorValor(int valor)
{	
	return ++valor;
}
void incrementaPorReferencia(int &valor)
{
	valor++;
}
void incrementoComEnderecoDeMemoria(int *valor)
{
	*valor++;
}

int main(int argc, char** argv)
{
	setlocale( LC_ALL, "");
	int a = 1;	
	
	cout << "valor sem o incremento: " << a << endl;
	cout << "incremento por valor: " << incrementaPorValor(a) << endl;
	
	/*Incrementar por referencia de memória*/
	incrementaPorReferencia(a);
	cout << "incremeto por referencia: " << a << endl;
	incrementoComEnderecoDeMemoria(&a);
	cout << "incremeto por referencia: " << a << endl;
	
	return 0;
}
