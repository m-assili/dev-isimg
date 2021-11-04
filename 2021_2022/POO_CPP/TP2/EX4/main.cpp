#include <iostream>

using namespace std;

void incrementerParAdresse(int* x){
    (*x)++;
}
void incrementerParReference(int&x)
{
    x++;
}
 void permuterParAdresse(int *x,int *y)
 {
     int aux;
     aux=*x;
     *x=*y;
     *y=aux;
 }
 void permuterParReference(int&x,int&y)
 {
    int aux=x;
    x=y;
    y=aux;
 }
int main()
{
    int a=1,b=2;
    incrementerParAdresse(&a);
    incrementerParReference(b);
    cout << "a=" << a << "\t b=" << b << endl;
    permuterParAdresse(&a,&b);
    cout << "Permutation par adresse: a=" << a << "\t b=" << b << endl;
    permuterParReference(a,b);
    cout << "Permutation par reference a=" << a << "\t b=" << b << endl;
    return 0;
}
