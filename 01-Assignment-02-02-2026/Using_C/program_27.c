/* Program 27: Check whether a string is palindrome */

#include <stdio.h>
#include <string.h>
int isPalindrome(char string[]){
    int size = strlen(string);
    int low = 0;
    int high = size -1 ;
    while (low < high){
        if(string[low] != string[high]){
            return 0;
        }
        low++;
        high--;
    }
    return 1;
}

int main() {
    char string[100];
    printf("Enter the String : ");
    scanf("%s",string);
    int res = isPalindrome(string);
    if (res)
        printf("The Given String is Valid Palindrome.");
    else{
        printf("The Given String is Not Valid Palindrome");
    }
    return 0;
}