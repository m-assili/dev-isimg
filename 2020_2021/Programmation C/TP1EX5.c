#include <stdio.h>
#include <stdlib.h>
//TP1 - Exercice 5 -

int main()
{
    int a,b,aux;
    printf("Donner a:");
    scanf("%d",&a);
    printf("Donner b:");
    scanf("%d",&b);
    printf("Avant: a=%d et b=%d\n",a,b);
    aux=a;
    a=b;
    b=aux;
    printf("Apres: a=%d et b=%d \n",a,b);
    return 0;
}
