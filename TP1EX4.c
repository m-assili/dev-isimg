#include <stdio.h>
#include <stdlib.h>
//TP1 - Exercice 4
int main()
{
    printf("*********************************************************\n");
    printf("** La taille d'un char est %d octets soit %d bits\n",sizeof(char),sizeof(char)*8);
    printf("** La taille d'un int est %d octets soit %d bits\n",sizeof(int),sizeof(int)*8);
    printf("** La taille d'un long est %d octets soit %d bits\n",sizeof(long),sizeof(long)*8);
    printf("** La taille d'un float est %d octets soit %d bits\n",sizeof(float),sizeof(float)*8);
    printf("** La taille d'un double est %d octets soit %d bits\n",sizeof(double),sizeof(double)*8);

    printf("*********************************************************\n");
    return 0;
}
