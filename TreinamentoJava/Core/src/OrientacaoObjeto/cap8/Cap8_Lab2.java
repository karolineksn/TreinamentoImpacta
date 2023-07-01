package OrientacaoObjeto.cap8;

public class Cap8_Lab2 {

    public static void main(String[] args) {

        if (args.length > 0){
            double soma = 0;

            System.out.println("A média das idades:");

            for (int i = 0; i < args.length; i++) {
                soma += Double.parseDouble(args[i]);
                System.out.print(" " + args[i]);
            }
            double media = soma / args.length;
            System.out.println(" ");
            System.out.println(" é de: " + media + " anos");

        } else {
            System.out.println("Entre com valores válidos para as idades");
        }
    }
}

