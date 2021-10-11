package poo.figura.dominio;

public class Figura {
    private String color;
    private boolean relleno;

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public int area(){
        return 0;
    }

    public String getColor() {
        return color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
}
