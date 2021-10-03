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

    for(int i=0;i<10;i++)
        if(tab[i]>=10)
            cout << "[" << tab[i] << "] à la position " << i << endl;
    return 0;
}
