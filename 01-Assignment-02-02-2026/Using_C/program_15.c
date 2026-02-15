/* Program 15: Check whether a number is prime */

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    printf("Enter a Number : ");
    scanf("%d", &n);

    if (n <= 1) {
        printf("Not a Prime Number");
        return 0;
    }

    int limit = sqrt(n);

    for (int i = 2; i <= limit; i++) {
        if (n % i == 0) {
            printf("%d is Not Prime", n);
            return 0;
        }
    }

    printf("%d is Prime", n);
    return 0;
}
