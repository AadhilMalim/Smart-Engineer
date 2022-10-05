//program 15
//sizeof long etc

#include<stdio.h>
int main()
{
    int a;
    long b;
    long long c;
    double d;
    long double e;

    printf("Size of int is : %zu bytes \n",sizeof(a));
    printf("Size of long is : %zu bytes \n", sizeof(b));
    printf("Size of lonh long is : %zu bytes \n" , sizeof(c));
    printf("Size of double is : %zu bytes \n" , sizeof(d));
    printf("Size of long double is : %zu bytes \n" , sizeof(e));

    return 0;


}
