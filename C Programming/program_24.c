//program 24
//sum of n num

#include<stdio.h>
int main()
{
    int num, count, sum=0 ;

    printf("Enter a number : ");
    scanf("%d", &num);

    for(count = 1; count <= num; ++count)
    {
        sum+=count;
    }
    printf("Sum is : %d", sum);
}
