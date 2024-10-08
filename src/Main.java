import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ','");
        String inputNomes = scanner.nextLine();

        String[] arrayDeNomes = inputNomes.split(",");
        List<String> nomes = new ArrayList<>(Arrays.asList(arrayDeNomes));

        nomes.replaceAll(String::trim);
        Collections.sort(nomes);

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}