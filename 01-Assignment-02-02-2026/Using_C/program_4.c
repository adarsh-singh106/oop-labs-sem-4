/* Program 4: Find the average of a set of integers */

#include <stdio.h>

int main() {
    int n ;
    printf("Enter Total Number of Integers : ");
    scanf("%d",&n);
    if (n < 1){
        printf("Invalid Number");
        return 0 ;
    }
    int array[n];
    float sum = 0;
    for (int i=0; i<n;i++){
        printf("Integer No.%d : ",i+1);
        scanf("%d",&array[i]);
        sum+=array[i];
    }
    printf("The average of given Integer : %.2f",(sum/n));


    return 0;
}
