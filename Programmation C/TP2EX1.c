#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b;
    printf("Donner a:");
    scanf("%d",&a);
    printf("Donner b:");
    scanf("%d",&b);
    if(b<a)
    {
        printf("%d > %d\n",a,b);
    }
    else
    {
        printf("%d > %d\n",b,a);
    }
    return 0;
}
