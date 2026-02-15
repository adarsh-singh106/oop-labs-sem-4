/* Program 22: Implement binary search (User Input) */
#include <stdio.h>

int BinarySearch(int array[], int size, int value) {
    int low = 0, high = size - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (array[mid] == value)
            return mid;
        else if (array[mid] > value)
            high = mid - 1;
        else
            low = mid + 1;
    }
    return -1;
}

int main() {
    int n, value;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements in sorted order:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter element to search: ");
    scanf("%d", &value);

    int index = BinarySearch(arr, n, value);

    if (index != -1)
        printf("Element found at index %d\n", index);
    else
        printf("Element not found\n");

    return 0;
}
