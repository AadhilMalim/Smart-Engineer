#include<stdio.h>

int main()
{
    float num1;
    double num2;

    printf("Enter a number : ");
    scanf("%f", &num1);

    printf("Enter a new number : ");
    scanf("%lf" , &num2);

    printf("num1 = %f", num1);

    printf("\n num2 = %lf", num2);

    return 0;

}
