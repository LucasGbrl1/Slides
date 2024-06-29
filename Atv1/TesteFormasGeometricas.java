public class TesteFormasGeometricas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        Quadrado quadrado = new Quadrado(3.0);
        Pentagono pentagono = new Pentagono(5.0, 3.0);
        Hexagono hexagono = new Hexagono(4.0);

        System.out.println("Área do pentágono: " + pentagono.calcularArea());
        System.out.println("Área do hexágono: " + hexagono.calcularArea());
        System.out.println("Área do círculo: " + circulo.getArea());
        System.out.println("Área do retângulo: " + retangulo.getArea());
        System.out.println("Área do quadrado: " + quadrado.getArea());
    }
}

