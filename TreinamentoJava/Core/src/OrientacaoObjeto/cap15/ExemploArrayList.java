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
        paises.add("Fran�a");
        paises.add("Inglaterra");
        paises.add(2, "It�lia"); // aqui eu estou for�ando a Italia como index 2

        System.out.println("Pa�ses na ordem original:");
        paises.forEach(curso -> System.out.println(" - " + curso)); //uso o forEach pra imprimir a lista

        System.out.println("---------------------------------");

        System.out.println("Cont�m um pa�s chamado Estados Unidos? R: " + paises.contains(("Estados Unidos"))); // verifica se a lista contem a String "Estados Unidos"
        System.out.println("Qual � o pa�s no index 2 da lista? R: " + paises.get(2)); // imprime o item da posi��o 2, considerando que a lista come�a com index 0
        System.out.println("Qual � o n�mero de posi��es da lista? R: " + paises.size()); // imprime o tamanho da lista
        System.out.println("Em que posi��o est� a Fran�a? R: " + paises.indexOf("Fran�a") + "�"); // imprime em que posi��o est� a Fran�a

        paises.replaceAll(s -> s.toUpperCase()); //torna todos os itens para maiusculo
        paises.sort((x, y) -> x.compareTo(y)); //reordena toda a lista utilizando a ordem natural de Strings

        System.out.println("---------------------------------");

        System.out.println("Pa�ses ordenados e em mai�sculo:");
        paises.forEach(curso -> System.out.println(" - " + curso));

        System.out.println("---------------------------------");
        System.out.println("Pa�ses ordenados pelo Set:");

        //Usando Set, o TreeSet retorna a lista j� em ordem alf�betica e remove o que estiver em duplicidade
        Set<String> listSet = new TreeSet<>();

        listSet.add("Jamaica");
        listSet.add("Nova Zelandia");
        listSet.add("Peru");
        listSet.add("Mexico");
        listSet.add("Canad�");
        listSet.add("Jamaica");
        listSet.add("Russia");

        listSet.forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("Lista 'listSet' usando Stream:");
        listSet
                .stream()
                .sorted(); //coloca a lista em ordem alfab�tica
                //.forEach(System.out::println); //posso usar o forEach pra imprimir
        System.out.println(listSet); //mas tamb�m posso usar assim

    }
}
