//se incluira el paquete "math" para utilizar el metodo sqrt()
//y el paquete pow para el metodo pow(), los utilizaremos para poder realizar
//la raiz cuadrada y elevar un numero a un exponente, ya que es importante
//para calcular el area, perimetro y altura del triangulo.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Triangulo
{
    //se definen los atributos privados:
    private double lado1;//lado 1 de tipo double
    private double lado2;//lado 2 de tipo double
    private double lado3;//lado 3 de tipo double
    
    Triangulo()
    {
        //Se le asigna el valor de 0 a lado1, lado2 y lado3 en el constructor
        lado1 = 0;
        lado2 = 0;
        lado3 = 0;
    }

    public double perimetro()
    {
        //El perimetro de un triangulo es la suma de todos sus lados
        return lado1 + lado2 + lado3;
    }

    public double semiperimetro()
    {
        //El semiperimetro de un triangulo es: la suma de todos sus lados dividido entre 2.
        return (lado1 + lado2 + lado3) / 2;
    }

    public double area()
    {
        double a;
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
            a = (lado2 * lado3) / 2;//retornamos el valor de la operación.
            return a;
        }
        else//Sino significa que el tringulo tiene solo dos lado iguales, y seria un trianguilo isósceles
        {
            //La formula para calcular el area de un triangulo isoceles es:
            //A = ( b * √(a^2 - (2^2 / 4)) ) / 2
            a = (lado2 * sqrt(pow(3, 2) - (pow(2, 2) / 4))) / 2;
            return a;//retornamos el valor de la operación.
        }
    }

    //Implementacion de los metodos Setters y Getters de los atributos de la clase
    public void setLado1(double n)
    {
        lado1 = n;
    }

    public double getLado1()
    {
        return lado1;
    }

    public void setLado2(double n)
    {
        lado2 = n;
    }

    public double getLado2()
    {
        return lado2;
    }

    public void setLado3(double n)
    {
        lado3 = n;
    }

    public double getLado3()
    {
        return lado3;
    }
}