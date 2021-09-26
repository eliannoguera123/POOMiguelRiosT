package poo.desafio.dominio;
import java.util.List;
import javax.swing.*;

public class Calculadora {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/uco.png");
    private String marcaCalculadora;
    private double numero;
    private int n;
    private double resultado;

    public Calculadora(String marcaCalculadora) {
        this.marcaCalculadora = marcaCalculadora;

    }

    //METODOS
    //MOSTRAR NUMERO
    private static void mostrarnumero(double resultado){
         JOptionPane.showMessageDialog(null,"El total es:"+resultado);
    }


    /*public int ingresarnumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        return numero;
    }*/

    public int ingresarn(){
        do{
            try{
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
                if(n<1){
                    JOptionPane.showMessageDialog(null,"Numero ingresado no válido");
                }
            }catch (NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no válido");
            }
        }while(n<1);
        return n;
    }
    //INGRESAR NUMERO
    public double ingresarnumero(){
        do{
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                return numero;
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no valido");
                continue;
            }
        }while(true);
    }


    //SUMAR N NUMEROS
    public double sumar(int n){

        double sumaT=0;
        for(int i=0;i<n;i++){
            numero = ingresarnumero();
            sumaT = sumaT+numero;
        }
        mostrarnumero(sumaT);
        return sumaT;
    }

    //RESTAR N NUMEROS
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
    }
    //GETTER
    public String getMarcaCalculadora() {
        return marcaCalculadora;
    }

    public double getNumero() {
        return numero;
    }

    public double getResultado() {
        return resultado;
    }

}
