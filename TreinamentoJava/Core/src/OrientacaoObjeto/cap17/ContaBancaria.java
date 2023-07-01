package OrientacaoObjeto.cap17;

public class ContaBancaria {

    private static long saldo = 500;

    public static long getSaldo() {
        return saldo;
    }

    public static boolean sacar(long valorSaque){
        if (valorSaque <= saldo) {
            saldo -= valorSaque; //assinatura do método sacar
            return true;
        }
        return false;

    }
}
