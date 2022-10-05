//program 16
//swap numbers

#include<stdio.h>

int main()
{
    double first, second, temp ;

    printf("Enter first number: ");
    scanf("%lf", &first);
    printf("Enter Second number: ");
    scanf("%lf", &second);
    temp = first;
    first = second;
    second = temp;
    printf("After swapping first number equal to: %lf \n", first);
    printf("After Swapping second number equal to: %lf \n", second);
}
