/* Program 31: Find Nth Fibonacci number using recursion */

// F(x) = F(x-1) + F(x-2) , Given F(0) = 0 & F(1) =1

#include <stdio.h>

int Fibonacci(int n) {
    if (n < 0)
        return -1;   
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;

    return Fibonacci(n - 1) + Fibonacci(n - 2);
}

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    int result = Fibonacci(n);

    if (result == -1)
        printf("Fibonacci is not defined for negative numbers.");
    else
        printf("Fibonacci number of %d is %d.", n, result);

    return 0;
}
