#ifndef COMPLEXE_H
#define COMPLEXE_H


class Complexe
{
    public:
        Complexe(double re=0,double im=0);
        ~Complexe();
        void afficher();
        double module();
        Complexe conjuguer();
        Complexe operator+(Complexe);
        double getRee()const;
        double getImg()const;

    private:
        double ree;
        double img;
};

#endif // COMPLEXE_H
