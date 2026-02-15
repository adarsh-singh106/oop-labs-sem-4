/* Program 18: Print numbers from n to 0 using recursion */

#include <stdio.h>

void WriteNum(int num) {
    if (num < 0) return;
    printf("%d\n", num);
    WriteNum(num - 1);
}

int main() {
    int n ;
    printf("Give the Number : ");
    scanf("%d",&n);
    WriteNum(n);
    return 0;
}
