package controller;
import javax.swing.JOptionPane;
public class CaixaDialogoController {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual seu nome? ");
        //cria mensagem//
        String mensagem = String.format("Bem vindo " + name + " à programação Jva!");
        JOptionPane.showConfirmDialog(null,mensagem);
    }
}
