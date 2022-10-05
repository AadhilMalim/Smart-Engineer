//program 19
//check odd or even

#include<stdio.h>
int main()
{
    int number;
    printf("Enter a number : ");
    scanf("%d", &number);

    if(number%2==0){
        printf("The number Entered %d is even",number );
    }

    else{
        printf("The number Entered %d is odd", number);
        }

}
