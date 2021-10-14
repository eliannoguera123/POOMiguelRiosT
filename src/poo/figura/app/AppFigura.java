package poo.figura.app;

import poo.figura.dominio.Circulo;
import poo.figura.dominio.Cuadrado;
import poo.figura.dominio.Triangulo;

public class AppFigura {
    public static void main(String[] args){

        Cuadrado cuadrado = new Cuadrado("Azul",true,30);
        cuadrado.area();
        cuadrado.perimetro();

        Circulo circulo = new Circulo("Rojo",true,20);
        circulo.area();
        circulo.perimetro();

        Triangulo triangulo = new Triangulo("Amarillo",true,10,5);
        triangulo.area();
        triangulo.perimetro();

    }

}