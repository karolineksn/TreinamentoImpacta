package OrientacaoObjeto.cap10;

public class Televisao implements Eletrodomestico{
    @Override
    public void ligar() {
        System.out.println("...Ligando a TV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a TV...");
    }
}
