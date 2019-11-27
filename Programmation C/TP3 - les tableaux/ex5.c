#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A[100],n,val;
    printf("Donner N:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        printf("A[%d]:",i);
        scanf("%d",&A[i]);
    }
    printf("Donner la valeur a inseree:");
    scanf("%d",&val);

    printf("Avant insertion:\nA={");
    for(int i=0;i<n;i++)
        printf("%d, ",A[i]);
    printf("}\n");
    int j=0;
    int trouve=0;
    // boucle de recherche de la position d'insertion
    while(j<n && trouve==0)
    {
        if(A[j]>val)
            trouve=1;
        else
            j++;
    }
    // boucle de décalage à droite avant insertion
    int k;
    for(k=n+1;k>j;k--)
        A[k]=A[k-1];
    // insertion de la valeur
    A[k]=val;
    // augmentation de la taille du tableau
    n=n+1;
    // affichage après insertion
    printf("Apres insertion\nA={");
    for(int i=0;i<n;i++)
        printf("%d, ",A[i]);
    printf("}\n");
    return 0;
}
