class Aviao extends Veiculo implements Motor {
    private boolean comercial;

    public Aviao(String modelo, boolean comercial) {
        super(modelo);
        this.comercial = comercial;
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor do avião ligado!");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor do avião desligado!");
    }
}