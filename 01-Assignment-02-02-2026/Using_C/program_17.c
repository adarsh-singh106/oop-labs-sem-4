/* Program 17: Find the roots of a quadratic equation */

#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c, x1, x2, d;

    printf("For the equation: ax^2 + bx + c = 0\n");

    printf("Enter value of a : ");
    scanf("%lf", &a);

    printf("Enter value of b : ");
    scanf("%lf", &b);

    printf("Enter value of c : ");
    scanf("%lf", &c);

    if (a == 0) {
        printf("Not a quadratic equation");
        return 0;
    }

    d = b * b - 4 * a * c;

    if (d < 0) {
        printf("Roots are imaginary");
    }
    else {
        x1 = (-b + sqrt(d)) / (2 * a);
        x2 = (-b - sqrt(d)) / (2 * a);
        printf("Roots are:\nx1 = %.2lf\nx2 = %.2lf", x1, x2);
    }

    return 0;
}
