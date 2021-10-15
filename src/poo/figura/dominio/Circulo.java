package poo.figura.dominio;

public class Circulo extends Figura {
    private double radio;
    private double resultadoArea;
    private double resultadoPerimetro;

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    @Override
    public double area() {
        resultadoArea = (Math.PI)*(radio*radio);
        System.out.println("El AREA del circulo de radio="+radio+" es:"+resultadoArea);
        return resultadoArea;
    }

    @Override
    public double perimetro() {
        resultadoPerimetro=(2*radio)*Math.PI;
        System.out.println("El PERIMETRO del circulo de radio="+radio+" es:"+resultadoPerimetro);
        return resultadoPerimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
