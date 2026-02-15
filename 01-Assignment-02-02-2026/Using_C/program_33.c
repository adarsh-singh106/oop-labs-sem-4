/* Program 33: Implement a basic calculator */
#include <stdio.h>

float addition(float a, float b){
    return a + b;
}

float subtraction(float a, float b){
    return a - b;
}

float multiplication(float a, float b){
    return a * b;
}

float division(float a, float b){
    return a / b;
}

void GetInfo(int *a, int *b){
    printf("Enter Number 1 : ");
    scanf("%d", a);
    printf("Enter Number 2 : ");
    scanf("%d", b);
}

int main() {
    int a, b;
    char choice;

    printf("Welcome to Basic Calculator\n");

    while (1) {
        printf("\nEnter Your Choice:\n");
        printf("1. Addition -> a\n");
        printf("2. Subtraction -> s\n");
        printf("3. Multiplication -> m\n");
        printf("4. Division -> d\n");
        printf("5. Exit -> e\n");
        printf("Choice: ");

        scanf(" %c", &choice);   // space before %c is IMPORTANT

        switch (choice) {
            case 'a':
                GetInfo(&a, &b);
                printf("Addition of %d and %d is %.2f\n", a, b, addition(a, b));
                break;

            case 's':
                GetInfo(&a, &b);
                printf("Subtraction of %d and %d is %.2f\n", a, b, subtraction(a, b));
                break;

            case 'm':
                GetInfo(&a, &b);
                printf("Multiplication of %d and %d is %.2f\n", a, b, multiplication(a, b));
                break;

            case 'd':
                GetInfo(&a, &b);
                if (b == 0) {
                    printf("Error: Denominator cannot be zero!\n");
                } else {
                    printf("Division of %d and %d is %.2f\n", a, b, division(a, b));
                }
                break;

            case 'e':
                printf("Thanks For Using Us :)\n");
                return 0;

            default:
                printf("Invalid Choice!\n");
        }
    }
}
