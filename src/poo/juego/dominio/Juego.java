package poo.juego.dominio;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

//CLASE JUEGO
public class Juego {
    private String juegoNombre;
    private String nombreJugador;
    private int ganadasJugador;
    private int ganadasPC;
    private int empates;
    private static final int PIEDRA = 0;
    private static final int PAPEL = 1;
    private static final int TIJERA = 2;
    public static final List<Integer> OPCION = Arrays.asList(PIEDRA, PAPEL, TIJERA);


    public Juego(String juegoNombre) {
        this.juegoNombre = juegoNombre;
    }

    //METODOSS

    public int jugadaPC() {
        int opcionPC = (int) (Math.random() * 2 + 1);
        return opcionPC;
    }

    public String jugar(int jugadaJugador, int jugadaPC) {
        if (jugadaJugador == PIEDRA && jugadaPC == TIJERA) {
            ganadasJugador++;
            return "Ganaste "+getNombreJugador();
        } else if (jugadaJugador == PAPEL && jugadaPC == PIEDRA) {
            ganadasJugador++;
            return "Ganaste "+getNombreJugador();
        } else if (jugadaJugador == TIJERA && jugadaPC == PAPEL) {
            ganadasJugador++;
            return "Ganaste "+getNombreJugador();
        } else if(jugadaJugador == jugadaPC){
            empates++;
            return "EMPATE!";
        }else {
            ganadasPC++;
            return "GANA PC";
        }
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getGanadasJugador() {
        return ganadasJugador;
    }

    public int getGanadasPC() {
        return ganadasPC;
    }

    public int getEmpates() {
        return empates;
    }

    //SETT PARA RESETEAR PUNTAJES

    public void setGanadasJugador(int ganadasJugador) {
        this.ganadasJugador = ganadasJugador;
    }

    public void setGanadasPC(int ganadasPC) {
        this.ganadasPC = ganadasPC;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}