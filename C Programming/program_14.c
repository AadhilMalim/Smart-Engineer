//program 14
//Sizeof

#include<stdio.h>
int main()
{
    int intType;
    float floatType;
    double doubleType;
    char charType;

    printf("The Size of int is : %zu bytes \n", sizeof(intType));
    printf("The Size of float is : %zu bytes \n", sizeof(floatType));
    printf("The Size of double is : %zu bytes \n", sizeof(doubleType));
    printf("The Size of char is : %zu bytes \n", sizeof(charType));

    return 0;
}
