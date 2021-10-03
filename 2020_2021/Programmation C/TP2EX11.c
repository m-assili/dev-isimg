#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("X*Y | ");
    for(int i=0;i<10;i++)
        printf("%3d",i);
    printf("\n");
    printf("------");
    for(int i=0;i<10;i++)
        printf("---");
    printf("\n");
    for(int i=0;i<10;i++)
    {
        printf("%3d | ",i);
        for(int j=0;j<10;j++)
            printf("%3d",i*j);
        printf("\n");
    }

    return 0;
}
