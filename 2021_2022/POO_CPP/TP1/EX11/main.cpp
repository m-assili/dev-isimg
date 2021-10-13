#include <iostream>


using namespace std;

void permutation(int& x, int& y){
    int aux;

    aux=x;
    x=y;
    y=aux;
}
int main()
{
    int a=9,b=21;
    cout << "a=" << a << " b=" << b << endl;
    permutation(a,b);
    cout << "a=" << a << " b=" << b << endl;
    return 0;
}
