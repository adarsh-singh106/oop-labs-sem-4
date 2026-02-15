/* Program 7: Check whether the given integer is a multiple of 5 */

#include <stdio.h>

int main() {
    int num ;
    printf("Enter Your Number : ");
    scanf("%d",&num);

    if (num%5 == 0){
        printf("yes,It is mutiple of 5");
    }
    else{
        printf("No, It is not Multiple of 5");
    }
    return 0;
}