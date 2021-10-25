#include "Etudiant.h"
using std::cout;
using std::cin;
using std::endl;
int Etudiant::matricule=0;
Etudiant::Etudiant()
{
    matricule++;
    this->nom = "";
    this->nbNotes = 0;
    this->tabNotes = new double[5];
}
Etudiant::Etudiant(std::string nom):nom(nom),nbNotes(0)
{
    matricule++;
    this->tabNotes = new double[5];
}

Etudiant::Etudiant(const Etudiant& e):nom(e.nom),nbNotes(e.nbNotes)
{
    matricule++;
    this->tabNotes = new double[5];
    for(int i=0;i<5;i++)
        tabNotes[i]=e.tabNotes[i];
}

int Etudiant::getMatricule() const
{
    return this->matricule;
}

std::string Etudiant::getNom() const
{
    return this->nom;
}

void Etudiant::setNom(std::string nom)
{
    this->nom = nom;
}

void Etudiant::saisie()
{
    for(int i=0; i<5; i++){
        std::cout << "Donner une note:";
        std::cin >> tabNotes[i];
    }
}

void Etudiant::affiche()
{
    cout << "Matricule:" << this->matricule
     << "  Nom:" << this->nom << endl;
     cout << "Liste des notes:" << endl;
     for(int i=0;i<5;i++)
        cout << "[" << tabNotes[i] << "] ";
     cout << "Moyenne:" << this->moyenne() << endl;

}

double Etudiant::moyenne()
{
    double s=0;
    for(int i=0;i<5;i++)
        s+=tabNotes[i];
    return s/5;
}

bool Etudiant::admis()
{
    return this->moyenne()>=10;
}

bool Etudiant::comparer(Etudiant& e)
{
    return this->moyenne()== e.moyenne();
}

Etudiant::~Etudiant()
{
    //dtor
}
