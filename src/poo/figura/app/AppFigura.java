package poo.figura.app;

import poo.figura.dominio.Circulo;
import poo.figura.dominio.Cuadrado;
import poo.figura.dominio.Figura;
import poo.figura.dominio.triangulo.Triangulo;
import poo.figura.dominio.triangulo.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.List;


public class AppFigura {
    public static void main(String[] args){

        List<Figura> figuras = new ArrayList<>();
        Cuadrado cuadrado = new Cuadrado("Azul",true,30);
        Circulo circulo = new Circulo("Rojo",true,20);
        Triangulo triangulo = new Triangulo("Verde",true,4,5,2,3,4);
        Figura trianguloRectangulo = new TrianguloRectangulo("Verde",true,20,4,8,8,8,8,8);


        figuras.add(cuadrado);
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(trianguloRectangulo);

        System.out.println("...AREAS DE LAS FIGURAS EN LA LISTA...");
        cuadrado.area();
        circulo.area();
        triangulo.area();
        trianguloRectangulo.area();
        System.out.println("\n");

        System.out.println("...PERIMETROS DE LAS FIGURAS EN LA LISTA...");
        cuadrado.perimetro();
        circulo.perimetro();
        triangulo.perimetro();
        trianguloRectangulo.perimetro();

    }

}