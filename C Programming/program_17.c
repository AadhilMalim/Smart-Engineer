//program 17
//swap without temp

#include<stdio.h>

int main()
{
    double a,b;
    printf("Enter a: ");
    scanf("%lf", &a);
    printf("Enter b: ");
    scanf("%lf", &b);

    a= a-b;
    b= a+b;
    a= b-a;

    printf("After swapping , a = %.2lf\n", a);
    printf("After Swapping, b =%.2lf\n", b);
}
