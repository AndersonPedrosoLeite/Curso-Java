package controller;
import model.Account;

import  java.util.Scanner;
public class AccountController{
    public static void main(String[] args) { // método static é especial, porque você pode chamá-lo sem antes criar um objeto da classe na qual esse método é declarado, ele é essencial para o método main//
        Scanner input = new Scanner(System.in);

        Account minhaConta = new Account();  // a palavra new instancia um novo objeto da Account no caso o objeto minhaConta//
        System.out.println("Por favor digite seu nome: ");
        String oNome = input.nextLine();   //lê os caracteres incluindo o espaço em branco
        minhaConta.setName(oNome); // insere theName
        System.out.println();

        System.out.println("Nome da conta: ");
        System.out.println(minhaConta.getName());
    }
}

