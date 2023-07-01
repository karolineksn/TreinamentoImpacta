package OrientacaoObjeto.cap14.Lab;


public class DescontoSalarial {

    public static void main(String[] args) {
        //instanciando uma lista > outro exemplo: String listaSimples = new String[10]
        double salariosBrutos[] = {1350.0, 4320.15,
                8235.25,
                2500.55,
                1830.00,
                850.26,
                3614.29,
                12500.00};
        double salariosLiquidos[] = DoubleArrayUtils.transformaValores(salariosBrutos,
                salarioBruto -> salarioBruto * 0.9);

        for (int i = 0; i < salariosBrutos.length; i++) {
            System.out.print("Salários Brutos: " + salariosBrutos[i]);
            System.out.println(" - Salários Liquidos: " + salariosLiquidos[i]);
        }

//        DoubleArrayUtils.processaValores(salariosLiquidos, salario -> {
//            System.out.println("Salários Liquidos: " + salario);
//        });
    }
}
