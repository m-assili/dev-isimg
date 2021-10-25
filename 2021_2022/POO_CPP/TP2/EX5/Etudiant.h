#ifndef ETUDIANT_H
#define ETUDIANT_H

#include<iostream>

class Etudiant
{
    public:
        Etudiant();
        Etudiant(std::string);
        Etudiant(const Etudiant&);
        virtual ~Etudiant();
        int getMatricule()const;
        std::string getNom()const;
        void setNom(std::string);
        void saisie();
        void affiche();
        double moyenne();
        bool admis();
        bool comparer(Etudiant&);




    private:
        static int matricule;
        std::string nom;
        int nbNotes;
        double* tabNotes;
};

#endif // ETUDIANT_H
