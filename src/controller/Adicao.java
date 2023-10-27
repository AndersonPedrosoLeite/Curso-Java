package controller;

import java.util.Scanner;

public class Adicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //classe Scanner , new Scanner instancia o objeto input na classe Scanner//

        int num1;
        int num2;
        int soma;
        System.out.println("Digite a primeira nota: ");
        num1 = input.nextInt();
        System.out.println("Digite a segunda nota: ");
        num2 = input.nextInt();
        soma = num1 + num2;
        System.out.println("A média das notas  é: " + soma);
        input.close();
        System.out.println(soma >= 6 ? "Aprovado" : "Reprovado");   //operador condicional : se soma for maior que 6 então aprovado senão reprovado//2
    }
}
