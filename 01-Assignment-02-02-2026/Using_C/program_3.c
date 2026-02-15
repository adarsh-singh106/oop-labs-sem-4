/* Program 3: Find the area of a triangle given three sides */

#include <stdio.h>
#include <math.h>

int main() {
    float a, b, c, area, s;

    printf("Enter three sides of the triangle:\n");
    scanf("%f %f %f", &a, &b, &c);

    // Check for valid triangle
    if (a + b > c && a + c > b && b + c > a) {

        // Heron's formula
        s = (a + b + c) / 2;
        area = sqrt(s * (s - a) * (s - b) * (s - c));

        printf("Area of the triangle = %.2f\n", area);
    } 
    else {
        printf("Invalid triangle\n");
    }

    return 0;
}
