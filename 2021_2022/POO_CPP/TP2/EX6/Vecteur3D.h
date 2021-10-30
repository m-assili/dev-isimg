#ifndef VECTEUR3D_H
#define VECTEUR3D_H


class Vecteur3D
{
    public:
        Vecteur3D(float x=0,float y=0,float z=0);
        ~Vecteur3D();
        void afficher();
        static Vecteur3D somme( const Vecteur3D& , const Vecteur3D& ); // pour éviter la création de copie inutile
        static Vecteur3D produit(const Vecteur3D&,const Vecteur3D&);    //il vaut mieux faire un passage par référence
        bool coincide(const Vecteur3D& );
        float norme()const;
      //  static Vecteur3D normax(const Vecteur3D,const Vecteur3D);
        static Vecteur3D* normax(const Vecteur3D*,const Vecteur3D*);
        static Vecteur3D& normax(Vecteur3D&, Vecteur3D&);

        float getX()const;
        float getY()const;
        float getZ()const;
        void setX(float);
        void setY(float);
        void setZ(float);


    private:
        float x,y,z;
};

#endif // VECTEUR3D_H
