#include<iostream>
#include "Point.h"

Point::~Point()
{
    //dtor
}
Point::Point(float x, float y):x(x),y(y){
}

Point::Point(Point& p):x(p.x),y(p.y){
}

void Point::afficher() const
{
    std::cout << "P(" << x << "," << y << ")" << std::endl;
}
