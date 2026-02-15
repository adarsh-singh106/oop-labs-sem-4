/* Program 19: Find factorial of a number using recursion */
#include <stdio.h>

int factorial(int num){
    if (num == 0 || num == 1){
        return 1;
    }
    return num * factorial(num - 1);
}


int main() {
    int num;
    printf("Enter the Number : ");
    scanf("%d",&num);
    printf("Factorial of %d is %d",num,factorial(num));
    return 0;
}