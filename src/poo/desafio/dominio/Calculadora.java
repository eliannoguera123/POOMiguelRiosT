package poo.desafio.dominio;
import java.util.List;
import javax.swing.*;

public class Calculadora {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/uco.png");
    private String marcaCalculadora;


    public Calculadora(String marcaCalculadora) {
        this.marcaCalculadora = marcaCalculadora;

    }

    //METODOS

    //SUMAR N NUMEROS
    public double sumar(List<Double> numeros){
        double resultado = 0;
        for(double num: numeros){
            resultado+=num;
        }
        return resultado;
    }

    //MULTIPLICAR N NUMEROS
    public double multiplicar(List<Double> numeros){
        double resultado = 1;
        for(double num: numeros){
            resultado*=num;
        }
        return resultado;
    }

    /*//RESTAR N NUMEROS
    public double restar(int n){
        double restaT=0;
        for(int i=0;i<n;i++){
            numero = ingresarnumero();
            if(i>0){
                numero*=-1;
            }
            restaT+=numero;
        }
        mostrarnumero(restaT);
        return restaT;
    }
    //MULTIPLICAR N NUMEROS
    public double multiplicar(int n){
        double multiplicacionT=1;
        for(int i=0;i<n;i++){
            numero = ingresarnumero();
            multiplicacionT=multiplicacionT*numero;
        }
        mostrarnumero(multiplicacionT);
        return multiplicacionT;
    }
    //DIVISION N NUMEROS
    //d
    public double dividir(int n){
        double divisionT=1;
        numero = ingresarnumero();
        divisionT=numero/divisionT;
        for(int i=1;i<n;i++){
            numero = ingresarnumero();
            divisionT=(double) (divisionT/numero);
        }
        mostrarnumero(divisionT);
        return divisionT;
    }*/

    //GETTER
    public String getMarcaCalculadora() {
        return marcaCalculadora;
    }


}
