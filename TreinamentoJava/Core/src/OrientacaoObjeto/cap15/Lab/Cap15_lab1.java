package OrientacaoObjeto.cap15.Lab;

import java.util.HashMap;
import java.util.Map;

public class Cap15_lab1 {
    public static void main(String[] args) {
        Map<String, Integer> pessoaMap = new HashMap<>();
        pessoaMap.put("Karol", 30);
        pessoaMap.put("Pedro", 8);
        pessoaMap.put("Alex", 25);
        pessoaMap.put("Juliana", 20);

        System.out.println("Karol " + pessoaMap.get("Karol"));
        System.out.println("Pedro " + pessoaMap.get("Pedro"));
        System.out.println("Alex " + pessoaMap.get("Alex"));
        System.out.println("Juliana " + pessoaMap.get("Juliana"));

        //opção usando lambda
        pessoaMap.forEach((nome, idade) -> System.out.println(nome + ": " + idade));
    }
}
