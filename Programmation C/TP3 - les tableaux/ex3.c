#include <stdio.h>
#include <stdlib.h>
#define TAILLE_TAB 5
int main()
{
    int U[TAILLE_TAB],V[TAILLE_TAB];
    // remplissage de U
    printf("Remplissage de U:\n");
    for(int i=0;i<TAILLE_TAB;i++)
    {
        printf("Donner U[%d]:",i);
        scanf("%d",&U[i]);
    }
    // remplissage de V
    printf("Remplissage de V:\n");
    for(int i=0;i<TAILLE_TAB;i++)
    {
        printf("Donner V[%d]:",i);
        scanf("%d",&V[i]);
    }
    // calcule du produit scalaire
    int prodScal=0;
    for(int i=0;i<TAILLE_TAB;i++)
        prodScal+=U[i]*V[i];

    printf("U*V=%d\n",prodScal);

    return 0;
}
