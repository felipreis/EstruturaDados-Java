package PrincipaisImplementações.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("BMW"));
        stackCarro.push(new Carro("Audi"));
        stackCarro.push(new Carro("Citroen"));

        System.out.println(stackCarro);

        System.out.println(stackCarro.pop());

        System.out.println(stackCarro);
    }
}
