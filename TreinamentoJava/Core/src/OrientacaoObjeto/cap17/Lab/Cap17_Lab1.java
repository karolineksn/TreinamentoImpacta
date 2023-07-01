package OrientacaoObjeto.cap17.Lab;

public class Cap17_Lab1 {

    public static void main(String[] args) {

        Thread thread1 = new ThreadLab("Thread 1");
        Thread thread2 = new ThreadLab("Thread 2");
        thread1.start();
        thread2.start();

    }
}
