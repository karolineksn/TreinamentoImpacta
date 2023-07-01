package OrientacaoObjeto.cap9;

public class QuadradoAbstract extends PoligonoAbstract{

    private double lado;
    public QuadradoAbstract(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado*lado;
        System.out.println("Area do Quadrado: " + resultado);
        return resultado;
    }
}
