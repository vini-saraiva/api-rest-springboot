package com.example.api.controller;

import com.example.api.domain.paciente.DadosCadastroPeciente;
import com.example.api.domain.paciente.Paciente;
import com.example.api.domain.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")



public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void CadastrarPaciente(@RequestBody DadosCadastroPeciente paciente){

      repository.save(new Paciente(paciente));
    }
}
