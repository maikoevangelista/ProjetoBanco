package com.java;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.50;
        contaCorrente.cliente.nome  =  "Maiko";
        contaCorrente.cliente.idade = 27;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "fulano";
        contaPoupanca.cliente.idade = 40;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 40;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);

    }
}
