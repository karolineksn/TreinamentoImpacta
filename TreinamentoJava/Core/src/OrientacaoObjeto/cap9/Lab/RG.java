package OrientacaoObjeto.cap9.Lab;

public class RG {
    private int numero;
    private String dataNasc;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public RG(int numero, String dataNasc) {
        this.numero = numero;
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "RG{" +
                "numero=" + numero +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}
