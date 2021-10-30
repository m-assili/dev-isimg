#include <iostream>
#include <cmath>
#include "Vecteur3D.h"
using std::cout;
using std::endl;
Vecteur3D::Vecteur3D(float x,float y,float z):x(x),y(y),z(z)
{
    //ctor
}

Vecteur3D::~Vecteur3D()
{
    //dtor
}
float Vecteur3D::getX() const
{
    return x;
}
float Vecteur3D::getY() const
{
    return y;
}
float Vecteur3D::getZ() const
{
    return z;
}
void Vecteur3D::setX(float x)
{
    this->x = x;
}
void Vecteur3D::setY(float y)
{
    this->y = y;
}
void Vecteur3D::setZ(float z)
{
    this->z = z;
}
void Vecteur3D::afficher()
{
    cout << "(" << x << "," << y << "," << z << ")" << endl;
}
Vecteur3D Vecteur3D::somme(const Vecteur3D& v1, const Vecteur3D& v2)
{
    Vecteur3D v;
    v.setX(v1.getX() + v2.getX());
    v.setY(v1.getY() + v2.getY());
    v.setZ(v1.getZ() + v2.getZ());
    return v;
}
Vecteur3D Vecteur3D::produit(const Vecteur3D& v1,const Vecteur3D& v2)
{
    Vecteur3D v(v1.getX()*v2.getX(),v1.getY()*v2.getY(),v1.getZ()*v2.getZ());
    return v;
}
bool Vecteur3D::coincide(const Vecteur3D& v)
{
    return this->x == v.getX() && this->y == v.getY() && this->z == v.getZ();
}
float Vecteur3D::norme()const
{
    return sqrt(this->x*this->x+this->y*this->y+this->z*this->z);
}
/*Vecteur3D Vecteur3D::normax(const Vecteur3D v1,const Vecteur3D v2)
{
    return v1.norme()>v2.norme()?v1:v2;
}*/
Vecteur3D* Vecteur3D::normax(const Vecteur3D* v1,const Vecteur3D* v2)
{
    Vecteur3D vres;
    if(v1->norme()>v2->norme())
    {
        vres.setX(v1->getX());
        vres.setY(v1->getY());
        vres.setZ(v1->getZ());
    }

    else
    {
        vres.setX(v2->getX());
        vres.setY(v2->getY());
        vres.setZ(v2->getZ());
    }

    return &vres;
}
 Vecteur3D& Vecteur3D::normax( Vecteur3D& v1, Vecteur3D& v2)
{
    return v1.norme() > v2.norme()?v1:v2;
}
