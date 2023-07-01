package EstruturasDeControle;
import java.util.Calendar;
import java.util.Scanner;

//Dias do M�s

public class Lab2 {
    public static void main(String[] args) {
        final int ANO_VIGENTE = Calendar.getInstance().get(Calendar.YEAR);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o m�s desejado: ");
        String mes = scan.next().toLowerCase();

        switch(mes) {
            case "janeiro" :
            case "mar�o" :
            case "maio" :
            case "julho" :
            case "agosto" :
            case "outubro" :
            case "dezembro" :
                System.out.println("O m�s tem 31 dias");
                break;

            case "fevereiro" :
                if (ANO_VIGENTE % 4 == 0 && ANO_VIGENTE % 100 != 0 || ANO_VIGENTE % 400 == 0){
                    System.out.println("O m�s tem 29 dias");
                } else {
                    System.out.println("O m�s tem 28 dias");
                }
                break;
            case "abril" :
            case "junho" :
            case "setembro" :
            case "novembro" :
                System.out.println("O m�s tem 30 dias");
                break;

            default:
                System.out.println("O m�s � inv�lido");
                break;
        }

        scan.close();
    }
}

//Outro modo de fazer:
//public class DiasDoMes {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        final int ANO_VIGENTE = Calendar.getInstance().get(Calendar.YEAR);
//        boolean isBissexto = ANO_VIGENTE % 4 == 0 && ANO_VIGENTE % 100 != 0 || ANO_VIGENTE % 400 == 0;
//
//        System.out.println("Digite o m�s desejado: ");
//        String mes = scan.next().toLowerCase();
//
//        switch(mes) {
//            case "janeiro" :
//            case "mar�o" :
//            case "maio" :
//            case "julho" :
//            case "agosto" :
//            case "outubro" :
//            case "dezembro" :
//                System.out.println("O m�s tem 31 dias");
//                break;
//
//            case "fevereiro" :
//                System.out.println(isBissexto ? "O m�s tem 29 dias" : "O m�s tem 28 dias");
//                break;
//            case "abril" :
//            case "junho" :
//            case "setembro" :
//            case "novembro" :
//                System.out.println("O m�s tem 30 dias");
//                break;
//
//            default:
//                System.out.println("O m�s � inv�lido");
//                break;
//        }
//
//        scan.close();
//    }
//}