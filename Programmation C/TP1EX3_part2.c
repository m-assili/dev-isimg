#include <stdio.h>
#include <stdlib.h>
//TP1 - Exercice 3 - entiers

int main()
{
    float a,b;
    printf("Donner a:");
    scanf("%f",&a);
    printf("Donner b:");
    scanf("%f",&b);
    printf("%.2f * %.2f = %.3f\n",a,b,a*b);
    printf("%f + %.2f = %.4f\n",a,b,a+b);
    return 0;
}
