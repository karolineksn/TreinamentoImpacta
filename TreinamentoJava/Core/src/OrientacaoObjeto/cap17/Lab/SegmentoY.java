package OrientacaoObjeto.cap17.Lab;

public class SegmentoY extends Thread{

    int montante;

    public void run(){
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                montante +=i;
                System.out.print(" " + i);
            }
            System.out.println();
            System.out.println("Valor total da soma: " + montante);
            notify();
        }
    }
}
