#include <stdio.h>
#include <string.h>

int main() {

	/*
	 * String in C is an array of characters taht ends with "\0"
	 *
	 * char str[100] = "Rodger Oliver";
	 * char str[] = "Rodger"; // str[7]
	 *
	 * char str[100] = {'R', 'o', 'd', 'g', 'e', 'r', '\0'};
	 * char nome[7] = "Unitau";
	 * {'U','n','i','t','a','u','\0'}
	 *
	 * Functions
	 * strlen() - get length of a string
	 * strcat() - merge two strings
	 * strcpy() - copy one string to another
	 * strlwr() - convert string to lower case
	 * strupr() - conver string to upper case
	 * strrev() - reverse string
	 * strcmp() - compare two strings
	*/

	char s[80] = "Unitau";

	/*
	 * declarar tam max
	 * tam real definido por '\0'
	 * caracter representado internamento por um inteiro que corresponde a entreda na ttabela ASCII
	*/

	printf("%s\n", s);

	// acessar caracteres individualmente
	for(int j = 0; s[j] != '\0'; j++) {
		printf("Valor = %d;	Caracter = %c\n", s[j], s[j]);
	}

return 0;
}
