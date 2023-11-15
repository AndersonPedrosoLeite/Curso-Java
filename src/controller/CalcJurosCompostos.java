package controller;
/* a = p(1+r)^n
   p é a quantia original investida(principal)
   r é a taxa de juros anual(0,05% para 5%)
   n é o número de anos
   a é a quantia em depósito no fim do n-ésimo ano.
*/

public class CalcJurosCompostos {
    public static void main(String[] args) {
        double amount; //quantia em depósito ao fim de cada ano
        double principal = 1000.0; // quantia inicial antes dos juros
        double rate = 0.05; // taxa de juros
        System.out.println("Ano " + " Quantia em depósito");
        //calcula a quantidade de depósito para cada um dos dez anos
        for (int year = 1; year<= 10; ++year){
            amount = principal * Math.pow(1.0 + rate,year);
            System.out.println("Ano: " + year + " Valor do rendimento: " + amount);
        }
    }

}
