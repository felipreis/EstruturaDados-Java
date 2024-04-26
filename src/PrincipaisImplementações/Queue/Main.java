package PrincipaisImplementações.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue<Carro> filaCarro = new LinkedList<>();

        filaCarro.add(new Carro("Ford"));
        filaCarro.add(new Carro("Fiat"));
        filaCarro.add(new Carro("BMW"));
        filaCarro.add(new Carro("Audi"));

        System.out.println((filaCarro.add(new Carro("Tesla"))));
        System.out.println(filaCarro);


        System.out.println(filaCarro.offer(new Carro("Renault")));
        System.out.println(filaCarro);

        //SELECIONA O PRIMEIRO DA FILA E NÃO REMOVE
        System.out.println(filaCarro.peek());
        System.out.println(filaCarro);

        // SELECIONA O PRIMEIRO DA FILA E REMOVE DA LISTA
        System.out.println(filaCarro.poll());
        System.out.println(filaCarro);
    }
}
