package EstruturaDados.ListasCirculares;

public class Main {
    
    public static void main(String[] args) {
        
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("C1");
        minhaLista.add("C");
        minhaLista.add("C3");
        minhaLista.add("C4");
        minhaLista.add("C5");
        minhaLista.add("C6");

       // System.out.println(minhaLista);

        minhaLista.remove(0);

        //System.out.println(minhaLista);

        //System.out.println(minhaLista.get(2));

        minhaLista.add("C99");

        System.out.println(minhaLista);

    }
}
