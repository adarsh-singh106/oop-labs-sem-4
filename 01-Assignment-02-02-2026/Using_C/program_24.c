/* Program 24: Find largest number in an array without built-in functions */

int max(int array[],int size){
    int maxNum = -9999,n=0;
    // get size of array
    for(int i=0;i<size;i++){
        if (array[i]>maxNum){
            maxNum = array[i];
        }
    }
    return maxNum;
}

#include <stdio.h>

int main() {
    int array[6] = {11,3,-6,5,9,2};
    printf("The Maximum No. is %d",max(array,6));

    return 0;
}