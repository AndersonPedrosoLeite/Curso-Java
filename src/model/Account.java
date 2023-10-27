package model;

public class Account {
    private String name; // variável de instância ou atributo
    // private e public são modificadores de acesso
    private double saldo;

    public Account(String name, double saldo) {
        this.name = name;
        if (saldo > 0.0)
        this.saldo = saldo;
    }

    public Account() {

    }
    public void deposita(double depositaQuantia){
        if (depositaQuantia > 0.0)
            saldo = saldo + depositaQuantia;
    }
    public double getSaldo(){
        return saldo;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
