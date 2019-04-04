/*trecho c/ includes+definições*/
# include <stdio.h>
# include <stdlib.h>

int main(void) { // void significa nenhum parametro

	/* declaração de variáveis */
	printf("Hello world");
	char ch = 'A'; // char sempre deve estar com aspas simples ('), nunca dupla
	int a = 1; //declaração inicial
	int b,c,d,e;
	float x,y;
	scanf("%d", &d);

	/* instruções vem após declaração de variaveis */
	b = 2 * a;
	x = 3.14;
	y = 3.0 * x;

	/* saída */
	printf("a = %d b = %d c = %d ch = %c d=%d\n", a, b, c, ch, d);
	printf("valor float: y = %f\n", y);
	scanf("%d", &e);
	system("pause");

	/*

	Listas de nomes de variaveis separdos por virgula

	# Saída Básica

	printf("    ", [arg...]);
	printf(" %d %f %c ", a, z, ch);

	O numero de formatadores deve ser igual ao numero de variaveis, senão da merda.

	3 tipos de elementos
	- texto
	- formatador de variaveis (%f, %d, %c, ...)
	- caracteres de controle (\n, \a, \t, ...)
	- o numero de parametros da função printf() é variavel.

	# Entrada Básica

	scanf("   ", [arg...]);
	scanf(" %d %c %f ", &a, &ch, &x );

	- primeiro campo possui somente formatadores.
	- scanf() pega inputs do teclado.
	- & = operador de endereçamento.
	- a = variável; &a = endereço da variavel a.



	*/


	return 0;

}
