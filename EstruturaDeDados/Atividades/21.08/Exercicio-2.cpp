#include <iostream>
#include <locale.h>
using namespace std;

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
			//clear();			
		}
	}
	for(i = 0; i< 3; i++)
	{
		matriz2[i] = new int[3];
		for(j=0;j<3;j++)
		{
			matriz2[i][j] = i + j;
		}
	}
	for(i = 0; i< 3; i++)
	{
		
		for(j=0;j<3;j++)
		{		
			if(matriz[i][j] == matriz2[i][j])
			{
				cout << "As matrizes sao iguais. Nas posições: " << matriz[i] <<" x " << matriz2[i]<< endl;;
			}	
		}
		//cout << endl;
	}
	delete[] matriz;
	
	return 0;
}