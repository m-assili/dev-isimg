#include <stdio.h>
#include <stdlib.h>

int main()
{
    int nb1,nb2;
    char op;
    printf("Donner NB1:");
    scanf("%d",&nb1);
    printf("Donner NB2:");
    scanf("%d",&nb2);
    fflush(stdin);
    printf("Donner operation:");
    scanf("%c",&op);
    switch(op)
    {
        case '+':printf("%d + %d = %d\n",nb1,nb2,nb1+nb2);
        break;
        case '-':printf("%d - %d = %d\n",nb1,nb2,nb1-nb2);
        break;
        case '*':printf("%d * %d = %d\n",nb1,nb2,nb1*nb2);
        break;
        case '/':
            if(nb2==0)
                printf("Attention division par zero!!");
            else
                printf("%d / %d = %f\n",nb1,nb2,(float)nb1/nb2);
        break;
        default: printf("Operation inconnue");
    }


    return 0;
}
