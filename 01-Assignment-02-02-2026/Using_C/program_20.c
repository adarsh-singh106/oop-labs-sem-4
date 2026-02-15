/* Program 20: Find sum of n numbers using array */

#include <stdio.h>

int main() {
    int array[5] = {1,2,5,63,0},sum = 0;
    for (int i=0;i<5;i++){
        sum = sum + array[i];
    }
    printf("Sum = %d",sum);
        

    return 0;
}
