package poo.figura.dominio.triangulo;

public class TrianguloRectangulo extends Triangulo {

    private double base;
    private double altura;
    private double resultadoArea;
    private double catetoA;
    private double catetoB;
    private double resultadoPerimetro;

    public TrianguloRectangulo(String color, boolean relleno, double base, double altura, double lado1, double lado2, double lado3, double base1, double catetoA, double catetoB) {
        super(color, relleno, base, altura,lado1,lado2,lado3);
        this.base = base1;
        this.altura = altura;
        this.catetoA = catetoA;
        this.catetoB = catetoB;
    }

    @Override
    public double area(){
        resultadoArea = (base*altura)/2;
        System.out.println("El AREA del triangulo Rectangulo de base "+base+" y altura "+altura+" es: "+resultadoArea);
        return resultadoArea;
    }


    @Override
    public double perimetro() {
        double hipotenusa = Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
        resultadoPerimetro = catetoA+catetoB+hipotenusa;
        System.out.println("El PERIMETRO del triangulo Rectangulo de cateto A: "+catetoA+" y cateto B: "+catetoB+" es: "+resultadoPerimetro);
        return resultadoPerimetro;
    }

}
