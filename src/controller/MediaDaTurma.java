package controller;
import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int contadorNotas = 1;

        while (contadorNotas <= 10)
        {
            System.out.println("Digite a nota: ");
            int nota = input.nextInt();
            total = total + nota ;
            contadorNotas = contadorNotas + 1;
        }
        int media = total / 10;
        System.out.println(" O total de todas as notas é " + total);
        System.out.println(" A média da turma é " + media);
    }

}
