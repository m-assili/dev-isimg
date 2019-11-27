#include <stdio.h>
#include <stdlib.h>

int main()
{
    int tab[100],N,max,min,posMax,posMin;
    // saisie des nombres à stocker dans tab
    do{
    printf("Donner le nombre d'entier a saisir:");
    scanf("%d",&N);
    }while(N>100 || N<0);
   if(N!=0)
    {
        // remplissage de tab
        for(int i=0;i<N;i++)
        {
            printf("Donner TAB[%d]:",i);
            scanf("%d",&tab[i]);
        }
        // recherche dans tab
        max=min=tab[0];
        posMax=posMin=0;
        for(int i=1;i<N;i++)
        {
            if(tab[i]<min)
            {
                min=tab[i];
                posMin=i;
            }
            if(tab[i]>max)
            {
                max=tab[i];
                posMax=i;
            }
        }
        // affichage
        printf("Max = %d à la position %d\n",max,posMax);
        printf("Min = %d à la position %d\n",min,posMin);
   }

    return 0;
}
