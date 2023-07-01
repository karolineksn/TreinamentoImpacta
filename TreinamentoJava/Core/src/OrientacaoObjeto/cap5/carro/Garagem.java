package OrientacaoObjeto.cap5.carro;

public class Garagem {
    //composição -> Garagem contém Carro
    Carro carroPasseio = new Carro();
    Carro carroUtilitario = new Carro();

    public static void main(String[] args) {
        Garagem g = new Garagem();

        g.carroUtilitario.modelo = "Jeep Compass";
        g.carroUtilitario.cor = "Branco Polar";
        g.carroUtilitario.potenciaDoMotor = 4.0f;

        g.carroPasseio.modelo = "Peugeot 2006";
        g.carroPasseio.cor = "Cinza Grafite";
        g.carroPasseio.potenciaDoMotor = 2.0f;

        System.out.println("--- Carro Utilitário ---");
        System.out.println("Modelo: "+ g.carroUtilitario.modelo);
        System.out.println("Cor: "+ g.carroUtilitario.cor);
        System.out.println("Potência:  "+ g.carroUtilitario.potenciaDoMotor);
        System.out.println();
        System.out.println("--- Carro de Passeio ---");
        System.out.println("Modelo: "+ g.carroPasseio.modelo);
        System.out.println("Cor: "+ g.carroPasseio.cor);
        System.out.println("Potência:  "+ g.carroPasseio.potenciaDoMotor);

    }
}
