#include <iostream>

using namespace std;

int main()
{
    int* x;
    x = new int(10);
    cout << "x=" << *x << " a l'adresse " << x << endl;
    return 0;
}
