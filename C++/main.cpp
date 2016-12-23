#include <iostream>
#include "Triangulo.h"

using namespace std;

int main()
{
    //Se crea un objeto de la clase Triangulo (Instanciaciación)
    Triangulo* obj = new Triangulo();

    float l1, l2, l3;//se definen 3 variable de tipo float "l1", "l2" y "l3"

    cout << "Digite lado 1" << endl;//Se pide el primer lado
    cin >> l1;//se guarda el primer lado en "l1"
    obj->setLado1(l1);//se llama al metodo modificador de lado 1 y se encapsula "l1"

    cout << "Digite lado 2" << endl;//Se pide el segundo lado
    cin >> l2;//se guarda el segundo lado en "l2"
    obj->setLado2(l2);//se llama al metodo modificador de lado 2 y se encapsula "l2"

    cout << "Digite lado 3" << endl;//Se pide el tercer lado
    cin >> l3;//se guarda el tercer lado en "l3"
    obj->setLado3(l3);//se llama al metodo modificador de lado 3 y se encapsula "l3"

    //Se muestra en pantalla el perimetro
    cout << "El perimetro es: " << obj->perimetro() << endl;

    //Se muestra en pantalla el semiperimetro
    cout << "El semiperimetro es: " << obj->semiperimetro() << endl;

    //Se muestra en pantalla el area
    cout << "El area es: " << obj->area() << endl;
    return 0;
}
