class Caminhao extends Veiculo implements Locomocao {
    private double carga;

    public Caminhao(String modelo, double carga) {
        super(modelo);
        this.carga = carga;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão freando...");
    }
}
