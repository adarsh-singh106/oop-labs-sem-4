/* Program 25: Insert an element at a given position in an array */

#include <stdio.h>
int Insert(int Item, int Pos, int array[], int size, int maxSize){
    if (size >= maxSize)
        return -1;

    if (Pos < 0 || Pos > size)
        return 0;

    for (int i = size; i > Pos; i--){
        array[i] = array[i-1];
    }

    array[Pos] = Item;
    return 1;
}

void printArray(int array[],int size){
    for(int i=0;i<size;i++){
        printf("%d->",array[i]);
    }

}

int main() {
    int size;
    printf("Enter size of your array : ");
    scanf("%d",&size);

    // +5 empty spcaes for insertion
    int array[size+5];
    for(int i=0;i<size;i++){
        printf("Enter No.%d : ",i+1);
        scanf("%d",&array[i]);
    }
    int choice ,item,pos,res;
    while (1)
    {
        printf("\nChoose Among the Options!\n1. Insert Item\n2. print array\n3. exit\nEnter Choice : ");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            printf("Enter Value : ");
            scanf("%d",&item);
            printf("Enter position : ");
            scanf("%d",&pos);

            res = Insert(item,pos,array,size,size+5);
            if(res!=-1){
                if (res){
                    printf("Item Added Succesfully");
                    size++;

                }
                else{
                    printf("Error");
                }
            }
            else{
                printf("Array size is full");
            }

            
            break;
        case 2:
            printArray(array,size);
            break;
        case 3:
            return 0;
            break;
        default:
            break;
        }
    }
    


    return 0;
}