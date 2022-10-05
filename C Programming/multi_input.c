#include<stdio.h>

int main()

{
    int a;
    float b;

    printf("Enter a number and then a float: ");

    scanf("%d%f", &a, &b);

    printf("The Entered numbers are %d and %f.", a, b);
    return 0;
}
