/* Program 2: Convert temperature from Celsius to Fahrenheit */

#include <stdio.h>

int main() {
    float c,f;
    printf("Enter Temperture in Celsius : ");
    scanf("%f",&c);
    f = (c* 9/5) + 32 ;
    printf("%.2f Degree Celsius => %.2f Fahrenheit\n",c,f);
    return 0;
}