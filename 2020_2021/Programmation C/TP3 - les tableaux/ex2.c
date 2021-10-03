#include <stdio.h>
#include <stdlib.h>

int main()
{
    float T[20]; // declaration d'un tableau de réel
    // boucle de remplissage
    for(int i=0;i<20;i++)
    {
        printf("Donner T[%d]:",i);
        scanf("%f",&T[i]);
    }

    // boucle d'affichage
    for(int i=0;i<20;i++)
        printf("T[%d]=%.2f\n",i,T[i]);
    return 0;
}
