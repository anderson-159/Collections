import java.util.*;

public class AulaCollectionsSet {
    // Nao permite itens repetidos e nao faz a busca por indices
    // Só funciona se implementar o equals e o hashcode
    // Fica desordenado e o java usa o hashcode para fazer a ordenação
    // Quando adicionamos se nao tiver o equals e o hashcode ele nao mantém uma ordem e deixa incluir itens repetidos
    public static void main(String[] args) {

        HashSet<Carro> carros = new HashSet<>();

        Carro fiat = new Carro();
        fiat.setMarca("Fiat");
        carros.add(fiat);

        Carro volks = new Carro();
        volks.setMarca("Volks");
        carros.add(volks);

        Carro fusca = new Carro();
        fusca.setMarca("Volks");
        fusca.setModelo("Fusca");
        carros.add(fusca);

        Carro fusca2 = new Carro();
        fusca2.setMarca("Volks");
        fusca2.setModelo("Fusca");
        carros.add(fusca2);

        System.out.println(fusca.equals(fusca2));

        System.out.println(fusca.hashCode());
        System.out.println(fusca2.hashCode());


        List<Carro> carrosList = new ArrayList<>();
        for (Carro c : carros) {
            carrosList.add(c);
        }
        // A interface "comparator" nao tem clase está anonima (usa e depois descarta),
        // neste caso usada apenas para implementar essa lista
        Comparator<Carro> comparatorCarro = new Comparator<Carro>() {
            @Override
            public int compare(Carro carro1, Carro carro2) {
                return carro2.getMarca().compareTo(carro1.getMarca());
            }
        };
        Collections.sort(carrosList, comparatorCarro);

        for (Carro carro : carrosList) {
            System.out.println(carro);
        }

        String nome1 = new String("Igor");
        String nome2 = new String("Igor");
        System.out.println(nome1.equals(nome2));

        //System.out.println(carros.get(0));

    }

}
