int main()
{
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);

    (a%2 == 0) ? printf("The number entered is even."): printf("The number entered is odd.");
    return 0;
}
