#include <iostream>

using namespace std;

int main()
{
    int a=10;
    int& ref_a=a;
    int* p_a=&a;
    cout << "variable a contient " << a << " a l'adresse " << &a << endl;
    cout << "variable ref_a contient " << ref_a << " a l'adresse " << &ref_a << endl;
    cout << "variable p_a contient " << *p_a << " a l'adresse " << p_a << endl;

    return 0;
}
