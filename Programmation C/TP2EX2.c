#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a,b,c,max;
    printf("Donner a:");
    scanf("%d",&a);
    printf("Donner b:");
    scanf("%d",&b);
    printf("Donner c:");
    scanf("%d",&c);
    if(b<=a && c<=a)
        max=a;
    else
        if(a<=c && b<=c)
            max=c;
        else
            if(c<=b && a<=b)
                max=b;

    printf("Max=%d\n",max);
    return 0;
}
