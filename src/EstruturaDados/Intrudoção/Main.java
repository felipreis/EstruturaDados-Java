package EstruturaDados.Intrudoção;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo Nó 1");
        No<String> no2 = new No<>("conteudo Nó 2");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("conteudo Nó 3");

        no2.setProximoNo(no3);

        No<String> no4 = new No<>("conteudo Nó 4");

        no3.setProximoNo(no4);

        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getConteudo());



    }
}
