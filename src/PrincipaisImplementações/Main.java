package PrincipaisImplementações;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        // Testando método hashCode e equals

        ArrayList<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("FORD"));
        listaCarro.add(new Carro("FIAT"));
        listaCarro.add(new Carro("PEUGEUT"));
        listaCarro.add(new Carro("HYUNDAI"));

        System.out.println( new Carro("FORD").hashCode());
        System.out.println( new Carro("FORD1").hashCode());


        Carro carro1 = new Carro("CHEVROLET");
        Carro carro2 = new Carro ("AUDI");

        System.out.println(carro1.equals(carro2));

    }
}
