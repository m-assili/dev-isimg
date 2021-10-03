#include <iostream>
#include <string>

using namespace std;
const double FACTEUR=1.609;
double convert(double val, char unit)
{
    switch(unit){
    case 'k':
    case 'K': return val/FACTEUR;
    case 'm':
    case 'M': return val*FACTEUR;
    default: return -1;
    }
}

int main()
{
    double distance;
    char unite;
    cout << "Donner la distance:" << endl;
    cin >> distance;
    cout << "Donner l'unité (k / m):" << endl;
    cin >> unite;
    string str = (unite=='k'||unite=='K')?"miles":"kilometres";
    cout << distance << " " << unite << "=" << convert(distance,unite) << str << endl;

    return 0;
}
