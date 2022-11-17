#include <iostream>
#include "Etudiant.h"

using namespace std;

int main()
{
    string nom;
    int n;
    cout << "Donner le nom:";
    cin >> nom;
    cout << "Donner le nombre de note:";
    cin >> n;
    Etudiant e1(nom,n);
    
    e1.saisie();
    e1.affiche();
    cout << "Resultat:";
    if(e1.admis()==true)
        cout<< "Admis";
    else
        cout << "Redouble";
    return 0;
}
