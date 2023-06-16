public class App {
    public static void main(String[] args) throws Exception {
        Quadrado figura1 = new Quadrado(6); // Medida dos lados (6)
        Retangulo figura2 = new Retangulo(4, 6);
        Trapezio figura3 = new Trapezio(5, 10, 8, 6, 6);

        System.out.println("Nome: " + figura1.getNomeFigura() + "\nArea: "
                                    + figura1.getArea() + "\nPerimetro: "
                                    + figura1.getPerimetro());
        System.out.println("");
        System.out.println("Nome: " + figura2.getNomeFigura() + "\nArea: "
                                    + figura2.getArea() + "\nPerimetro: "
                                    + figura2.getPerimetro());
        System.out.println("");
        System.out.println("Nome: " + figura3.getNomeFigura() + "\nArea: "
                                    + figura3.getArea() + "\nPerimetro: "
                                    + figura3.getPerimetro());
    }
}
