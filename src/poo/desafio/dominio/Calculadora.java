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
    //INGRESAR NUMERO
    public int ingresarnumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        return numero;
    }
    //MOSTRAR NUMERO
    private static void mostrarnumero(int numero){
        JOptionPane.showMessageDialog(null,numero,"Calculadora",JOptionPane.QUESTION_MESSAGE,icono);
    }


    //SUMAR N NUMEROS
    public int sumar(){
        int sumaT=0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
        for(int i=0;i<n;i++){
           // numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));//bien
            numero = ingresarnumero();
            sumaT = sumaT+numero;
        }
        JOptionPane.showMessageDialog(null,"El total de la suma es:"+sumaT);//bien
        //mostrarnumero(sumaT);
        return sumaT;
    }

    //RESTAR N NUMEROS
    public int restar(){
        int restaT=0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
        for(int i=0;i<n;i++){
            //numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            numero = ingresarnumero();
            if(i>0){
                numero*=-1;
            }
            restaT+=numero;
        }
        JOptionPane.showMessageDialog(null,"El total de la resta es:"+restaT);
        return restaT;
    }
    //MULTIPLICAR N NUMEROS
    public int multiplicar(){
        int multiplicacionT=1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));

        for(int i=0;i<n;i++){
            //numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            numero = ingresarnumero();
            multiplicacionT=multiplicacionT*numero;
        }
        JOptionPane.showMessageDialog(null,"El total de la multiplicacion es:"+multiplicacionT);

        return multiplicacionT;
    }
    //DIVISION N NUMEROS
    public float dividir(){
        float divisionT=1;
        float aux;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
        //numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        numero = ingresarnumero();
        aux=numero;
        divisionT=aux/divisionT;
        for(int i=1;i<n;i++){
            //numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            numero = ingresarnumero();
            divisionT=(float)(divisionT/numero);
        }
        JOptionPane.showMessageDialog(null,"El total de la division es:"+divisionT);

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
