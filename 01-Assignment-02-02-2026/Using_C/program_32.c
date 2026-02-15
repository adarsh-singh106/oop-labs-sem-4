/* Program 32: Print Fibonacci series using iteration */

#include <stdio.h>

int main() {
    int n;
    int a = 0, b = 1, next;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid number of terms\n");
        return 0;
    }

    printf("Fibonacci Series: ");

    for (int i = 1; i <= n; i++) {
        printf("%d ", a);
        next = a + b;
        a = b;
        b = next;
    }

    return 0;
}
