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
void freeList(Lista* lista);


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
    minhaLista = remove(minhaLista, 7); // Removendo  o elemento passado por parametro
    
    print(minhaLista);
    
    freeList(minhaLista);

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
	
	Lista* ant = NULL;
	Lista* aux;
	
	aux = lista;
	while(aux != NULL && aux->dado != i)
	{
		/*
			Enquanto a valor nao foi encontrado, o anterior recebe o auxiliar que foi verificado (a)
			Depois a logica faz o auxiliar para o Proximo elemento, para pesquisa (b)
		*/
		ant = aux; // (a)
		aux = aux->prox; // (b)
	}
	if(aux == NULL)
	{
		return lista; // Se não encontrar o elemento, retorna a lista como ela veio.
	}
	if(ant == NULL) // Se cair nessa condição, significa que o Elemento requerido era o >>primeiro da lista<<.
	{
		lista = aux->prox;
	}else // Significa que estava no meio da lista
	{
		ant->prox = aux->prox;
	}
	free(aux); // Libera o conteudo que estava no espaço de memoria apontado
	
	return lista;
}

void freeList(Lista* lista){
	Lista* aux; // Declarando uma variavel auxiliar
	aux = lista; // Setando o auxiliar com o valor da lista;
	while(aux != NULL)
	{
		Lista *anterior = aux->prox; // Para cada loop é pego nessa anterior o valor do proximo elemento
		free(aux); // Libera na memoria o valor contido na lista
		aux = anterior; 
		// pega os valores restantes, que foi passado ao anterior, e repassa ao auxiliar. Até acabar o loop
	}
}