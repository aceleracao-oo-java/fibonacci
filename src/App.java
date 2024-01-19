import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro maior que zero: ");

        int numero = scanner.nextInt();
        while (numero <= 0) {
            System.out.println("Número valido, por favor, digite um número inteiro maior que zero: ");
            numero = scanner.nextInt();
        }

        scanner.close();

        // Cria a lista que guarda a sequencia
        List<Integer> fibonacci = new ArrayList<>();

        for (int i = 0; i < numero; i++) {
            // Os dois primeiros termos da sequencia são 0 e 1
            if (i == 0) {
                fibonacci.add(0);
            } else if (i == 1) {
                fibonacci.add(1);
            } else {
                // Do terceiro termo em diante, soma os dois termos anteriores para definir o valor do 3o termo
                int addedValue = fibonacci.get(i - 2) + fibonacci.get(i - 1);
                fibonacci.add(addedValue);
            }
        }

        System.out.println(fibonacci);
    }
}
