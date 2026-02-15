/* Program 12: Find the sum of digits of an integer using while loop */

#include <stdio.h>

int main() {
    int num,sum = 0;
    printf("Enter your Number : ");
    scanf("%d",&num);
    if (num < 0) 
        num = -num;
    while (num > 0)
    {
        sum+=(num%10);
        num/=10;
    }
    printf("Sum of Digits of Given number is : %d",sum);
    


    return 0;
}