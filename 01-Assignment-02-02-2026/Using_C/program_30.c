/* Program 30: Check leap year */

#include <stdio.h>
int isLeapYear(int year){
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        return 1;
    }
    return 0;
}

int main() {
    int year;
    printf("Enter Any Valid Year ! : ");
    scanf("%d",&year);

    if (year <= 0){
        printf("Invalid Year !");
        return 0;
    }
    if (isLeapYear(year)){
        printf("%d is Leap Year.",year);
    }
    else{
        printf("%d is not Leap Year.",year);
    }
    return 0;
}