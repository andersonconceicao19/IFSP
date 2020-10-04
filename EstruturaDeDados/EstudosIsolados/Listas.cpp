#include <iostream>

using namespace std;

struct Lista
{
	int dado;
	struct Lista *prox;
};

Lista* init(); 
int isEmpty(Lista* lista);
Lista* insert(Lista* lista, int i);
void print(Lista* lista);


int main(int argc, char** argv)
{
	Lista *minhaLista;
	minhaLista = init(); // 1
	
	// cout << "Lista vazia: " << (isEmpty(minhaLista)?"Sim":"Nao") << endl;
	
	// 3
	minhaLista = insert(minhaLista, 5);
	minhaLista = insert(minhaLista, 10);
	minhaLista = insert(minhaLista, 7);
	minhaLista = insert(minhaLista, 11);
	
	print(minhaLista); 
	/** Imprimindo na tela os valores da lista
	* Notar que o valor de exibição é do ultimo inserido até o primeiro inserido
	* Ou seja, exibe de forma decrescente.
 	*/
	
	
	
	return 0;
}

Lista* init() // 1 - Inicializando o primeiro valor com null;
{
	return NULL;
}

int isEmpty(Lista* lista) // 2 - Verificando se está vazio a lista
{
	return (lista == NULL);
}

Lista* insert(Lista* lista, int i) // 3 - Inserindo elementos na lista
{
	Lista* novo = new Lista; // instanciando a lista
	novo->dado = i; // setando os valores recebido no parametro para a lista.
	novo->prox = lista; // setando que o valor da lista, vai oculpar o valor de proximo
	// [0] = i ;;;; [1] = lista.value.Anterior
	return novo;
}
void print(Lista* lista) // 4 - Printando a lista.
{
	Lista* aux;
	aux = lista;
	
	while(aux != NULL)
	{
		cout << "Dados: " << aux->dado << endl;
		aux = aux->prox;
	}
}

//aqui

