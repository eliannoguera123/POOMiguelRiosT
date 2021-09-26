package poo.desafio.dominio;
import java.util.List;
import javax.swing.*;

public class Calculadora {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/uco.png");
    private String marcaCalculadora;
    private int numero;
    private int n;
    private int resultado;

    public Calculadora(String marcaCalculadora) {
        this.marcaCalculadora = marcaCalculadora;

    }

    //METODOS
    //MOSTRAR NUMERO
    private static void mostrarnumero(float resultado){
         JOptionPane.showMessageDialog(null,"El total de la suma es:"+resultado);
    }

    //INGRESAR NUMERO
    public int ingresarnumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        return numero;
    }
    //SUMAR N NUMEROS
    public int sumar(int n){
        int sumaT=0;
        for(int i=0;i<n;i++){
            numero = ingresarnumero();
            sumaT = sumaT+numero;
        }
        mostrarnumero(sumaT);
        return sumaT;
    }

    //RESTAR N NUMEROS
    public int restar(int n){
        int restaT=0;
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
    public int multiplicar(int n){
        int multiplicacionT=1;
        for(int i=0;i<n;i++){
            numero = ingresarnumero();
            multiplicacionT=multiplicacionT*numero;
        }
        mostrarnumero(multiplicacionT);
        return multiplicacionT;
    }
    //DIVISION N NUMEROS
    public float dividir(int n){
        float divisionT=1;
        numero = ingresarnumero();
        divisionT=numero/divisionT;
        for(int i=1;i<n;i++){
            numero = ingresarnumero();
            divisionT=(float)(divisionT/numero);
        }
        mostrarnumero(divisionT);
        return divisionT;
    }
    //GETTER
    public String getMarcaCalculadora() {
        return marcaCalculadora;
    }

    public int getNumero() {
        return numero;
    }

    public int getResultado() {
        return resultado;
    }

}
