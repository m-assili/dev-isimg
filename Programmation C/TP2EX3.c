#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b;
    printf("Donner a:");
    scanf("%d",&a);
    printf("Donner b:");
    scanf("%d",&b);
    if((a<0 && b<0)||(a>0 && b>0))
        printf("Produit positif\n");
    else
        printf("Produit negatif\n");
    return 0;
}
