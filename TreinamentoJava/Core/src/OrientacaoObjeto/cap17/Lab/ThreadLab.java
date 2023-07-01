package OrientacaoObjeto.cap17.Lab;

public class ThreadLab extends Thread{

    private static Object lock = new Object();

    public ThreadLab(String nome) {
        super(nome);
    }

    public void run() {
        synchronized (lock) { //imprime a thread em sincronia 1 1 1 2 2 2 ao invés de 1 2 1 2 1 2
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.sleep(500);
                    String nome = Thread.currentThread().getName();
                    System.out.println(nome);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
        }
    }



}
