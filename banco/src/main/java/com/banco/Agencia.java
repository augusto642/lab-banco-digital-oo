package com.banco;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Getter
@Setter
public class Agencia {
    private int numero;
    private List<Conta> contas;

    public Agencia(int numero) {
        this.numero = numero;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<String> listarClientes() {
        return (List<String>) contas.stream()
                     .map(conta -> conta.getCliente().getNome())
                     .distinct()
                     .collect(Collectors.toList());
    }
}
