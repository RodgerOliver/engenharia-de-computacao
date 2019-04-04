#include <stdio.h>

int main() {

/*
	Tipos simples: int a; float b; char c;
	Tipos que representam coleções (compostos)
	Homogêneos: arrays (matrizes), strings.
	Heterogêneos

	array (vetor) unidimensional
	elementos do mesmo tipo
	declaração de array exige alocação estática de memória
	declaração de um array dentro de uma função deve ser como `static`

	void swap(int a) {
		static v[5] = {1, 2, 3, 4, 5};
	}

	int a[5] = {1, 2, 3, 4, 5};


	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] = 4;
	a[4] = 5;
*/

	int x[5], i, j;

	printf("Digite 5 elementos\n");

	for(i=0; i<5; i++) {
		printf("Digite x[%d]: ", i);
		scanf("%d", &x[i]);
	}

	printf("=====================================\n");

	for(j=0; j<5; j++) {
		printf("x[%d] = %d\n", j, x[j]);
	}
/*
	String: deve possuir o marcador final de string que deterina o final do array.
	char nome[80] = "Unitau"
	{'U','n','i','t','a','u','\0'}
*/

return 0;
}
