/* Program 11: Find the geometric mean of n numbers */

/* Program 11: Find the geometric mean of n numbers */

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    printf("Total Numbers : ");
    scanf("%d", &n);

    double product = 1.0, temp;

    for (int i = 0; i < n; i++) {
        printf("Enter Number x%d : ", i + 1);
        scanf("%lf", &temp);
        product *= temp;
    }

    double gm = pow(product, 1.0 / n);
    printf("Geometric Mean of Given Numbers is %.2f", gm);

    return 0;
}
