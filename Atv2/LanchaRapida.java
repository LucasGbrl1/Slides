class LanchaRapida implements Motorizado, Aquatico {
    public LanchaRapida() {
        // Construtor
    }

    @Override
    public void acelerar() {
        // Implementação da aceleração para lanchas rápidas
        System.out.println("Lancha rápida acelerando...");
    }

    @Override
    public void freiar() {
        // Implementação da frenagem para lanchas rápidas
        System.out.println("Lancha rápida freando...");
    }

    @Override
    public void navegar() {
        // Implementação da navegação para lanchas rápidas
        System.out.println("Lancha rápida navegando...");
    }
}
