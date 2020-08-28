#include <iostream>
using namespace std;
int main(int args, char** argv)
{
	double *p;
	double numero1;
	
		
	cout << "Inserir um valor: " << endl;
	cin >> numero1;
		
	p = &numero1;
	cout << "Endereco de memória: " << p << "O numero digitado foi: " << numero1 << endl;
	return 0;
}