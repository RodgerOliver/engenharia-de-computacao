#include <stdio.h>
# include <stdlib.h>
# include <math.h>

/* char s[] == char *s */
/* *(s1 + i) == s1 + sizeof(char) x i */

int swap(int a, int b);
int swap_pointer(int *a, int *b);
void testfunc(char *name, double (*funcPtr)());
double sum_square(double (*f)(double), double m, double n);
double f_de_k(double k);
double g_de_x(double x);
void print_separator();

int main() {
	/* ===== BASIC ===== */
	int i, s = 0;
	int *z;
	for(i = 1; i < 6; i++) {
		s += i;
	}
	z = &i;
	print_separator();
	printf("Sum = %d\n", s);
	printf("Location of i: %p\n", z);
	printf("Value of i: %d\n", *z);

	int a = 5, b = 6;

	print_separator();
	swap(a, b);
	print_separator();
	printf("Outside of the function\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	printf("&a = %p\n", &a);
	printf("&b = %p\n", &b);

	int *x = &a;
	int *y = &b;
	print_separator();
	swap_pointer(x, y);
	print_separator();
	printf("Outside of the function\n");
	printf("a = %d\n", a);
	printf("b = %d\n", b);
	printf("&a = %p\n", &a);
	printf("&b = %p\n", &b);

	/* ===== DYNAMIC ALLOCATION ===== */
	int *p, tam = 10;
	// define size of memory that is gonna be stored in the variable
	// tam * sizeof(int) returns bytes
	p = (int *)malloc(tam * sizeof(int));

	for(i = 0; i < tam; i++) {
		p[i] = i * 2;
	}

	print_separator();

	for(i = 0; i < tam; i++) {
		printf("p[%i] = %i\n", i, *(p+i));
	}

	// free memory area
	// free(p);
	// clear memory area
	// exit(0);

	/* ===== POINTERS FOR FUNCTIONS ===== */
	print_separator();
	testfunc("square root", sqrt);

	double (*f)(double); // pointer to receive a function

	print_separator();
	printf("Get summation\n");
	double n = 2;
	f = f_de_k;
	/* f = g_de_x; */
	printf("Result = %lf\n", sum_square(f, 1, n));

	/* ===== FILES ===== */
	FILE *fp;

	fp = fopen("file.txt", "r");
	//          file name   mode of using
	// modes: r (read), w (write), a (append)

	print_separator();
	if(fp == NULL) {
		printf("Failed to open the file\n");
	} else {
		printf("File opened successfully\n");
		fclose(fp); // free memory but pointer "fp" is still there
	}

	// functions
	// getc()    gets()    scanf()    printf()    putc()    puts()
	// fgetc()   fgets()   fscanf()   fprintf()   fputc()   fputs()
	// gets() exceeds the memory limit, it overrides memory
	// unget() removes a char from the pointer
	// function name is the address of the begining of it
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

int swap_pointer(int *a, int *b) {
	// a  = address of a
	// *a = value of a
	int tmp = *a;
	*a = *b;
	*b = tmp;
	printf("Inside SWAP_POINTER\n");
	printf("a = %d\n", *a);
	printf("b = %d\n", *b);
	printf("&a = %p\n", a);
	printf("&b = %p\n", b);
}

void testfunc(char *name, double (*funcPtr)()) {
	int c;
	printf("Testing func %s\n", name);
	for(c = 0; c < 20; ++c) {
		printf("%d %f\n", c, (funcPtr)((double)(c)));
	}
}

double sum_square(double (*f)(double), double m, double n) {
	double k, sum = 0;
	for(k = m; k<=n; k++) {
		sum += (*f)(k) * (*f)(k);
	}
	return sum;
}

double f_de_k(double k) {
	return(1.0/k);
}

double g_de_x(double x) {
	return(x);
}

void print_separator() {
	printf("\n====================\n\n");
}
