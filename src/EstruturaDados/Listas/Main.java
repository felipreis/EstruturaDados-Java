package EstruturaDados.Listas;

public class Main {
    
    public static void main(String[] args) {
        
        Lista <String> minhaLista = new Lista<>();

        minhaLista.add("teste 1");
        minhaLista.add("teste 2");
        minhaLista.add("teste 3");
        minhaLista.add("teste 4");

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3));

        System.out.println(minhaLista);

        System.out.println(minhaLista.remove(2));
        System.out.println(minhaLista);
    }
}
