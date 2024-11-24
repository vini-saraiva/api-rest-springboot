package com.example.api.paciente;

import com.example.api.endereco.DadosEndereco;
import com.example.api.medico.Especialidade;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPeciente(
        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String cpf,

        @NotNull
        DadosEndereco endereco) {

}
