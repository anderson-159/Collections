import java.util.ArrayList;

public class AulaCollectionsList {
    //Busca por índice de string ou seja pelo get
    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList();

        Carro fiat = new Carro();
        fiat.setMarca("Fiat");
        carros.add(fiat);

        Carro volks = new Carro();
        volks.setMarca("Volks");
        carros.add(volks);

        for (Carro carro : carros) {
            System.out.println(carro);
        }

        System.out.println(carros.get(0));

    }

}
