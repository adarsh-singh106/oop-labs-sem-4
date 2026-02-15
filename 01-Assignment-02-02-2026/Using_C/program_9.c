/* Program 9: Find the average of 5 numbers using while loop */

#include <stdio.h>

int main() {
    float sum=0.0,nums[5] = {1,23,6.5,8,-10};
    int i = 0;
    while (i<5)
    {
        sum+=nums[i];
        i++;
    }
    printf("The Average of Nums is : %.2f",sum/5);
    
    
    return 0;
}