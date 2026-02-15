/* Program 8: Check whether the given integer is a multiple of both 5 and 7 */

#include <stdio.h>

int main() {
    int num;

    printf("Enter your number: ");
    scanf("%d", &num);

    if (num % 5 == 0 && num % 7 == 0) {
        printf("Yes, it is a multiple of both 5 and 7");
    } else {
        printf("No, it is not a multiple of both 5 and 7");
    }

    return 0;
}