#include <stdio.h>

#define ARRAY_SIZE 5

int main() {

	/*
	 * Tipos que representam coleções (compostos)
	 * Homogêneos: arrays (matrizes), strings.
	 * Heterogêneos: com valores variados.
	 *
	 * array (vetor) unidimensional
	 * elementos do mesmo tipo
	 * declaração de array exige alocação estática de memória
	 * declaração de um array dentro de uma função deve ser como `static`
	 * somente se o array for ser utilizado fora da função
	 *
	 * void swap(int a) {
	 * static int v[5] = {1, 2, 3, 4, 5};
	 * }
	 *
	 * int a[5] = {1, 2, 3, 4, 5};
	 *
	 * int length = sizeof(a)/sizeof(int);
	 *
	 * a[0] = 1;
	 * a[1] = 2;
	 * a[2] = 3;
	 * a[3] = 4;
	 * a[4] = 5;
	 *
	 * int func1(int arr[]){}
	 * int func1(int *arr){}
	 * indice do 1º elemento: v[0]
	 * indice do ultimo elemento: tam -1
	 *
	 * nome do vetor: v = &v[0]
	 * o nome do array atua como um pointer para o primeiro elemento do array
	 * acesso aos elementos via indice
	*/

	// receba e coloque os elementos em uma array
	int a[5], i, j;

	printf("Digite 5 elementos\n");

	for(i=0; i<5; i++) {
		printf("Digite a[%d]: ", i);
		scanf("%d", &a[i]);
	}

	printf("=====================================\n");

	// print array
	for(j=0; j<5; j++) {
		printf("a[%d] = %d\n", j, a[j]);
	}

	/*
	 * Arrays must be initialized with a number, not a variable.
	 * To make it "variable" use:
	 * #define ARRAY_SIZE 5
	*/

	int v[ARRAY_SIZE] = {1, 2, 3, 4, 5};

	// bidimensional array
	int x[2][3] = {
		{1, 2, 3},
		{4, 5, 6}
	};

	// Printing
	printf("=====================================\n");
	printf("Printing a bidimensional array.\n");
	for(int i=0; i<2; i++){
		printf("{ ");
		for(int j=0; j<3; j++){
			printf("%d ", x[i][j]);
		}
		printf("}\n");
	}

	// Sum
	int y[2][3] = {
		{1, 1, 1},
		{1, 1, 1}
	};

	int soma[2][3];

	printf("=====================================\n");
	printf("Printing the sum of two bidimensional arrays.\n");
	for(i=0; i<2; i++) {
		printf("{ ");
		for(j=0; j<3; j++) {
			soma[i][j] = x[i][j] + y[i][j];
			printf("%d ", soma[i][j]);
		}
		printf("}\n");
	}

	// Produto Escalar
	float v1[] = {3.0, 5.0};
	float v2[] = {2.0, 4.0};
	float p;

	float produto(float x[], float y[], int tam) {

		int i;
		float p = 0;

		for(i=0; i<tam; i++) {
			p = p + x[i] * y[i];
		}
		return p;
	}

	p = produto(v1, v2, 2);

	printf("O produto escalar dos arrays é %.2f\n", p);

/*

	Bidimensional Arrays

	Valids decalrations

*/

	int arr1[2][2] = {
		{1, 2},
		{3, 4}
	};

	int arr1_2[2][2] = {1, 2, 3, 4};

	int arr2[][2] = {
		{1, 2},
		{3, 4},
		{5, 6}
	};


return 0;
}
