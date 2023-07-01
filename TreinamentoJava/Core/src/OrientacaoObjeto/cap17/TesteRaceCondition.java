package OrientacaoObjeto.cap17;

public class TesteRaceCondition {

    public static void main(String[] args) {

        Runnable caixaEletronico = () -> { //interface Runnable
            int valorSaque = 100;
            boolean validacao = ContaBancaria.sacar(valorSaque); //chamando o metodo sacar e guardando na variavel saldo
            if (validacao) {
                System.out.println("Valor Saque: R$" + valorSaque);
                System.out.println("Saldo após o saque: R$" + ContaBancaria.getSaldo());
            } else {
                System.out.println("Valor insuficiente para saque");
                System.out.println("Saldo atual: R$" + ContaBancaria.getSaldo());
            }
        };
        Thread sacandoValor = new Thread(caixaEletronico);
        sacandoValor.start();
        try {
            Thread.sleep(1000); /*garante que a thread espere por 1s para que a outra possa rodar a thread2,
            sem isso, rodariam as duas de uma vez*/
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread sacandoValor2 = new Thread(caixaEletronico);
        sacandoValor2.start();

    }
}
