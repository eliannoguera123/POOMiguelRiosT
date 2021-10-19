package poo.figura.app;

import poo.figura.dominio.Circulo;
import poo.figura.dominio.Cuadrado;
import poo.figura.dominio.Figura;
import poo.figura.dominio.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.List;

public class AppFigura {

    public static void mostrarAreas(List<Figura> figuras){
        figuras.forEach(figu -> {
            System.out.println("Se calculará el área de " + figu);
            System.out.println("Área=" + figu.area()+"\n");
        });
    }

    public static void mostrarPeriemtros(List<Figura> figuras){
        figuras.forEach(figu -> {
            System.out.println("Se calculará el perímetro de " + figu);
            System.out.println("Perímetro=" + figu.perimetro() + "\n");
        });
    }

    public static void main(String[] args){

        List<Figura> figuras = new ArrayList<>();
        Cuadrado cuadrado = new Cuadrado(30,5);
        Circulo circulo = new Circulo(5);
        Figura TrianguloRectangulo = new TrianguloRectangulo(10, 20);

        figuras.add(cuadrado);
        figuras.add(circulo);
        figuras.add(TrianguloRectangulo);


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