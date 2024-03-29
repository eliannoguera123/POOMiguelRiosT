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

    //RESTAR N NUMEROS
    public double restar(List<Double> numeros){
        double cont=0;
        double resultado=0;
        for (double num: numeros) {
            if(cont==0){
                resultado=num;
                cont++;
            }else {
                resultado=resultado-num;
                cont++;
            }

        }
        return resultado;
    }

    //DIVIDIR N NUMEROS
    public double dividir(List<Double> numeros, boolean redondear){
        double cont = 1;
        double resultado = 1;
        for (double num: numeros) {
            if(cont==1){
                resultado=num;
                cont++;
            }else {
                resultado=resultado/num;
                cont++;
            }
        }

        if(redondear==true){
            return Math.round(resultado);
        }else{

            return resultado;
        }
    }

    //GETTER
    public String getMarcaCalculadora() {
        return marcaCalculadora;
    }


}
