package poo.figura.dominio.triangulo;

public class TrianguloRectangulo extends Triangulo {

    private double catetoA;
    private double catetoB;
    private double resultadoPerimetro;

    public TrianguloRectangulo(String color, boolean relleno, double base, double altura, double lado1, double lado2, double lado3, double catetoA, double catetoB) {
        super(color, relleno, base, altura, lado1, lado2, lado3);
        this.catetoA = catetoA;
        this.catetoB = catetoB;
    }

    private double perimetroConCatetos(double catetoA, double catetoB){
        double hipotenusa = Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
        resultadoPerimetro = catetoA+catetoB+hipotenusa;
        System.out.println("El PERIMETRO del triangulo de cateto A: "+catetoA+" cateto B: "+catetoB+" es: "+resultadoPerimetro);
        return resultadoPerimetro;
    }

}
