package OrientacaoObjeto.cap9;

public class CalculoAreaAbstract {
    public static void main(String[] args) {
        QuadradoAbstract quadradoAbstract = new QuadradoAbstract(5);
        quadradoAbstract.calcularArea();
        System.out.println(quadradoAbstract);
    }
}
