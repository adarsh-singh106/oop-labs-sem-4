/* Program 36: Sum even numbers from 1 to 100 using for loop */

#include <stdio.h>

int main() {
    int sum= 0;
    for(int i = 1;i<=100;i++){
        if (i%2 == 0)
            sum+=i;
    }
    printf("Sum-> %d",sum);
    return 0;
}