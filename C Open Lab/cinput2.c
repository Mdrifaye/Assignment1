#include<stdio.h>
int main()
{
    float number1;
    double number2;

    printf("Enter a number : ");
    scanf("%f",&number1);
    printf("Enter another number : ");
    scanf("%lf",&number2);

    printf("Number 1 = %f\n",number1);
    printf("another number is = %lf",number2);
    return 0;
}