package com.example.demo.empresa;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroEmpresa(
        @NotBlank
        String nome,
        @Email
        String email,
        String fone,
        String endereco,
        String contato,
        String fone_contato,
        String observacao
) {


}

