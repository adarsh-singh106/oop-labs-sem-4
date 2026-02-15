/* Program 6: Find circumference and area of a circle given radius */

#include <stdio.h>

int main() {
    // area = pi *r*r
    // circum = 2 *pi *r
    float area,circum,r;
    const float pi = 3.14159;

    printf("Enter Your circle's Radius : ");
    scanf("%f",&r);

    area = pi*r*r;
    circum = 2*pi*r;

    printf("Area of Circle : %.2f\n",area);
    printf("Circumference of Circle : %.2f",circum);
    return 0;
}