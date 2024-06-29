class Automovel extends Veiculo implements Motor {
    private String tipoMotor;

    public Automovel(String modelo, String tipoMotor) {
        super(modelo);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor ligado!");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor desligado!");
    }
}