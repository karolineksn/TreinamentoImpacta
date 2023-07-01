package OrientacaoObjeto.cap10.Lab;

public class Cap10_Lab1 {
    public static void main(String[] args) {

        Imprimivel grafico = new Grafico();
        Imprimivel relatorio = new Relatorio();

        grafico.imprimir();
        relatorio.imprimir();

        // Outro modo de fazer:
//        Relatorio relatorio = new Relatorio();
//        relatorio.imprimir();
//
//        Grafico grafico = new Grafico();
//        grafico.imprimir();

    }
}
