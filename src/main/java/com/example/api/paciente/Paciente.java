package com.example.api.paciente;

import com.example.api.endereco.Endereco;
import com.example.api.medico.Especialidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "pacientes")
@Entity(name = "Paciente")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    @Embedded
    Endereco endereco;

    public Paciente(DadosCadastroPeciente paciente) {
      this.nome = paciente.nome();
      this.email = paciente.email();
      this.cpf = paciente.cpf();
      this.endereco = new Endereco(paciente.endereco());
    }

}
