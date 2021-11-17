#ifndef ROBOT_H
#define ROBOT_H

#include<iostream>
class Robot
{
    public:
        Robot(std::string nom ,int x = 0,int y = 0,int portee = 1, bool estMort = false);
        ~Robot();
        void deplacer(int,int);
        void afficher();
        bool estAPorteeDe(Robot);
        void tuer(Robot);
        void setEstMort(bool);

    private:
        std::string name;
        int abs;
        int ord;
        int portee;
        bool estMort;
};

#endif // ROBOT_H
