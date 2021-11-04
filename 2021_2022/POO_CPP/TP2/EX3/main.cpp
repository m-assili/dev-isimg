#include <iostream>

using namespace std;

bool egaleParValeur(int x, int y)
{
    return x==y;
}
bool egaleParReference(int& x,int&y)
{
    return x==y;
}
bool egaleParAdresse(int*x,int*y)
{
    return *x==*y;
}
int main()
{
    int a,b;
    cout << "Donner a:"<< endl;
    cin >> a;
    cout << "Donner b:"<< endl;
    cin >> b;
    cout << "Passage par valeur :"<< a << "==" << b << " est " << boolalpha << egaleParValeur(a,b) << endl;
    cout << "Passage par reference:"<<a << "==" << b << " est " << boolalpha << egaleParReference(a,b) << endl;
    cout << "Passage par reference:"<<a << "==" << b << " est " << boolalpha << egaleParAdresse(&a,&b) << endl;

    return 0;
}
