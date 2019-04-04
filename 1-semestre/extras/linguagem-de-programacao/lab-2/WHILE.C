                                /* Chapter 3 - Program 1 - WHILE.C */
/* This is an example of a "while" loop */

#include <stdio.h>

int main()
{
int count;

   count = 0;
   while (count < 6) 
   {
      printf("The value of count is %d\n", count);
      count = count + 1;
   }

   return 0;
}



/* Result of execution

The value of count is 0
The value of count is 1
The value of count is 2
The value of count is 3
The value of count is 4
The value of count is 5

*/
