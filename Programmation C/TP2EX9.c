#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Donner N:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i;j++)
            printf("*");
        printf("\n");
    }
    return 0;
}
