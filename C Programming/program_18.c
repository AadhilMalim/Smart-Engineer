//program 18
//if stmnt

#include<stdio.h>
int main()
{
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);

    if(number <0){
        printf("You Entered this number : %d\n", number);
    }
    printf("If statement is easy.");
    return 0;
}
