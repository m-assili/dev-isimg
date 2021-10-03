#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b, choix;
    while(1){
        printf("*** Calculatrice *****\n");
        printf("*1. Addition         *\n");
        printf("*2. Soustraction     *\n");
        printf("*3. Multiplication   *\n");
        printf("*4. Division         *\n");
        printf("*5. Quitter          *\n");
        printf("**********************\n");
        printf("Donnez votre choix?");
        scanf("%d",&choix);
        if(choix!=5){
        printf("Donner A et B:");
        scanf("%d%d",&a,&b);
        switch(choix)
        {
            case 1: printf("%d + %d = %d \n",a,b,a+b);break;
            case 2: printf("%d - %d = %d \n",a,b,a-b);break;
            case 3: printf("%d * %d = %d \n",a,b,a*b);break;
            case 4: b==0 ? printf("Division impossible par zero\n"):printf("%d / %d = %.2f \n",a,b,(float)a/b);
                    break;
            default: printf("code operation invalide\n");

        }
        printf("Tapez une touche pour continuer...\n");
        fflush(stdin); // vider le stdin qui contient la touche entrée
        getchar(); // donne la possibilité à l'utilisateur pour visualiser l'affichage avant d'effacer la console
        system("cls"); // effacer la console d'affichage
        }
        else
            exit(0); // arrête l'exécution du programme
    }



    return 0;
}
