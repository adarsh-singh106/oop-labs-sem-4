/* Program 28: Implement matrix addition */

#include <stdio.h>


int main() {
    int rows,columns;
    printf("Lets Add a Matrix But First Tell Me the Order.\n");
    printf("Rows = ");
    scanf("%d",&rows);
    printf("columns = ");
    scanf("%d",&columns);
    int matrix[rows][columns];
    int matrix1[rows][columns];
    int matrix2[rows][columns];
    //  get matrix - 1
    printf("Info For Matrix - 1 :\n");
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            printf("Enter the element x%d%d : ",i+1,j+1);
            scanf("%d",&matrix1[i][j]);
        }
    }
    //  get matrix - 2
    printf("Info For Matrix - 2 :\n");
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            printf("Enter the element x%d%d : ",i+1,j+1);
            scanf("%d",&matrix2[i][j]);
        }
    }
    // Add the above
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            matrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    // Print them
    printf("Resultant Matrix:\n");
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            printf("%d ",matrix[i][j]);
        }
        printf("\n");
    }
    

    return 0;
}