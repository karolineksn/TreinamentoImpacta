package OrientacaoObjeto.cap10;

public class TesteInterface {
    public static void main(String[] args) {

        Eletrodomestico aparelho;

        aparelho = new Geladeira();
        aparelho.ligar();
        aparelho.desligar();

        aparelho = new Televisao();
        aparelho.ligar();
        aparelho.desligar();

    }
}
