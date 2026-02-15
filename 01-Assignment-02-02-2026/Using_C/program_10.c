/* Program 10: Display the given integer in reverse */

// 7843 --> 3487

#include <stdio.h>
#include <stdlib.h> // get abs

int main() {
    int n,original,reverse = 0,temp;
    printf("Enter a Number : ");
    scanf("%d",&original);

    // for negative no.
    int sign = (original<0)?-1:1;
    n = abs(original);
    while (n>0){
        temp = n % 10;
        reverse = reverse*10 + temp;
        n/=10;
    }
    reverse*=sign;
    printf("Original Number : %d\n",original);
    printf("Reversed Number : %d\n",reverse);
    
    return 0;
}