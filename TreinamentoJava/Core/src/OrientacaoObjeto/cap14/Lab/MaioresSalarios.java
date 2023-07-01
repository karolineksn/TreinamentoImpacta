package OrientacaoObjeto.cap14.Lab;

public class MaioresSalarios {

    public static void main(String[] args) {
        double salariosBrutos[] = {1350.0, 4320.15,
                8235.25,
                2500.55,
                1830.00,
                850.26,
                3614.29,
                12500.00};
        double salariosTop[] = DoubleArrayUtils
                .filtraValores(salariosBrutos, salario -> salario >= 3_000);

        System.out.println("Salários maiores de 3.000");
        for (int i = 0; i < salariosTop.length; i++) {
            System.out.println("Salário: " + salariosTop[i]);
        }


    }

}
