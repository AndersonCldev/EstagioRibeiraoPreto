import java.util.Scanner;

public class EstagioRibeiraoPreto_CriarString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String stringInvertida = inverterString(entrada);

        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }

    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            // Troca os caracteres no início e no fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Move os índices para a próxima iteração
            inicio++;
            fim--;
        }

        // Cria uma nova string a partir do array de caracteres invertido
        return new String(caracteres);
    }

}
