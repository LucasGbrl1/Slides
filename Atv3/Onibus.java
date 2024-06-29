class Onibus extends Veiculo implements Locomocao {
    private int capacidade;

    public Onibus(String modelo, int capacidade) {
        super(modelo);
        this.capacidade = capacidade;
    }

    @Override
    public void acelerar() {
        System.out.println("Ônibus acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Ônibus freando...");
    }
}