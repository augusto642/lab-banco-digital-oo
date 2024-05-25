package com.banco;
public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        Banco banco = new Banco();
        banco.setNome("Meu Banco");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("Clientes do banco:");
        for (String cliente : banco.listarClientes()) {
            System.out.println(cliente);
        }

        Agencia agencia = new Agencia(1);
        agencia.adicionarConta(cc);
        agencia.adicionarConta(poupanca);

        System.out.println("Clientes da agência:");
        for (String cliente : agencia.listarClientes()) {
            System.out.println(cliente);
        }
    }
}
