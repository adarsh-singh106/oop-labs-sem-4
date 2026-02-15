/* Program 29: Implement matrix multiplication */


#include <stdio.h>


int main() {
    int n1,m1,n2,m2;
    printf("Enter the shape of First Matrix : ");
    scanf("%d %d",&n1,&m1);
    printf("Enter the shape of Second Matrix : ");
    scanf("%d %d",&n2,&m2);
    if (m1 != n2){
        printf("Matrix Multiplcation is not Possible for Given Shape");
        return 0;
    }
    if(n1 <= 0 || m1 <= 0 || n2 <= 0 || m2 <= 0){
    printf("Invalid matrix dimensions");
    return 0;
}


    // Get the Input for the matrix
    int matrix1[n1][m1];
    int matrix2[n2][m2];
    printf("------- Fill For Matrix 1 : -------\n");
    for(int i = 0;i < n1;i++){
        for(int j = 0;j < m1;j++ ){
            printf("Enter Item No. (%d,%d) : ",i+1,j+1);
            scanf("%d",&matrix1[i][j]);
        }
    }

    printf("------- Fill For Matrix 2 : -------\n");
    for(int i = 0;i < n2;i++){
        for(int j = 0;j < m2;j++ ){
            printf("Enter Item No. (%d,%d) : ",i+1,j+1);
            scanf("%d",&matrix2[i][j]);
        }
    }

    // Performing Multiplication 
    int result[n1][m2],temp;
    for(int i = 0;i < n1;i++){
        for(int j = 0;j < m2;j++ ){
            temp = 0;
            for (int k = 0;k < m1 ; k++ ){
                temp = temp +  (matrix1[i][k]* matrix2[k][j]);
            }
            result[i][j] = temp;
        }
    }

    // Printing the Resulatant Matrix
    printf("----- Result Matrix ----- ");
    for(int i = 0;i < n1;i++){
        for(int j = 0;j < m2;j++ ){
            printf("%d ",result[i][j]);
        }
        printf("\n");
    }

    
    return 0;
}