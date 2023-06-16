public class Quadrado implements FigurasGeometricas {
    int lado;

    public Quadrado(int lado) {this.lado = lado;}

    // Sets e Gets
    public int getlado() {return lado;}

    public void setlado(int lado) {this.lado = lado;}

    // Metodos da classe FigurasGeometricas (Interface)
    @Override
    public double getArea() {int area = lado * lado; return area;}

    @Override
    public String getNomeFigura() {return "Quadrado";}

    @Override
    public double getPerimetro() {int perimetro = lado * 4; return perimetro;}
}
