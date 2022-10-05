//program_13
//quotient and remainder
#include<stdio.h>

int main()
{
    int dividend, divisor,quotient,remainder;

    printf("Enter the Dividend: ");
    scanf("%d", &dividend);
    printf("Enter the Divisor: ");
    scanf("%d", &divisor);

    //compute quotient
    quotient = dividend/divisor;
    printf("The Quotient is : %d \n", quotient);

    //compute remainder
    remainder = dividend%divisor;
    printf("The Remainder is: %d", remainder);

    return 0;
}
