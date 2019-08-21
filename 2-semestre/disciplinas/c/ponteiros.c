#include <stdio.h>
# include <stdlib.h>
# include <math.h>

int swap(int a, int b);
int swap_pointer(int *a, int *b); // pointer as parameter
void testfunc(char *name, double (*funcPtr)());
double sum_square(double (*f)(double), double m, double n);
double f_de_k(double k);
double g_de_x(double x);
void print_separator();
int * get_evens(); // function that returns an array (pointer)

int main() {
	/* ===== BASIC ===== */
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

	/* ===== STRINGS, ARRAYS AND POINTERS ===== */
	/* char s[] == char *s */
	/* an array is a pointer to the first element */
	/* *(s1 + i) == *(s1 + sizeof(char) * i) */
	print_separator();
	char string[80] = "Unitau";
	char *pstring = string;
	int i;
	printf("===== ARRAY\n");
	for(i = 0; string[i] != '\0'; i++) {
		printf("%c", string[i]);
	}
	printf("\n");

	printf("===== POINTER\n");
	for(i = 0; *(pstring+i) != '\0'; i++) {
		printf("%c", *(pstring+i)); // add i to the address to jump to the next address
	}
	printf("\n");

	printf("===== OTHER\n");
	for(i = 0; *(pstring+i) != '\0'; i++) {
		printf("%c", *(pstring + sizeof(char) * i));
	}
	printf("\n");

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

	/* ===== POINTERS AND FUNCTIONS ===== */

	print_separator();
	printf("===== PRINT EVENS\n");
	int *even_arr, k;
	// function that returns an array
	even_arr = get_evens(); /* get first 5 even numbers */
	for (k = 0; k < 5; k++) {
		printf("%d\n", even_arr[k]);
	}

	print_separator();
	testfunc("square root", sqrt);
	printf("Get summation\n");
	// function pointer
	double (*f)(double); // pointer to receive a function
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

// pointer as parameter
int swap_pointer(int *a, int *b) {
	// a  = address of a
	// *a = value of a
	int tmp = *a;
	*a = *b; // changes the actual variable value
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
		printf("√%d = %0.2f\n", c, (funcPtr)((double)(c)));
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

// function that returns an array (pointer)
int * get_evens() {
	static int nums[5];
	int k;
	int even = 0;
	for (k = 0; k < 5; k++) {
		nums[k] = even += 2;
	}
	return (nums);
}
