#include <iostream>
#include <cmath>
#include "Point.h"
#define caree(a) (a)*(a)
using namespace std;
bool egal(Point& p1,Point& p2)
{
    return p1.x==p2.x && p1.y == p2.y;
}
float distance(Point& p,Point& q){
    return sqrt(caree(q.x - p.x)+caree(q.y-p.y));
}
Point milieu(Point& p1,Point&p2){
    Point pmilieu((p1.x+p2.x)/2,(p1.y+p2.y)/2);
    return pmilieu;
}
int main()
{
    Point a(0,3),b(1,2);
    a.afficher();
    b.afficher();
    cout << "A == B :" << boolalpha << egal(a,b) << endl;
    cout << "dist(AB) :" << distance(a,b) << endl;
    cout << "le milieu du segment AB est " ;
    milieu(a,b).afficher();

    return 0;
}
