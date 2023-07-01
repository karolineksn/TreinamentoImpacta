package OrientacaoObjeto.cap17.Lab;

public class SegmentoX {
    public static void main(String[] args) {
        Thread thread = new SegmentoY(); //instanciando uma thread
        thread.start(); //startando a thread

        synchronized (thread){
            try {
                System.out.println("Aguardando a execu��o da thread Y");
                thread.wait();
            }catch (RuntimeException e){
                e.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(" Fim da execu��o. O valor total da soma �: " + ((SegmentoY) thread).montante);
    }
}
