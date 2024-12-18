package com.example.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.uf = endereco.uf();
        this.cidade = endereco.cidade();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();

    }

    public void atualizarInformacoes(DadosEndereco endereco) {

        if(this.logradouro!=null) {
            this.logradouro = endereco.logradouro();
        }
        if(this.bairro!=null) {
            this.bairro = endereco.bairro();
        }
        if(this.cep!=null) {
            this.cep = endereco.cep();
        }
        if(this.uf!=null) {
            this.uf = endereco.uf();
        }
        if(this.cidade!=null) {
            this.cidade = endereco.cidade();
        }
        if(this.numero!=null) {
            this.numero = endereco.numero();
        }
        if(this.complemento!=null) {
            this.complemento = endereco.complemento();
        }
    }
}
