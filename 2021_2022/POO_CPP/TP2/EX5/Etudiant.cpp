#include "Etudiant.h"
using std::cout;
using std::cin;
using std::endl;
int Etudiant::cpt=0;
Etudiant::Etudiant()
{
    this->matricule=++cpt;
    this->nom = "";
    this->nbNotes = 0;
    this->tabNotes = new double[nbNotes];
}
Etudiant::Etudiant(std::string nom, int nb):nom(nom),nbNotes(nb)
{
    this->matricule = ++cpt;
    this->tabNotes = new double[nbNotes];
}

Etudiant::Etudiant(const Etudiant& e):nom(e.nom),nbNotes(e.nbNotes)
{
    this->matricule = ++cpt;
    this->tabNotes = new double[nbNotes];
    for(int i=0;i<nbNotes;i++)
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
    for(int i=0; i<nbNotes; i++){
        std::cout << "Donner une note:";
        std::cin >> tabNotes[i];
    }
}

void Etudiant::affiche()
{
    cout << "Matricule:" << this->matricule
     << "  Nom:" << this->nom << endl;
     cout << "Liste des notes:" << endl;
     for(int i=0;i<nbNotes;i++)
        cout << "[" << tabNotes[i] << "] ";
     cout << "Moyenne:" << this->moyenne() << endl;

}

double Etudiant::moyenne()
{
    double s=0;
    for(int i=0;i<nbNotes;i++)
        s+=tabNotes[i];
    return s/nbNotes;
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
