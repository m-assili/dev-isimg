#include <stdio.h>
#include <stdlib.h>

int main()
{
    int nb;
    do{
        printf("Donner un chiffre:");
        scanf("%d",&nb);
        switch(nb)
        {
            case 0:printf("Zero");break;
            case 1:printf("Un");break;
            case 2:printf("Deux");break;
            case 3:printf("Trois");break;
            case 4:printf("Quatre");break;
            case 5:printf("Cinq");break;
            case 6:printf("Six");break;
            case 7:printf("Sept");break;
            case 8:printf("Huit");break;
            case 9:printf("Neuf");break;
            default:printf("Erreur de saisie \n");
        }
    }while(nb<0 || nb>9);
    return 0;
}
