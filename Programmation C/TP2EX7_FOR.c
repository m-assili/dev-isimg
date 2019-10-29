#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,val,somme=0,produit=1;
    printf("Donner le nombre d'entiers:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        printf("Donner une valeur:");
        scanf("%d",&val);
        somme+=val;
        produit*=val;
    }
    printf("La somme est %d\n",somme);
    printf("Le produit est %d\n",produit);
    printf("La moyenne est %.3f\n",(float)somme/n);
    return 0;
}
