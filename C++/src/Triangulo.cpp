#include "Triangulo.h"
#include "math.h"

Triangulo::Triangulo()
{
    //ctor
}

Triangulo::~Triangulo()
{
    //dtor
}

float Triangulo::perimetro()
{
    //El perimetro de un triangulo es la suma de todos sus lados
    return lado1 + lado2 + lado3;
}

float Triangulo::semiperimetro()
{
    //El semiperimetro de un triangulo es: la suma de todos sus lados dividido entre 2.
    return (lado1 + lado2 + lado3) / 2;;
}

float Triangulo::area()
{
    float a;
    //Si el triangulo tiene los tres lados iguales, entonces es un triangulo equilatero:
    if(lado1 == lado2 && lado1 == lado3)
    {
        //la formula para calcular el area de un triangulo equilatero es:
        a = sqrt(3) / 4 * lado1;//como todos los lados seran iguales no importa cual lado se tome...
        return a;//retornamos el valor de la operación.
    }
    //si el lado 1 es igual al lado 3 entonces es un triangulo escaleno
    else if(lado1 != lado2 && lado1 != lado3)
    {
        //la formula para calcular el area de un triangulo escaleno es: A=b*c/2
        a = (lado2 * lado3) / 2;
        return a;
    }
    else//Sino significa que el tringulo tiene solo dos lado iguales, y seria un trianguilo isósceles
    {
        //La formula para calcular el area de un triangulo isoceles es:
        //A = ( b * √(a^2 - (2^2 / 4)) ) / 2
        a = (lado2 * sqrt(pow(3, 2) - (pow(2, 2) / 4))) / 2;
        return a;
    }
}

void Triangulo::setLado1(float n)
{
    lado1 = n;
}

float Triangulo::getLado1()
{
    return lado1;
}

void Triangulo::setLado2(float n)
{
    lado2 = n;
}

float Triangulo::getLado2()
{
    return lado2;
}

void Triangulo::setLado3(float n)
{
    lado3 = n;
}

float Triangulo::getLado3()
{
    return lado3;
}
