package OrientacaoObjeto.cap13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MegasenaUtilitarioTest {

    @Test
    void gerarNumeroMegasena(){
        int numeroSorteado = MegasenaUtilitario.sortearNumero();
        System.out.println(" Numero sorteado: " + numeroSorteado);
        Assertions.assertTrue(numeroSorteado > 0
                && numeroSorteado <= 60, "Número Inválido!");
    }

    @Test
    void NumerosMegasena() {
        System.out.println("Números Sorteados:");
        for (int i = 0; i < 6; i++) {
            int numeroSorteado = SorteadorDeNumeros.sortear(60);
            System.out.print(" " + numeroSorteado);
    }

    }
}
