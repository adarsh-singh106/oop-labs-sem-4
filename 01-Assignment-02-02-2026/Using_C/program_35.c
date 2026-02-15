/* Program 35: Find the sum of even numbers */

#include <stdio.h>

int main() {
    int n, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);

    if (n < 2) {
        printf("Sum -> 0");
        return 0;
    }

    for (int i = 2; i <= n; i += 2) {
        sum += i;
    }

    printf("Sum -> %d", sum);
    return 0;
}
