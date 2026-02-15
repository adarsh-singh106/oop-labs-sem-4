/* Program 34: Generate random number and check even or odd */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main() {
    srand(time(NULL)); //imp

    int r = rand();
    printf("Random number: %d", r);
    if (r%2 == 0)
        printf("\nRandom No. is Even");
    else
        printf("\nRondom No. is odd");
    return 0;
}
