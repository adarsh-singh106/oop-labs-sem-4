/* Program 23: Count odd numbers in an array */

int isOdd(int num){
    if (num%2 == 0){
        return 0;
    }
    return 1;
}

#include <stdio.h>

int main() {
    int n;
    printf("Enter Length of Array : ");
    scanf("%d",&n);

    int array[n];
    for(int i=0;i<n;i++){
        printf("Enter No.%d : ",i+1);
        scanf("%d",&array[i]);
    }
    int count = 0;
    for(int i=0;i<n;i++){
        if (isOdd(array[i])){
            count++;
        }
    }
    printf("Total No. of Odd Number in array are %d",count);
    return 0;
}