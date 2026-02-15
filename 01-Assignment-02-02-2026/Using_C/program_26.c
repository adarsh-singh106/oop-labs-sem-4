/* Program 26: Delete an element from an array by index */

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

int DeleteItem(int array[],int size,int index){
    if (index<0 || index >=size){
        return -1;
    }
    int temp = array[index];
    for(int i=index+1;i < size;i++){
        array[i-1] = array[i];
    }
    return temp;
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
        printf("\nChoose Among the Options!\n1. Insert Item\n2. Delete Item\n3. print array\n4. exit\nEnter Choice : ");
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
            printf("Enter index for item to be Deleted.");
            scanf("%d",&pos);
            res = DeleteItem(array,size,pos);
            if (res != -1){
                printf("%d is delted succesfully",res);
                size--;
            }
            else{
                printf("Index not valid");
            }
            break;
        case 3:
            printArray(array,size);
            break;
        case 4:
            return 0;
            break;
        default:
            break;
        }
    }
}
    