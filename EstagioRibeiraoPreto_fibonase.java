import java.util.Scanner;

public class EstagioRibeiraoPreto_fibonase {
	
	public static void main(String[] args) {
		
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
	        int numero = scanner.nextInt();

	        if (verificaFibonacci(numero)) {
	            System.out.println(numero + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println(numero + " não pertence à sequência de Fibonacci.");
	        }

	        scanner.close();
	    }

	    public static boolean verificaFibonacci(int numero) {
	        int a = 0, b = 1;

	        while (a <= numero) {
	            if (a == numero) {
	                return true;
	            }

	            int proximo = a + b;
	            a = b;
	            b = proximo;
	        }

	        return false;
	    }
	}

