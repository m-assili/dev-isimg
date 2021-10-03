#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Donner N:");
    scanf("%d",&n);
    for(int i=0;i<n;i++) // boucle 1 pour afficher les lignes
    {
        for(int j=0;j<n-i;j++) // boucle interne pour afficher les *
            printf("*");
        printf("\n"); // retour à la ligne pour afficher la ligne d'* suivante
    }
    return 0;
}
