#include <stdio.h>

int main() {
	/* ===== OPERADORES BIT-A-BIT
	 * Setar/Resetar bit de porta física de PC
	 * Mascara para descobrir em que rede seu PC está (usa E)
	 *
	 * E     -  &
	 * OU    - |
	 * XOR   - ^
	 * SHIFT - <<
	 * SHIFT - >>
	 * COMP  - ~
	 * COMP == COMPLEMENTO
	 */

	int bit1, bit2, bit3;
	int c, d, e;
	unsigned int f;

	bit1 = 111;
	bit2 = 101;
	bit3 = 1;

	c = bit1 & bit2;
	d = bit1 && bit2;
	e = bit1 << 1; // => 0 0 1 0

	printf("c = %i\n", c);
	printf("d = %i\n", d);
	printf("e = %i\n", e);

	/*
	 * comparar
	 * com operadores lógico
	 *
	 *              bit1 = 0 1 1 1
	 *              bit2 = 0 1 0 1
	 *              -----------
	 * c = bit1 & bit2  =     0 1 0 1
	 * c = bit1 && bit2 =     0 0 0 1
	 */

	/*
	 * ===== VERIFICAR SE BIT EM POSIÇÃO r É 1 OU 0
	 */

	int a = 8;
	int pos = 3;
	int r;
	unsigned int mask = 1;

	mask = mask << pos;
	r = mask & a;

	if(r) {
		printf("BIT e 1\n");
	}

	/*
	 * ===== SETAR BIT NA pos = 3 para 1
	 * LIGAR
	 */

	a = 4;
	pos = 3;
	mask = 1;

	mask = mask << pos;
	r = mask | a;
	printf("r = %i\n", r);

	/*
	 * ===== RESETAR BIT NA pos = 3 para 0
	 * DESLIGAR
	 */

	a = 10;
	pos = 3;
	mask = 1;

	mask = ~(mask << pos);
	r = mask & a;
	printf("r = %i\n", r);

	/*
	 * ===== DESCOBRIR QUANTOS BITS ESTÃO SETADOS EM 1
	 */

	a = 10;
	mask = 1;
	int num_bits = 4;
	int i = 0;
	int count = 0;
	int test;

	while(i <= num_bits-1) {
		test = a & mask;
		printf("test = %i\n", test);
		mask = mask << 1;

		if(test) {
			count++;
		}
		i++;
	}
	printf("count = %i\n", count);

	/*
	 * ===== DESCOBRIR SE O NÚMERO DADO É PAR OU ÍMPAR USANDO OPERADORES BIT-A-BIT
	 */

	a = 10;
	mask = 1;
	r = a & mask;
	if(r) {
		printf("IMPAR\n");
	} else {
		printf("PAR\n");
	}

	return 0;
}
