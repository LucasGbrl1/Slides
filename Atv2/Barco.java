class Barco implements Aquatico {
    private String tamanho;
    private int lotacaoMaxima;
    private int velocidadeMaxima;

    public Barco() {
        // Construtor
    }

    @Override
    public void navegar() {
        // Implementação da navegação para barcos
        System.out.println("Barco navegando...");
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }
}