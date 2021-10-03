#include <iostream>
#include <string>

using namespace std;


int main()
{
   int *tab = new int[10];
   // boucle de remplissage
    for(int i = 0; i < 10; i++){
        cout << "Donner T[" << i << "]:";
        cin >> tab[i];
    }
    int val,i=0;
    bool existe=false;
    cout << "Donner la valeur à rechercher:" << endl;
    cin >> val;

    while(!existe && i<10)
    {
        if(tab[i]==val)
        {
            cout << "[" <<val << "] existe à la position " << i <<" et va être supprimer " << endl;
            existe = true;
            for(; i < 9 ; i++)
                tab[i] = tab[i+1];
            tab[i] = 0;
        }

        i++;
    }

    if(!existe)
        cout << val << " n'existe pas dans ce tableau!!" << endl;
    else
        for(int j=0;j<10;j++)
            cout << "[" << tab[j] << "]";
    return 0;
}
