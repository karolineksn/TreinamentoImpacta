package OrientacaoObjeto.cap15.Lab;

import java.util.ArrayList;
import java.util.List;

public class Cap15_lab2 {
    public static void main(String[] args) {

        List<Estudante> estudanteList = new ArrayList<>();

        Estudante karol = new Estudante("Karol", 10D, 10D);
        Estudante joana = new Estudante("Joana", 6D, 9D);
        Estudante antonio = new Estudante("Antonio", 7.5D, 9D);
        Estudante mariana = new Estudante("Mariana", 7D, 6D);

        estudanteList.add(karol);
        estudanteList.add(joana);
        estudanteList.add(antonio);
        estudanteList.add(mariana);

        //outro modo de fazer
        estudanteList.add(new Estudante("Ricardo", 5D, 8.5D));
        estudanteList.add(new Estudante("Gustavo", 5.5D, 9.5D));

        estudanteList.forEach(estudante -> {
            double media = (estudante.getNotaMatematica() + estudante.getNotaPortugues()) / 2;
            estudante.setMedia(media);
        });

        estudanteList.forEach(System.out::println);

    }
}
