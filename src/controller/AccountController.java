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
        Account account1 =new Account("Janaína Green", 50.00);
        Account account2 =new Account("João Blue", -7.53);

        System.out.println("Saldo: " + account1.getName() + account1.getSaldo());
        System.out.println("Saldo: " + account2.getName() + account2.getSaldo());
        //cria um Scanner para obter entrada a partir da janela de comando//
        System.out.println("Digite o valor a ser depositado para conta 1: ");
        double depositaQuantia = input.nextDouble(); //obtem a entrada do usuário//
        System.out.println("Adicionando: " + depositaQuantia);
        account1.deposita(depositaQuantia);

        //exibe os saldos//
        System.out.println(" Saldo:  " + account1.getName() + "= " + account1.getSaldo());
        System.out.println(" Saldo:  " + account2.getName() + "= " + account2.getSaldo());

        System.out.println("Digite o valor a ser depositado para conta 2: ");
        double depositaQuantia2 = input.nextDouble(); //obtem a entrada do usuário em valor Double//
        System.out.println("Adicionando: " + depositaQuantia2);
        account2.deposita(depositaQuantia2);

        System.out.println(" Saldo:  " + account1.getName() + "= " + account1.getSaldo());
        System.out.println(" Saldo:  " + account2.getName() + "= " + account2.getSaldo());

    }
}

