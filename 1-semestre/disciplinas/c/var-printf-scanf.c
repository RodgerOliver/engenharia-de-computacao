/*trecho c/ includes+defini��es*/
# include <stdio.h>
# include <stdlib.h>

int main(void) { // void significa nenhum parametro

	/* declara��o de vari�veis */
	printf("Hello world");
	char ch = 'A'; // char sempre deve estar com aspas simples ('), nunca dupla
	int a = 1; //declara��o inicial
	int b,c,d,e;
	float x,y;
	scanf("%d", &d);

	/* instru��es vem ap�s declara��o de variaveis */
	b = 2 * a;
	x = 3.14;
	y = 3.0 * x;

	/* sa�da */
	printf("a = %d b = %d c = %d ch = %c d=%d\n", a, b, c, ch, d);
	printf("valor float: y = %f\n", y);
	scanf("%d", &e);
	system("pause");

	/*

	Listas de nomes de variaveis separdos por virgula

	# Sa�da B�sica

	printf("    ", [arg...]);
	printf(" %d %f %c ", a, z, ch);

	O numero de formatadores deve ser igual ao numero de variaveis, sen�o da merda.

	3 tipos de elementos
	- texto
	- formatador de variaveis (%f, %d, %c, ...)
	- caracteres de controle (\n, \a, \t, ...)
	- o numero de parametros da fun��o printf() � variavel.

	# Entrada B�sica

	scanf("   ", [arg...]);
	scanf(" %d %c %f ", &a, &ch, &x );

	- primeiro campo possui somente formatadores.
	- scanf() pega inputs do teclado.
	- & = operador de endere�amento.
	- a = vari�vel; &a = endere�o da variavel a.



	*/


	return 0;

}
