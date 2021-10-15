package poo.figura.dominio;

public class Cuadrado extends Figura{
    private double lado;
    private double resultadoArea;
    private double resultadoPerimetro;

    public Cuadrado(String color, boolean relleno, double lado) {
        super(color, relleno);
        this.lado = lado;

    }

    @Override
    public double area(){
        resultadoArea = lado*lado;
        System.out.println("El AREA del cuadrado de lado "+lado+" es:"+resultadoArea);
        return resultadoArea;
    }

    @Override
    public double perimetro() {
        resultadoPerimetro = (lado+lado+lado+lado);
        System.out.println("El PERIMETRO del cuadrado de lado "+lado+" es:"+resultadoPerimetro);
        return resultadoPerimetro;
    }

    public double getAncho() {
        return lado;
    }

    public void setAncho(double ancho) {
        this.lado = ancho;
    }



}
