package controller;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; //declara e inicia a variavel
        int counter2 = 1;
        while(counter <= 10){ //condição de continuação do loop
            System.out.print(counter + " ");
            ++counter ; //variável de controle de incremento;
        }
        System.out.println();
        for (counter2 =1; counter2 <= 20; counter2++){
            System.out.print(counter2 + " ");
        }
            System.out.println();
    }
}
