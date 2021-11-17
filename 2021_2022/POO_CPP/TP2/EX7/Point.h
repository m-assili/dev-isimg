#ifndef POINT_H
#define POINT_H


class Point
{
    public:
        Point(float x=0,float y=0); // constructeur d'initialisation
        Point(Point&); // constructeur de copie
        virtual ~Point();
        void afficher()const;
        friend bool egal(Point&,Point&);
        friend float distance(Point&,Point&);
        friend Point milieu(Point&,Point&);

    private:
        float x,y;
};

#endif // POINT_H
