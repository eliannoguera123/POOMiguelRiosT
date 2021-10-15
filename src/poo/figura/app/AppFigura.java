package poo.figura.app;

import poo.figura.dominio.Circulo;
import poo.figura.dominio.Cuadrado;
import poo.figura.dominio.Figura;
import poo.figura.dominio.triangulo.Triangulo;
import poo.figura.dominio.triangulo.TrianguloEquilatero;
import poo.figura.dominio.triangulo.TrianguloEscaleno;
import poo.figura.dominio.triangulo.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.List;

public class AppFigura {

    public static void mostrarAreas(List<Figura> figuras){
        figuras.forEach(figu -> {
            figu.area();
        });
    }

    public static void mostrarPeriemtros(List<Figura> figuras){
        figuras.forEach(figu -> {
            figu.perimetro();
        });
    }

    public static void main(String[] args){

        List<Figura> figuras = new ArrayList<>();
        Cuadrado cuadrado = new Cuadrado("Azul",true,30);
        Circulo circulo = new Circulo("Rojo",true,5);
        Triangulo triangulo = new Triangulo("Verde",true,4,5,2,3,4);
        Figura trianguloRectangulo = new TrianguloRectangulo("Amarillo",true,20,4,8,5,3,1,8);
        Triangulo trianguloEquilatero = new TrianguloEquilatero("Azul",true,3,2,6,4,25);
        Triangulo trianguloEscaleno = new TrianguloEscaleno("Rojo",true,20,4,8,5,10);

        figuras.add(cuadrado);
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(trianguloRectangulo);
        figuras.add(trianguloEquilatero);
        figuras.add(trianguloEscaleno);

        System.out.println("...AREAS DE LAS FIGURAS EN LA LISTA...");
        mostrarAreas(figuras);
        System.out.println("\n");
        System.out.println("...PERIMETROS DE LAS FIGURAS EN LA LISTA...");
        mostrarPeriemtros(figuras);




        /*System.out.println("...AREAS DE LAS FIGURAS EN LA LISTA...");
        cuadrado.area();
        circulo.area();
        triangulo.area();
        trianguloRectangulo.area();
        System.out.println("\n");

        System.out.println("...PERIMETROS DE LAS FIGURAS EN LA LISTA...");
        cuadrado.perimetro();
        circulo.perimetro();
        triangulo.perimetro();
        trianguloRectangulo.perimetro();*/

    }

}