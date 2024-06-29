public class Hexagono {
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return 6 * (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }
}
