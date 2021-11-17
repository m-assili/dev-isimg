#include<cmath>
#include "Robot.h"
#define carre(a) (a)*(a)
using std::cout;
using std::endl;
using std::string;
Robot::~Robot()
{
    //dtor
}
Robot::Robot(string name, int x, int y, int portee, bool estMort)
:name(name),abs(x),ord(y),portee(portee),estMort(estMort)
{
}

void Robot::deplacer(int x, int y)
{
    this->abs+=x;
    this->ord+=y;
}

void Robot::afficher()
{
    cout << name << "\t(" << abs << ", " << ord << ") Portee:" << portee << "\t Est Mort?" << std::boolalpha << estMort << endl;
}

bool Robot::estAPorteeDe(Robot robot)
{
    float distance = sqrt(carre(this->abs - robot.abs)+carre(this->ord - robot.ord));
    cout << "Distance:" << distance << endl;
    if(distance < this->portee)
        return true;
    else
        return false;
}


void Robot::setEstMort(bool etat)
{
    this->estMort = etat;
    cout << this->name << " est Mort ...." << endl;
}

void Robot::tuer(Robot robot)
{
    if(this->estAPorteeDe(robot))
        robot.setEstMort(true);
    else
        cout << robot.name << " n'est pas sur votre Radar !!" << endl;

}
