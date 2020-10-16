#include <iostream>
using namespace std;


int main(int argc, char** argv)
{
	int v[8] = {26,49,38,13,58,87,34,93};
	int tam = sizeof(v)/sizeof(int);
	
	int aux;
	for(int i = 0; i<tam; i++)
	{
		for(int j = i + 1; j>0; j--){
			if(v[j] < v[j-1])
			{
				aux = v[j];
				v[j] = v[j-1];
				v[j-1] = aux;				
			}			
		}		
	}
	
	for(int i=0; i< tam; i++) {
		cout << v[i] << endl;
	}
	cout << endl;	 	
	
	return 0;
}