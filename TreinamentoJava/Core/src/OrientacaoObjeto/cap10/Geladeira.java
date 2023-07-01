package OrientacaoObjeto.cap10;

public class Geladeira implements Eletrodomestico{
    @Override
    public void ligar() {
        System.out.println("Ligando a Geladeira...");
    }

    @Override
    public void desligar() {
        System.out.println("...Desligando a Geladeira");
    }
}
