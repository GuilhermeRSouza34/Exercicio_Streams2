import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltrarMulheres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listaNomes = new ArrayList<>();

        System.out.println("Digite os nomes e gêneros (ex: Maria - Feminino, Pedro - Masculino).");
        System.out.println("Pressione Enter para finalizar a entrada.");

        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            listaNomes.add(input);
        }

        List<String> mulheres = listaNomes.stream()
                .filter(nome -> nome.toLowerCase().contains("feminino"))
                .collect(Collectors.toList());

        System.out.println("Lista de Mulheres: " + mulheres);

        scanner.close();
    }
}