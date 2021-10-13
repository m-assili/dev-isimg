#include <iostream>


using namespace std;
void afficher(int tab[],const int& taille){
    cout << endl;
    for(int i=0;i<taille; i++){
        cout << "[" << tab[i] << "]";
    }
}
void trier(int tab[],const int& taille){
    for(int i=0,aux;i<taille-1;i++)
        for(int j=i+1;j<taille;j++)
            if(tab[i]>tab[j])
            {
                aux=tab[j];
                tab[j]=tab[i];
                tab[i]=aux;
            }
}
int* inserer(int *tab,int val,int& taille){
    int* tab2=new int[taille+1];
    int i,j;
    for(i=0; i<taille && tab[i]<val;i++)
        tab2[i]=tab[i];
    tab2[i]=val;
    for(j=i+1;j<taille+1;j++,i++)
        tab2[j]=tab[i];

    taille++; // passage par référence donc la taille de la fonction main est incrémentée

    return tab2;

}

int main()
{
    int taille=5;
    int tab[taille]; // prévoir une case supplémentaire pour l'insertion

    for(int i=0;i<taille;i++)
    {
        cout << "Donner TAB[" << i << "]";
        cin >> tab[i];
    }

    trier(tab,taille);
    afficher(tab,taille);
    cout << endl;
    int* tab2=inserer(tab,8,taille); // un  nouveau tableau est retourné
    cout << taille << endl;
    delete[] tab; // libérer le premier tableau
    afficher(tab2,taille);
    return 0;
}
