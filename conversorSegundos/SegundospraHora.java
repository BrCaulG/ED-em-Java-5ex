package conversorSegundos;
import java.util.Scanner;


public class SegundospraHora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int horas, minutos;
        System.out.println("Digite os segundos para a conversao: ");
        int segundos = sc.nextInt();
        horas=segundos/3600;
        segundos= segundos%3600;
        minutos= segundos/60;
        segundos= segundos%60;
        System.out.println(horas + " horas "+ minutos + " minutos "+segundos+ " segundos ");


    }

}
