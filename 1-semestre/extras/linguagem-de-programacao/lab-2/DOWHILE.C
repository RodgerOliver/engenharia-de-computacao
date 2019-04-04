                              /* Chapter 3 - Program 2 - DOWHILE.C */
/* This is an example of a do-while loop */

#include <stdio.h>

int main()
{
int i;

   i = 0;
   do 
   {
      printf("The value of i is now %d\n", i);
      i = i + 1;
   } while (i < 5);

   return 0;
}



/* Result of execution

The value of i is now 0
The value of i is now 1
The value of i is now 2
The value of i is now 3
The value of i is now 4

*/
