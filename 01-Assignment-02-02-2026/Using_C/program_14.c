/* Program 14: Display numbers from 100 to 150 whose digit sum is even */

#include <stdio.h>

int main() {
    int temp,sum;
    for (int i =100 ;i<=150;i++){
        temp = i ;
        sum = 0;
        while (temp > 0)
        {
            sum+=(temp%10);
            temp/=10;
        }
        if (sum%2 == 0) printf("%d\n",i);
        
    }

    return 0;
}