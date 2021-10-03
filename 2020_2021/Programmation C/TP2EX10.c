#include <stdio.h>
#include<stdlib.h>
#include <time.h>

int main()
{
    int n,nb,cptb=0,largeur,hauteur;
    float x;
    printf("Donner n:");
    scanf("%d",&n);
    printf("Donner le nombre de boule:");
    scanf("%d",&nb);
    printf("Donner largeur tronc:");
    scanf("%d",&largeur);
    printf("Donner longueur tronc:");
    scanf("%d",&hauteur);
    for(int i=0;i<n;i++)
    {
        for(int j=n-i-1;j>=0;j--)// ou bien for(int j=0; j<n-i-1;j++)
            printf(" ");
        for(int k=0;k<2*i+1;k++)
        {
            x=(float)rand()/(float)RAND_MAX; // position aléatoire du boule
            if(x<0.5 && cptb<nb)
            {
                cptb++;
                printf("O");
            }
            else
                printf("*");
        }
        printf("\n");
    }
    // affichage du tronc
    for(int i=0;i<hauteur;i++)
    {
        for(int j=0;j<n-(largeur/2);j++)
            printf(" ");
        for(int k=0;k<largeur;k++)
            printf("|");
        printf("\n");
    }
    return 0;
}
