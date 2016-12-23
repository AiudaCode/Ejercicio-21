#ifndef TRIANGULO_H
#define TRIANGULO_H


class Triangulo
{
    public:
        Triangulo();
        virtual ~Triangulo();

        float perimetro();
        float semiperimetro();
        float area();

        void setLado1(float n);
        float getLado1();
        void setLado2(float n);
        float getLado2();
        void setLado3(float n);
        float getLado3();
    protected:

    private:
        float lado1;
        float lado2;
        float lado3;
};

#endif // TRIANGULO_H
