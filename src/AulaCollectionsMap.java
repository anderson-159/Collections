import java.util.HashMap;
import java.util.Map;

public class AulaCollectionsMap {

    public static void main(String[] args) {

        Map<String, Carro> mapCarros = new HashMap<>();

        // No map é identificado pela chave, caso houver mais de uma chave igual no metodo ele vai substituir
        // A chave pode ser do tipo int e String se for int tira ("")
        Carro fiat = new Carro();
        fiat.setMarca("Fiat");
        mapCarros.put("101", fiat);

        Carro volks = new Carro();
        volks.setMarca("Volks");
        mapCarros.put("102", volks);

        Carro fusca = new Carro();
        fusca.setMarca("Volks");
        fusca.setModelo("Fusca");
        mapCarros.put("103", fusca);

        Carro fusca2 = new Carro();
        fusca2.setMarca("Volks");
        fusca2.setModelo("Fusca");
        mapCarros.put("104", fusca2);

        // Nao precisa criar o for para o projeto pois a busca é feita dando um get na chave Ex: 104
        for (String key : mapCarros.keySet()) {
            Carro carro = mapCarros.get(key);
            System.out.println(key + " - " + carro);
        }

        Carro fuscaCodigo104 = mapCarros.get("105");
        System.out.println(fuscaCodigo104);

    }

}