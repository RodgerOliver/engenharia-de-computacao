#include <stdio.h>

int main() {


	int num = 100;

/*
	The scanf function places the value entered in the location of `num`.
	`&num` is the location of the variable `num`, and it is in hex code.

	Pointers are variables that store the address of other variables.
*/

	int *p = &num;

/*
	The pointer type must be the same as the variable type.
*/

	printf("num = %d\n", num);
	printf("&num = %x\n", &num);
	printf("*p = %d\n", *p);
	printf("p = %x\n", p);
	printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

/*
	Pointers should be initialized to NULL until they are assigned a valid location.

	Pointers and arrays

	The array name acts as a pointer to the first element.
*/

	int a[5] = {1, 3, 5, 7, 9};

	printf("a = %x\n", a);
	printf("&a[0] = %x\n", &a[0]);

	printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

	for(int i = 0; i<5; i++) {
		printf("a[%i]		= %d\n", i, a[i]);
		printf("*(a + %d)	= %d\n", i, *(a+i));
		printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
	}


/*
	Pointers on Functions

	With pointers functions can use the actual location of the variable.
*/

	int num1 = 26;
	int num2 = 18;
	printf("num1 = %d		num2 = %d\n", num1, num2);

	void swap(int *num1, int *num2) {
		int temp;
		temp = *num1;
		*num1 = *num2;
		*num2 = temp;
	}

	swap(&num1, &num2);

	printf("SWAP NUMBERS\n");
	printf("num1 = %d		num2 = %d\n", num1, num2);

	printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

/*
	Functions with Array Params
*/

	int add_elements(int *arr, int length) {
		int total = 0;
		int k;

		for(k = 0; k < length; k++) {
			total += a[k];
		}
		return total;
	}

	printf("Added elements = %d\n", add_elements(a, 5));

	printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

/*
	Functions That Return An Array
*/

	int *get_evens() {
		int i;
		int even = 0;
		static int nums[5];

		for(i = 0; i<5; i++) {
			nums[i] = even += 2;
		}
		return nums;
	}

	printf("5 Even Numbers\n");

	int *evens = get_evens();

	printf("{ ");
	for (int k = 0; k < 5; k++) {
		printf("%d ", evens[k]);
	}
	printf("}\n");

	return 0;
}
