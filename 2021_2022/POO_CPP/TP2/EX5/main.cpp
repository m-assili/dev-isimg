#include <iostream>
#include "Etudiant.h"

using namespace std;

int main()
{

    Etudiant e1;
    e1.setNom("Assili");
    e1.saisie();
    e1.affiche();
    cout << "Resultat:";
    if(e1.admis()==true)
        cout<< "Admis";
    else
        cout << "Redouble";
    return 0;
}
