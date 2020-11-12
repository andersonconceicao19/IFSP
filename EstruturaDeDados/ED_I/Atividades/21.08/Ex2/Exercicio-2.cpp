#include <stdio.h>
#include <iostream>
#include <locale.h>
using namespace std;

string CompararMatriz(int *matriz[], int *matriz2[])
{
	for(int i = 0; i< 3; i++)
	{		
		for(int j=0;j<3;j++)
		{		
			if(matriz[i][j] != matriz2[i][j])
			{
				return "As Matrizes nao sao iguais";
			}	
		}
	}
	return "As Matrizes sao iguais";
}

int main(int argc, char** argv)
{
	int **matriz;
	int **matriz2;
	int i;
	int j;
	matriz = new int*[3];
	matriz2 = new int*[3];	
	
	for(i = 0; i< 3; i++)
	{
		matriz[i] = new int[3];
		for(j=0;j<3;j++)
		{		
			cout << "Inserir valor: ";
			cin >> matriz[i][j];						
		}
	}
	for(i = 0; i< 3; i++)
	{
		matriz2[i] = new int[3];
		for(j=0;j<3;j++)
		{
			matriz2[i][j] = i + j;
		}
		// 0, 1, 2, 1, 2, 3, 2, 3, 4
	}
	
	cout << CompararMatriz(matriz, matriz2);
	delete[] matriz;
	delete[] matriz2;
	return 0;
}