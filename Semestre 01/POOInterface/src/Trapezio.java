public class Trapezio implements FigurasGeometricas {
    int baseMenor, baseMaior, altura, Lado1, Lado2, perimetro, area;



    public int getBaseMenor() {return baseMenor;}

    public void setBaseMenor(int baseMenor) {this.baseMenor = baseMenor;}

    public int getBaseMaior() {return baseMaior;}

    public void setBaseMaior(int baseMaior) {this.baseMaior = baseMaior;}

    public int getAltura() {return altura;}

    public void setAltura(int altura) {this.altura = altura;}

    public int getLado1() {return Lado1;}

    public void setLado1(int lado1) {Lado1 = lado1;}

    public int getLado2() {return Lado2;}

    public void setLado2(int lado2) {Lado2 = lado2;}

    public Trapezio(int baseMenor, int baseMaior, int altura, int lado1, int lado2) {
        this.baseMenor = baseMenor; this.baseMaior = baseMaior; this.altura = altura;
        Lado1 = lado1; Lado2 = lado2;}

    @Override
    public double getArea() {
        // A=(B+b).h/2
        area=(baseMaior+baseMenor)*altura/2;
        return area;
    }

    @Override
    public String getNomeFigura() {return "Trapézio";}

    @Override
    public double getPerimetro() {
        // P=B+b+l1+l2
        perimetro=baseMaior+baseMenor+Lado1+Lado2;
        return perimetro;}
}