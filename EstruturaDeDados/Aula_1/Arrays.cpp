#include <iostream>
#include <locale.h>
#define TAM 5
using namespace std;

void mostraArray(int valor[])
{
	for(int i = 0;i < TAM; i++)
	{
		cout << valor[i]<< endl;
	}
}
void adicionaArray(int valor[])
{
	for(int i = 0;i < TAM; i++)
	{
		valor[i]++;
		cout << valor[i] << endl;
	}
}
int main()
{
	int a[TAM] = {10, 20, 30, 40, 50};
	//mostraArray(a);
	adicionaArray(a);
	return 0;
}