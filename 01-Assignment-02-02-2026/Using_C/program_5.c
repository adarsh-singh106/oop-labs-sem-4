/* Program 5: Find the product of a set of real numbers */

#include <stdio.h>

int main() {
    int n ;
    printf("Total Numbers : ");
    scanf("%d",&n);

    if (n<1) {
        printf("Invalid Number");
        return 0 ;
    }

    float product = 1 ,temp;
    for (int i=0;i<n;i++){
        printf("Real No.(%d) : ",i+1);
        scanf("%f",&temp);
        product*=temp;
    }
    printf("Product of Given Numbers : %.2f",product);
    return 0;
}