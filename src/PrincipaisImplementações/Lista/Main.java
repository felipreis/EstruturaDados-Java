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

    System.out.println(listaCarro.get(2));

    System.out.println(listaCarro.indexOf(new Carro("Ford")));

    }
}
