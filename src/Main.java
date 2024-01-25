import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Contato> agenda = new HashMap<>(){{

            put(1, new Contato("Raquel", 859055433 ));
            put(4, new Contato("Sidrim", 857401232 ));
            put(3, new Contato("Zilfran", 856899552 ));
        }};

        System.out.println(agenda);

        /* Set<Map.Entry<Integer,Contato>> agenda2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return Integer.compare(o1.getValue().getNumero(),o2.getValue().getNumero());
            }
        });
        agenda2.addAll(agenda.entrySet());
        System.out.println(agenda2);

         */

       /* Set<Map.Entry<Integer,Contato>> agenda2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer,Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));

        */
        Set<Map.Entry<Integer,Contato>> agenda2 = new TreeSet<>(Comparator.comparing(
                cont-> cont.getValue().getNumero()));

        agenda2.addAll(agenda.entrySet());
        System.out.println(agenda2);

        Set<Map.Entry<Integer,Contato>> agenda3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        agenda3.addAll(agenda.entrySet());
        System.out.println(agenda3);

    }
}