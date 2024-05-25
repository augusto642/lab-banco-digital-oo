package com.banco;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<String> listarClientes() {
        return contas.stream()
                     .map(conta -> conta.getCliente().getNome())
                     .distinct()
                     .collect(Collectors.toList());
    }
}
