class Transporte {
    private int passageiros;
    private int valorPassagem;

    public Transporte() {
        // Construtor
    }

    public int calcularTarifa() {
        // Implementação do cálculo da tarifa
        return valorPassagem * passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }
}