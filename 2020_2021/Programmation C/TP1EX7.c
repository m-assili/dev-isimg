#include <stdio.h>
#include <stdlib.h>
//TP1 - Exercice 7
#define PI 3.14
int main()
{
    float rayon,volume;
    printf("Donner le rayon R:");
    scanf("%f",&rayon);
    volume = (4*PI/3)*rayon*rayon*rayon;

    printf("Le volume du sphere=%f\n",volume);
    return 0;
}
