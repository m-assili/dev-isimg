#include<iostream>
#include<cmath>
#include "Complexe.h"
#define sqr(a) (a)*(a)
using std::cout;
using std::endl;
Complexe::Complexe(double re,double im):ree(re),img(im)
{
}

Complexe::~Complexe()
{
    //dtor
}
void Complexe::afficher()
{
    cout << ree << "+" << img << "i" << endl;
}
double Complexe::module()
{
    return sqrt(sqr(ree)+sqr(img));
}
Complexe Complexe::conjuguer()
{
    Complexe c(ree,img);
    return c;
}
Complexe Complexe::operator+(Complexe c1)
{
    Complexe c(ree+c1.ree,img+c1.img);
    return c;
}
double Complexe::getRee() const
{
    return ree;
}

double Complexe::getImg() const
{
    return img;
}

