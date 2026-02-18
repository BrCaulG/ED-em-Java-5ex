package conversorDeNotas;
import java.util.Scanner;

public class NotasDinheiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas50, notas20;
        System.out.println("Digite as notas:");
        int notas = sc.nextInt();
        notas50= notas/50;
        notas= notas%50;
        notas20= notas/20;
        notas=notas%20;
        notas = notas /10;
        System.out.println("notas 50: "+ notas50 +"\nnotas 20: "+notas20+ "\nnotas 10: "+ notas);

    }
}
