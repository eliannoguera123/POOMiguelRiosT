package poo.figura.dominio.triangulo;

public class TrianguloEquilatero extends Triangulo {

    private double base;
    private double altura;
    private double resultadoArea;
    private double resultadoPerimetro;
    private double lado1;
    private double lado2;
    private double lado3;

    public TrianguloEquilatero(String color, boolean relleno, double base, double altura, double lado1, double lado2, double lado3) {
        super(color, relleno, base, altura, lado1, lado2, lado3);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area(){
        resultadoArea = (base*altura)/2;
        System.out.println("El AREA del triangulo Equilatero de base="+base+" y altura="+altura+" es:"+resultadoArea);
        return resultadoArea;
    }


    @Override
    public double perimetro() {
        resultadoPerimetro = lado1+lado2+lado3;
        System.out.println("El PERIMETRO del triangulo Equilatero de lado1="+lado1+" lado2="+lado2+" y lado3="+lado3+" es:"+resultadoPerimetro);
        return resultadoPerimetro;
    }


}
