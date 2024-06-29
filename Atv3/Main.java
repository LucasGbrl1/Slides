public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("Mercedes", 50);
        onibus.acelerar();
        onibus.frear();

        Automovel automovel = new Automovel("Ford", "Gasolina");
        automovel.ligarMotor();
        automovel.desligarMotor();

        Caminhao caminhao = new Caminhao("Volvo", 15000.0);
        caminhao.acelerar();
        caminhao.frear();

        Aviao aviao = new Aviao("Boeing", true);
        aviao.ligarMotor();
        aviao.desligarMotor();
    }
}