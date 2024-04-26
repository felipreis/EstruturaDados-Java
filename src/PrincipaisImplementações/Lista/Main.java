package PrincipaisImplementações.Lista;

import java.util.ArrayList;
import java.util.List;

import EstruturaDados.Listas.Lista;

public class Main {
    
    public static void main(String[] args) {
        
    
    List<Carro> listaCarro = new ArrayList<>();

    listaCarro.add(new Carro("Peugeut"));
    listaCarro.add(new Carro("Ford"));
    listaCarro.add(new Carro("Mercedes"));

    System.out.println(listaCarro);

    // TRAZENDO UM ELEMENTO LOCALIZADO NO INDICE FORNECIDO
    System.out.println(listaCarro.get(2));

    //ENCONTRANDO ÍNDICE DE UM ELEMENTO
    System.out.println(listaCarro.indexOf(new Carro("Ford")));

    }
}
