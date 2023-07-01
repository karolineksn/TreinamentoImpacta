package OrientacaoObjeto.cap15;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploArrayList {

    public static void main(String[] args) {

        List<String> paises = new ArrayList<>();

        paises.add("Brasil");
        paises.add("Portugal");
        paises.add("Estados Unidos");
        paises.add("França");
        paises.add("Inglaterra");
        paises.add(2, "Itália"); // aqui eu estou forçando a Italia como index 2

        System.out.println("Países na ordem original:");
        paises.forEach(curso -> System.out.println(" - " + curso)); //uso o forEach pra imprimir a lista

        System.out.println("---------------------------------");

        System.out.println("Contém um país chamado Estados Unidos? R: " + paises.contains(("Estados Unidos"))); // verifica se a lista contem a String "Estados Unidos"
        System.out.println("Qual é o país no index 2 da lista? R: " + paises.get(2)); // imprime o item da posição 2, considerando que a lista começa com index 0
        System.out.println("Qual é o número de posições da lista? R: " + paises.size()); // imprime o tamanho da lista
        System.out.println("Em que posição está a França? R: " + paises.indexOf("França") + "ª"); // imprime em que posição está a França

        paises.replaceAll(s -> s.toUpperCase()); //torna todos os itens para maiusculo
        paises.sort((x, y) -> x.compareTo(y)); //reordena toda a lista utilizando a ordem natural de Strings

        System.out.println("---------------------------------");

        System.out.println("Países ordenados e em maiúsculo:");
        paises.forEach(curso -> System.out.println(" - " + curso));

        System.out.println("---------------------------------");
        System.out.println("Países ordenados pelo Set:");

        //Usando Set, o TreeSet retorna a lista já em ordem alfábetica e remove o que estiver em duplicidade
        Set<String> listSet = new TreeSet<>();

        listSet.add("Jamaica");
        listSet.add("Nova Zelandia");
        listSet.add("Peru");
        listSet.add("Mexico");
        listSet.add("Canadá");
        listSet.add("Jamaica");
        listSet.add("Russia");

        listSet.forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("Lista 'listSet' usando Stream:");
        listSet
                .stream()
                .sorted(); //coloca a lista em ordem alfabética
                //.forEach(System.out::println); //posso usar o forEach pra imprimir
        System.out.println(listSet); //mas também posso usar assim

    }
}
