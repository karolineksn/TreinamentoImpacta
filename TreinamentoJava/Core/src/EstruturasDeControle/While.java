package EstruturasDeControle;

public class While {

    public static void main(String[] args) {

        int valor = 0;
        while (valor <= 10) {
            System.out.println("O valor �: "+ valor);
            valor += 2; //vai contar de 2 em 2
        }
        System.out.println("-----------------------");

        do {
            System.out.println("O valor �: " +valor);
        }while (valor-- >=0);

    }
}
