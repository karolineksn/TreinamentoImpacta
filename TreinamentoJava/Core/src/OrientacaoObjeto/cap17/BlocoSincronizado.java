package OrientacaoObjeto.cap17;

public class BlocoSincronizado {

    void imprimir(String mensagem) {
        synchronized (this){
            System.out.println(mensagem);
        }

    }
}
