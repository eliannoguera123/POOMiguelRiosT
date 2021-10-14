package poo.figura.dominio.triangulo;

import poo.figura.dominio.Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    private double resultadoArea;
    private double resultadoPerimetro;

    public Triangulo(String color, boolean relleno, double base, double altura, double lado1, double lado2, double lado3) {
        super(color, relleno);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area(){
        resultadoArea = (base*altura)/2;
        System.out.println("El AREA del triangulo de base "+base+" y altura "+altura+" es: "+resultadoArea);
        return resultadoArea;
    }

    @Override
    public double perimetro() {
        resultadoPerimetro = lado1+lado2+lado3;
        System.out.println("El PERIMETRO del triangulo de lado 1: "+lado1+" lado 2: "+lado2+" y lado 3: "+lado3+" es: "+resultadoPerimetro);
        return resultadoPerimetro;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
}
