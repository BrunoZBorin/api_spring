package com.example.demo.empresa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "empresas")
@Entity(name = "Empresa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Empresa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String fone;
    private String endereco;
    private String contato;
    private String fone_contato;
    private String observacao;

    public Empresa(DadosCadastroEmpresa dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.endereco = dados.endereco();
        this.contato = dados.contato();
        this.fone_contato = dados.fone_contato();
        this.observacao = dados.observacao();
        this.fone = dados.fone();
    }

    public void atualizarInformacoes(DadosAtualizacaoEmpresa dados) {
        if(dados.nome() != null)
        {
            this.nome = dados.nome();
        }
        if(dados.endereco() != null)
        {
            this.endereco = dados.endereco();
        }
        if(dados.fone() != null)
        {
            this.fone = dados.fone();
        }
        if(dados.contato() != null)
        {
            this.contato = dados.contato();
        }
        if(dados.fone_contato() != null)
        {
            this.fone_contato = dados.fone_contato();
        }
        if(dados.email() != null)
        {
            this.email = dados.email();
        }
        if(dados.observacao() != null)
        {
            this.observacao = dados.observacao();
        }
    }
}
