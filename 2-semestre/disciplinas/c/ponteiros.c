#include <stdio.h>

int swap(int a, int b);
int swap_point(int *a, int *b);

int main() {
	/* pointers */
	int i, s = 0;
	int *z;
	for(i = 1; i < 6; i++) {
		s += i;
	}
	z = &i;
	printf("Sum = %d\n", s);
	printf("Location of i: %p\n", z);
	printf("Value of i: %d\n", *z);

	int a = 5, b = 6;

	printf("\n====================\n");
	swap(a, b);
	printf("\n====================\n");
	printf("Outside of the function\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	printf("&a = %p\n", &a);
	printf("&b = %p\n", &b);

	int *x = &a;
	int *y = &b;
	printf("\n====================\n");
	swap_point(x, y);
	printf("\n====================\n");
	printf("Outside of the function\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	printf("&a = %p\n", &a);
	printf("&b = %p\n", &b);
}

int swap(int a, int b) {
	int tmp = a;
	a = b;
	b = tmp;
	printf("Inside SWAP\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	printf("&a = %p\n", &a);
	printf("&b = %p\n", &b);
}

int swap_point(int *a, int *b) {
	// a  = endereco de a
	// *a = valor de a
	int tmp = *a;
	*a = *b;
	*b = tmp;
	printf("Inside SWAP_POINT\n");
	printf("a = %d\n", *a);
	printf("b = %d\n", *b);
	printf("&a = %p\n", a);
	printf("&b = %p\n", b);
}
