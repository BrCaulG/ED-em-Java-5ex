package numeros;
import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[200];
        int i = 0;
        int repetido = 0;

        System.out.print("Digite os numeros inteiros ou qualquer tecla pra parar: ");

        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            numeros[i] = numero;
            i++;
            if (i >= 200) break;
        }

        for (int a = 0; a < i; a++) {
            for (int j = a + 1; j < i; j++) {
                if (numeros[a] == numeros[j]) {
                    repetido = 1;
                    break;
                }
            }
            if (repetido == 1) break;
        }

        if (repetido == 1) {
            System.out.println("Ha numeros repetidos na lista.");
        } else {
            System.out.println("Todos os elementos sao unicos.");
        }


    }
}
