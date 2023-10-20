import java.util.Scanner;

public class Adicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //classe Scanner , new Scanner instancia o objeto input na classe Scanner//

        int num1;
        int num2;
        int soma;
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();
        soma = num1 + num2;
        System.out.println("A soma dos dois números é: " + soma);
        input.close();
    }
}
