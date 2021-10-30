#include <iostream>
#include "Vecteur3D.h"
using namespace std;

int main()
{
    Vecteur3D vec1(1,2,3),vec2(1,6,3);
    vec1.afficher();
    vec2.afficher();
   Vecteur3D::somme(vec1,vec2).afficher();
    Vecteur3D::produit(vec1,vec2).afficher();
    if(vec1.coincide(vec2)==true)
        cout << "meme vecteur ..." << endl;
    else
        cout << "different vecteur ..." << endl;
    cout << "Norme:" << vec1.norme() << endl;
    cout << "Norme:" << vec2.norme() << endl;
    cout << "normax:";
    Vecteur3D v;
    v=Vecteur3D::normax(vec1,vec2);
    v.afficher();

    cout << "Hello world!" << endl;
    return 0;
}
