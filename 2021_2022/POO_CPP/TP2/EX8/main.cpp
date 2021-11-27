#include <iostream>
#include"Complexe.h"
using namespace std;
Complexe operator+(Complexe cp,double reel)
{
    Complexe rc(cp.getRee()+reel,cp.getImg());
    return rc;
}
Complexe operator+(double reel,Complexe cp)
{
    Complexe rc(cp.getRee()+reel,cp.getImg());
    return rc;
}
int main()
{
    Complexe c1(1.3,4);
    c1.afficher();
    Complexe c2(1,1);
    c2.afficher();
    Complexe c=c1+c2;
    c.afficher();
    Complexe cr=c+3;
    cr.afficher();
    cr=6+cr;
    cr.afficher();
    return 0;
}
