package com.example.demo.empresa;

public record DadosListagemEmpresa(Long id, String nome, String fone, String Endereco) {

    public DadosListagemEmpresa(Empresa empresa){
        this(empresa.getId(), empresa.getNome(), empresa.getFone(), empresa.getEndereco());
    }
}
