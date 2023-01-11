package com.example.demo.empresa;

public record DadosAtualizacaoEmpresa(Long id,
                                      String nome,
                                      String fone,
                                      String endereco,
                                      String contato,
                                      String fone_contato,
                                      String email,
                                      String observacao
    ) {
}
