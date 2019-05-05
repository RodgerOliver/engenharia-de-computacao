// <stdio.h> possui os protótipos das funções
#include <stdio.h>
//# include <my_file.c>
//##include "my_other_file.c"
#define PI 3.14

int main() {

/*
	auto keyword: é iniciada todas as vezes, é construída na chamada da função, é destruída no termino da função.
	static keyword: é iniciada uma vez, é construída na chamada da função, não é destruída no termino da função.
	extern keyword: alguem definiu a variável em outro arquivo.
	register keyword: registrador serve para manipular rapidamente os dados, usados para valores inteiros normalmente.
	Se a CPU tiver espaço vai dar prioridade para alocar esta variável.

	definição: única (int var).
	declaração: declara uma variável de um outro arquivo no arquivo (extern int var).
*/

	auto int a; // == int a;
	static int b;
	extern int c;
	register int v;
/*
	Diretivas do pré-processador

	#include
	Serve para fazer referenciação de outros arquivos em um arquivo. O compilador procura no path /include
	#include "file.c"
	Dessa maneira o compilador procura o arquivo no path do programa.

	#define
	Cria Constantes e Macros. No processo de compilação a constante de #define é substituída pelo valor. Aceita qualquer tipo de variável.

	Constantes
	#define MAX 10
	#define [identificador] [valor]

	Macros
	#define SOMA(x,y) ((x)+(y))
	Dessa maneira `x` e `y` aceitam expressões e não são prejudicadas por operações externas.
	#define MAX(x,y) ((x)>=(y))?(x):(y)
*/

return 0;
}
