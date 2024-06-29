public class Pentagono {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }
}
