package poo.figura.dominio;

public class Cuadrado extends Figura{
    private double lado1;
    private double lado2;

    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area(){
        return lado1*lado2;
    }

    @Override
    public double perimetro() {
        return (lado1*2)+(lado2*2);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }


}
