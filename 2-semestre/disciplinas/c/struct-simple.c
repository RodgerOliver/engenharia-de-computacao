#include <stdio.h>
#include <stdlib.h>

//Estrutura base do nó.
struct Node {
	int valor;
	struct Node *next;
};

void displayLL(struct Node *p);

int main(void) {
	struct Node *inicio = NULL;
	struct Node *node1 = NULL;
	struct Node *node2 = NULL;
	struct Node *node3 = NULL;

	//Criando os nos e associando os dados.
	node1 = (struct Node*) malloc(sizeof(struct Node*));
	inicio = node1;
	node1->valor = 10;

	node2 = (struct Node*) malloc(sizeof(struct Node*));
	node2->valor = 20;

	node3 = (struct Node*) malloc(sizeof(struct Node*));
	node3->valor = 30;

	//Conectando os nós
	node1->next = node2;
	node2->next = node3;
	node3->next = NULL;

	//Mostrando a lista.
	if(inicio) {
		displayLL(inicio);
	}

	return 0;
}

//Função pra printar o nó na tela.
void displayLL(struct Node *p) {
	printf("Mostrando a lista:\n");
	if(p) {
		do {
			printf("%d ", p->valor);
			p=p->next;
		}
		while(p);
	} else
		printf("Lista vazia.");
}
