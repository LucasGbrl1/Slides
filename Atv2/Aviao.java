class Aviao implements Motorizado, Aquatico {
    private String autonomiaVoo;
    private String tipoAsa;

    public Aviao() {
        // Construtor
    }

    @Override
    public void acelerar() {
        // Implementação da aceleração para aviões
        System.out.println("Avião acelerando...");
    }

    @Override
    public void freiar() {
        // Implementação da frenagem para aviões
        System.out.println("Avião freando...");
    }

    @Override
    public void navegar() {
        // Implementação da navegação para aviões
        System.out.println("Avião navegando...");
    }

    public String getAutonomiaVoo() {
        return autonomiaVoo;
    }

    public void setAutonomiaVoo(String autonomiaVoo) {
        this.autonomiaVoo = autonomiaVoo;
    }

    public String getTipoAsa() {
        return tipoAsa;
    }

    public void setTipoAsa(String tipoAsa) {
        this.tipoAsa = tipoAsa;
    }
}
