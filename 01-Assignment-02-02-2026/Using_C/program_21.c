/* Program 21: Implement Linear Search */

#include <stdio.h>

int LinearSearch(int array[], int value, int size) {
    for (int i = 0; i < size; i++) {
        if (array[i] == value)
            return i;
    }
    return -1;
}

int main() {
    int n;
    printf("Enter Length Of Your Array: ");
    scanf("%d", &n);

    int array[n];

    for (int i = 0; i < n; i++) {
        printf("Enter your No.%d : ", i + 1);
        scanf("%d", &array[i]);
    }

    int choice;
    while (1) {
        printf("\nWanna find a Number from your array?\nYes = 1\nNo = 0\n");
        scanf("%d", &choice);

        switch (choice) {
        case 1: {
            int x, index;
            printf("Enter value to search: ");
            scanf("%d", &x);

            index = LinearSearch(array, x, n);

            if (index != -1)
                printf("Element found at index %d\n", index);
            else
                printf("Element not found\n");
            break;
        }
        case 0:
            return 0;
        default:
            printf("Invalid choice\n");
        }
    }
}
