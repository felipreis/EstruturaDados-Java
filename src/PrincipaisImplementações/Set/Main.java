package PrincipaisImplementações.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Set<Carro> setCarro = new HashSet<>();

        setCarro.add(new Carro("Ford"));
        setCarro.add(new Carro("Fiat"));
        setCarro.add(new Carro("Wolks"));
        setCarro.add(new Carro("Audi"));

        //Não preserva a ordem de inserção;

        System.out.println(setCarro);

        Set<Carro> treeSetCarro = new TreeSet<>();

        treeSetCarro.add(new Carro("Ford"));
        treeSetCarro.add(new Carro("Fiattt"));
        treeSetCarro.add(new Carro("Wolks"));
        treeSetCarro.add(new Carro("bmw"));

        // adiciona elementos em árvore de forma ordenada conforme método compareTo()
        System.out.println(treeSetCarro);


    }
}
