/* Program 1: Check whether the given number is even or odd */
#include <stdio.h>

int main() {
    int n;
    printf("Enter a Number : ");
    scanf("%d",&n);
    if (n%2 == 0){
        printf("%d is Even Number",n);
    }
    else{
        printf("%d is Odd Number",n);
    }
    return 0;
}
