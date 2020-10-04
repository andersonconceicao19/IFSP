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
Lista* find(Lista* lista, int i);
Lista* remove(Lista* lista, int i);

int main(int argc, char** argv)
{
	Lista *minhaLista;
	minhaLista = init();
	
	cout << "Lista vazia: " << (isEmpty(minhaLista)?"Sim":"Nao") << endl;
	
	minhaLista = insert(minhaLista, 5);
	minhaLista = insert(minhaLista, 10);
	minhaLista = insert(minhaLista, 7);
	
	cout << "Lista vazia: " << (isEmpty(minhaLista)?"Sim":"Nao") << endl;
	
	print(minhaLista);
	
	Lista *procurado = find(minhaLista, 1); 
	if (procurado->dado > -1)
	{
  	   cout << "Resultado da busca: " << procurado->dado << endl;		
	}
    else
    {
   	   cout <<"Nao encontrado" << endl;
    }

	return 0;
}	
	
// --------------------------------------------------------------------------------------

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

Lista* find(Lista* lista, int i) // 5 - Encontrar elemento passado por parametro
{
	Lista* aux; // Declarando um aux. do tipo lista
	aux = lista;
	while (aux != NULL && aux->dado != i) 
	{
		aux = aux->prox; // Pulando os elementos até verificar se existe o referenciado
	}
	if (aux == NULL) // Para caso chegue no valor nulo.
	{
		aux = new Lista; 
		aux->dado = -1; // setando o valor para retorno de -1, para que o objeto que receber faça a logica necessaria
		aux->prox = NULL; // setando o proximo como null
	}
	return aux; // retornando o novo elemento encontrado ou a nova instancia com -1
}

Lista* remove(Lista* lista, int i){
	
	Lista* ant;
	Lista* aux;
	
	aux = lista;
}
