#include <iostream>
#include <string>

using namespace std;


int main()
{
   string entree,sortieDate="",sortieHeure="";
   do{
        cout << "Donner une date sous forme d'une chaine:" << endl;
        cin >> entree;
   }while(entree.length()!=12);
   sortieDate = entree.substr(0,2)+"/"+entree.substr(2,2)+"/"+entree.substr(4,4);
   sortieHeure = entree.substr(8,2)+":"+entree.substr(10,2);
   cout << sortieDate << "  " << sortieHeure << endl;
    return 0;
}
